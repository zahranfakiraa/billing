package org.ocs.billing.entity.bwf;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.ocs.billing.entity.reserve.ReservePolicy;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bwf_workflow")
@NamedQuery(name="BwfWorkflow.findAll", query="SELECT b FROM BwfWorkflow b")
public class BwfWorkflow implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="workflow_id", unique=true, nullable=false, precision=6)
	private long workflowId;

	@Column(length=120)
	private String comments;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="work_state", length=1)
	private String workState;

	@Column(name="workflow_name", nullable=false, length=60)
	private String workflowName;

	@Column(name="workflow_type", nullable=false, length=1)
	private String workflowType;

	//bi-directional many-to-one association to BwfNode
	@OneToMany(mappedBy="bwfWorkflow")
	private List<BwfNode> bwfNodes;

	//bi-directional many-to-one association to ReservePolicy
	@OneToMany(mappedBy="bwfWorkflow")
	private List<ReservePolicy> reservePolicies;

	public BwfWorkflow() {
	}

    public BwfNode addBwfNode(BwfNode bwfNode) {
		getBwfNodes().add(bwfNode);
		bwfNode.setBwfWorkflow(this);

		return bwfNode;
	}

	public BwfNode removeBwfNode(BwfNode bwfNode) {
		getBwfNodes().remove(bwfNode);
		bwfNode.setBwfWorkflow(null);

		return bwfNode;
	}

    public ReservePolicy addReservePolicy(ReservePolicy reservePolicy) {
		getReservePolicies().add(reservePolicy);
		reservePolicy.setBwfWorkflow(this);

		return reservePolicy;
	}

	public ReservePolicy removeReservePolicy(ReservePolicy reservePolicy) {
		getReservePolicies().remove(reservePolicy);
		reservePolicy.setBwfWorkflow(null);

		return reservePolicy;
	}

}
