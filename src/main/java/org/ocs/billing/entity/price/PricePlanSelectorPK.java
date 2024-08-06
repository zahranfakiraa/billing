package org.ocs.billing.entity.price;


import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class PricePlanSelectorPK implements Serializable{

    //default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="indep_prod_spec_id", unique=true, nullable=false, precision=6)
	private long indepProdSpecId;

	@Column(name="price_plan_id", unique=true, nullable=false, precision=6)
	private long pricePlanId;

	public PricePlanSelectorPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PricePlanSelectorPK)) {
			return false;
		}
		PricePlanSelectorPK castOther = (PricePlanSelectorPK)other;
		return 
			(this.indepProdSpecId == castOther.indepProdSpecId)
			&& (this.pricePlanId == castOther.pricePlanId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.indepProdSpecId ^ (this.indepProdSpecId >>> 32)));
		hash = hash * prime + ((int) (this.pricePlanId ^ (this.pricePlanId >>> 32)));
		
		return hash;
	}
}
