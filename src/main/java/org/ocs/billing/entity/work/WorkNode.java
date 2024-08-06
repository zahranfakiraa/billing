package org.ocs.billing.entity.work;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.ocs.billing.entity.price.PriceWorkNode;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="work_node")
@NamedQuery(name="WorkNode.findAll", query="SELECT w FROM WorkNode w")
public class WorkNode implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="work_node_id", unique=true, nullable=false, precision=12)
	private long workNodeId;

	@Column(length=120)
	private String comments;

	@Column(name="first_work_node_id", precision=12)
	private BigDecimal firstWorkNodeId;

	@Column(name="is_first_node", length=1)
	private String isFirstNode;

	@Column(length=512)
	private String position;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="work_next_node_id", precision=12)
	private BigDecimal workNextNodeId;

	@Column(name="work_node_name", nullable=false, length=60)
	private String workNodeName;

	@Column(name="work_node_type", nullable=false, length=1)
	private String workNodeType;

	//bi-directional many-to-one association to PriceWorkNode
	@OneToMany(mappedBy="workNode")
	private List<PriceWorkNode> priceWorkNodes;

    //bi-directional many-to-one association to WorkAction
	@OneToMany(mappedBy="workNode")
	private List<WorkAction> workActions;

	//bi-directional many-to-one association to WorkCondition
	@OneToMany(mappedBy="workNode1")
	private List<WorkCondition> workConditions1;

	//bi-directional many-to-one association to WorkCondition
	@OneToMany(mappedBy="workNode2")
	private List<WorkCondition> workConditions2;

    public PriceWorkNode addPriceWorkNode(PriceWorkNode priceWorkNode) {
		getPriceWorkNodes().add(priceWorkNode);
		priceWorkNode.setWorkNode(this);

		return priceWorkNode;
	}

	public PriceWorkNode removePriceWorkNode(PriceWorkNode priceWorkNode) {
		getPriceWorkNodes().remove(priceWorkNode);
		priceWorkNode.setWorkNode(null);

		return priceWorkNode;
	}

    public WorkCondition addWorkConditions1(WorkCondition workConditions1) {
		getWorkConditions1().add(workConditions1);
		workConditions1.setWorkNode1(this);

		return workConditions1;
	}

	public WorkCondition removeWorkConditions1(WorkCondition workConditions1) {
		getWorkConditions1().remove(workConditions1);
		workConditions1.setWorkNode1(null);

		return workConditions1;
	}

    public WorkCondition addWorkConditions2(WorkCondition workConditions2) {
		getWorkConditions2().add(workConditions2);
		workConditions2.setWorkNode2(this);

		return workConditions2;
	}

	public WorkCondition removeWorkConditions2(WorkCondition workConditions2) {
		getWorkConditions2().remove(workConditions2);
		workConditions2.setWorkNode2(null);

		return workConditions2;
	}
}
