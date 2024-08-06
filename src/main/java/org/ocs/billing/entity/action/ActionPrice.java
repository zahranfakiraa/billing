package org.ocs.billing.entity.action;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.work.WorkAction;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="action_price")
@NamedQuery(name="ActionPrice.findAll", query="SELECT a FROM ActionPrice a")
public class ActionPrice implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="action_price_id", unique=true, nullable=false, precision=12)
	private long actionPriceId;

	@Column(length=120)
	private String comments;

	@Column(name="con_res_id", precision=9)
	private BigDecimal conResId;

	@Column(name="min_rum", precision=12)
	private BigDecimal minRum;

	@Column(name="overlap_flag", length=1)
	private String overlapFlag;

	@Column(name="re_attr", precision=6)
	private BigDecimal reAttr;

	@Column(name="ref_value_id", precision=9)
	private BigDecimal refValueId;

	@Column(nullable=false, precision=12)
	private BigDecimal rum;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to WorkAction
	@ManyToOne
	@JoinColumn(name="work_action_id")
	private WorkAction workAction;

	public ActionPrice() {
	}

}
