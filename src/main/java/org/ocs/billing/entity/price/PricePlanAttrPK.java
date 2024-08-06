package org.ocs.billing.entity.price;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class PricePlanAttrPK implements Serializable {
    //default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="price_plan_id", unique=true, nullable=false, precision=6)
	private long pricePlanId;

	@Column(name="attr_id", unique=true, nullable=false, precision=9)
	private long attrId;

	public PricePlanAttrPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PricePlanAttrPK)) {
			return false;
		}
		PricePlanAttrPK castOther = (PricePlanAttrPK)other;
		return 
			(this.pricePlanId == castOther.pricePlanId)
			&& (this.attrId == castOther.attrId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.pricePlanId ^ (this.pricePlanId >>> 32)));
		hash = hash * prime + ((int) (this.attrId ^ (this.attrId >>> 32)));
		
		return hash;
	}
}
