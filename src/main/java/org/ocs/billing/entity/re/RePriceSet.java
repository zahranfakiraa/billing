package org.ocs.billing.entity.re;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.ocs.billing.entity.rate.RatePlan;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="re_price_set")
@NamedQuery(name="RePriceSet.findAll", query="SELECT r FROM RePriceSet r")
public class RePriceSet implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="re_price_set_id", unique=true, nullable=false, precision=9)
	private long rePriceSetId;

	@Column(name="highest_priority", length=1)
	private String highestPriority;

	@Column(length=4000)
	private String param;

	@Column(name="post_workflow_id", precision=6)
	private BigDecimal postWorkflowId;

	@Column(name="price_set_id", nullable=false, precision=9)
	private BigDecimal priceSetId;

	@Column(name="re_id", nullable=false, precision=9)
	private BigDecimal reId;

	@Column(name="rule_comments", length=1000)
	private String ruleComments;

	@Column(name="rule_script", length=2147483647)
	private String ruleScript;

	@Column(name="script_page", length=2147483647)
	private String scriptPage;

	@Column(name="script_templet_id", precision=6)
	private BigDecimal scriptTempletId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="workflow_id", precision=6)
	private BigDecimal workflowId;

	// //bi-directional many-to-one association to RatePlan
	@OneToMany(mappedBy="rePriceSet")
	private List<RatePlan> ratePlans;

	public RePriceSet() {
	}

    public RatePlan addRatePlan(RatePlan ratePlan) {
		getRatePlans().add(ratePlan);
		ratePlan.setRePriceSet(this);

		return ratePlan;
	}

	public RatePlan removeRatePlan(RatePlan ratePlan) {
		getRatePlans().remove(ratePlan);
		ratePlan.setRePriceSet(null);

		return ratePlan;
	}

}
