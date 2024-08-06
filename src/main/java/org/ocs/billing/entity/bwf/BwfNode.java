package org.ocs.billing.entity.bwf;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bwf_node")
@NamedQuery(name="BwfNode.findAll", query="SELECT b FROM BwfNode b")
public class BwfNode implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="node_id", unique=true, nullable=false, precision=6)
	private long nodeId;

	@Column(name="first_node", nullable=false, length=1)
	private String firstNode;

	@Column(name="node_name", nullable=false, length=60)
	private String nodeName;

	@Column(precision=6)
	private BigDecimal priority;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to BwfWorkflow
	@ManyToOne
	@JoinColumn(name="workflow_id")
	private BwfWorkflow bwfWorkflow;

	//bi-directional many-to-one association to BwfStep
	@OneToMany(mappedBy="bwfNode1")
	private List<BwfStep> bwfSteps1;

	//bi-directional many-to-one association to BwfStep
	@OneToMany(mappedBy="bwfNode2")
	private List<BwfStep> bwfSteps2;

	public BwfNode() {
	}

    public BwfStep addBwfSteps1(BwfStep bwfSteps1) {
		getBwfSteps1().add(bwfSteps1);
		bwfSteps1.setBwfNode1(this);

		return bwfSteps1;
	}

	public BwfStep removeBwfSteps1(BwfStep bwfSteps1) {
		getBwfSteps1().remove(bwfSteps1);
		bwfSteps1.setBwfNode1(null);

		return bwfSteps1;
	}

    public BwfStep addBwfSteps2(BwfStep bwfSteps2) {
		getBwfSteps2().add(bwfSteps2);
		bwfSteps2.setBwfNode2(this);

		return bwfSteps2;
	}

	public BwfStep removeBwfSteps2(BwfStep bwfSteps2) {
		getBwfSteps2().remove(bwfSteps2);
		bwfSteps2.setBwfNode2(null);

		return bwfSteps2;
	}


}
