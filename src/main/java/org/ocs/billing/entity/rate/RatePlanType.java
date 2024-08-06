package org.ocs.billing.entity.rate;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="rate_plan_type")
@NamedQuery(name="RatePlanType.findAll", query="SELECT r FROM RatePlanType r")
public class RatePlanType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rate_plan_type", unique=true, nullable=false, length=1)
	private String ratePlanType;

	@Column(length=1000)
	private String comments;

	@Column(name="rate_plan_type_name", nullable=false, length=120)
	private String ratePlanTypeName;

	//bi-directional many-to-one association to RatePlan
	@OneToMany(mappedBy="ratePlanTypeBean")
	private List<RatePlan> ratePlans;

	public RatePlanType() {
	}

    public RatePlan addRatePlan(RatePlan ratePlan) {
		getRatePlans().add(ratePlan);
		ratePlan.setRatePlanTypeBean(this);

		return ratePlan;
	}

	public RatePlan removeRatePlan(RatePlan ratePlan) {
		getRatePlans().remove(ratePlan);
		ratePlan.setRatePlanTypeBean(null);

		return ratePlan;
	}

}
