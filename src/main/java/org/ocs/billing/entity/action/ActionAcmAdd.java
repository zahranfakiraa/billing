package org.ocs.billing.entity.action;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.work.WorkAction;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="action_acm_add")
@NamedQuery(name="ActionAcmAdd.findAll", query="SELECT a FROM ActionAcmAdd a")
public class ActionAcmAdd implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="action_acm_add_id", unique=true, nullable=false, precision=12)
	private long actionAcmAddId;

	@Column(length=120)
	private String comments;

	@Column(name="ref_resource_id", precision=9)
	private BigDecimal refResourceId;

	@Column(name="ref_value_id", precision=9)
	private BigDecimal refValueId;

	@Column(precision=12)
	private BigDecimal rum;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to WorkAction
	@ManyToOne
	@JoinColumn(name="work_action_id")
	private WorkAction workAction;

    public ActionAcmAdd() {
    }

    

}
