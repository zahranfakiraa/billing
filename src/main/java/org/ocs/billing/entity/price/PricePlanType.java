package org.ocs.billing.entity.price;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_plan_type")
@NamedQuery(name="PricePlanType.findAll", query="SELECT p FROM PricePlanType p")
public class PricePlanType implements Serializable{
    
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_plan_type", unique=true, nullable=false, length=1)
	private String pricePlanType;

	@Column(name="choose_genre", length=60)
	private String chooseGenre;

	@Column(length=1000)
	private String comments;

	@Column(name="price_plan_type_name", nullable=false, length=120)
	private String pricePlanTypeName;

	//bi-directional many-to-one association to PricePlan
	@OneToMany(mappedBy="pricePlanTypeBean")
	private List<PricePlan> pricePlans;

	public PricePlanType() {
	}

    public PricePlan addPricePlan(PricePlan pricePlan) {
		getPricePlans().add(pricePlan);
		pricePlan.setPricePlanTypeBean(this);

		return pricePlan;
	}

	public PricePlan removePricePlan(PricePlan pricePlan) {
		getPricePlans().remove(pricePlan);
		pricePlan.setPricePlanTypeBean(null);

		return pricePlan;
	}
}
