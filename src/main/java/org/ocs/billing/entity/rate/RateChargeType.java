package org.ocs.billing.entity.rate;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="rate_charge_type")
@NamedQuery(name="RateChargeType.findAll", query="SELECT r FROM RateChargeType r")
public class RateChargeType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="rate_charge_type", unique=true, nullable=false, length=1)
	private String rateChargeType;

	@Column(length=1000)
	private String comments;

	@Column(name="type_name", nullable=false, length=120)
	private String typeName;

	//bi-directional many-to-one association to RatePlan
	@OneToMany(mappedBy="rateChargeTypeBean")
	private List<RatePlan> ratePlans;

	public RateChargeType() {
	}

    public RatePlan addRatePlan(RatePlan ratePlan) {
		getRatePlans().add(ratePlan);
		ratePlan.setRateChargeTypeBean(this);

		return ratePlan;
	}

	public RatePlan removeRatePlan(RatePlan ratePlan) {
		getRatePlans().remove(ratePlan);
		ratePlan.setRateChargeTypeBean(null);

		return ratePlan;
	}
}
