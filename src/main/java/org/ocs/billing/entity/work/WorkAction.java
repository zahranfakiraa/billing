package org.ocs.billing.entity.work;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.ocs.billing.entity.action.ActionAcmAdd;
import org.ocs.billing.entity.action.ActionPrice;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="work_action")
@NamedQuery(name="WorkAction.findAll", query="SELECT w FROM WorkAction w")
public class WorkAction implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="work_action_id", unique=true, nullable=false, precision=12)
	private long workActionId;

	@Column(length=120)
	private String comments;

	@Column(name="exec_seq", nullable=false, precision=3)
	private BigDecimal execSeq;

	@Column(length=512)
	private String position;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="work_action_name", length=120)
	private String workActionName;

	@Column(name="work_action_type", nullable=false, length=30)
	private String workActionType;

	// //bi-directional many-to-one association to ActionAcmAdd
	@OneToMany(mappedBy="workAction")
	private List<ActionAcmAdd> actionAcmAdds;

	// //bi-directional many-to-one association to ActionPrice
	@OneToMany(mappedBy="workAction")
	private List<ActionPrice> actionPrices;

	//bi-directional many-to-one association to WorkNode
	@ManyToOne
	@JoinColumn(name="work_node_id")
	private WorkNode workNode;

	public WorkAction() {
	}

    public ActionAcmAdd addActionAcmAdd(ActionAcmAdd actionAcmAdd) {
		getActionAcmAdds().add(actionAcmAdd);
		actionAcmAdd.setWorkAction(this);

		return actionAcmAdd;
	}

	public ActionAcmAdd removeActionAcmAdd(ActionAcmAdd actionAcmAdd) {
		getActionAcmAdds().remove(actionAcmAdd);
		actionAcmAdd.setWorkAction(null);

		return actionAcmAdd;
	}

    public ActionPrice addActionPrice(ActionPrice actionPrice) {
		getActionPrices().add(actionPrice);
		actionPrice.setWorkAction(this);

		return actionPrice;
	}

	public ActionPrice removeActionPrice(ActionPrice actionPrice) {
		getActionPrices().remove(actionPrice);
		actionPrice.setWorkAction(null);

		return actionPrice;
	}

}
