package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="ab_event_benefit", indexes ={@Index(name = "ak_key_2_ab_event",  columnList="bal_event_inst_id", unique =false),
        @Index(name = "pk_ab_event_benefit", columnList="acct_book_id,part_id", unique = true)})
@NamedQuery(name="AbEventBenefit.findAll", query="SELECT a FROM AbEventBenefit a")
public class AbEventBenefit implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="acct_book_id", nullable=false, precision=15)
	private BigDecimal acctBookId;

	@Column(name="bal_event_inst_id", nullable=false, precision=15)
	private BigDecimal balEventInstId;

	@Column(name="benefit_rule_code", length=1000)
	private String benefitRuleCode;

	@Column(name="part_id", nullable=false, precision=6)
	private BigDecimal partId;

	@Column(name="price_plan_id", precision=6)
	private BigDecimal pricePlanId;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public AbEventBenefit() {
	}

}
