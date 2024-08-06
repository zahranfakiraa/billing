package org.ocs.billing.entity.price;


import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class PricePlanRelaPK implements Serializable {
    
    //default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="src_price_plan_id", unique=true, nullable=false, precision=6)
	private long srcPricePlanId;

	@Column(name="obj_price_plan_id", unique=true, nullable=false, precision=6)
	private long objPricePlanId;

	public PricePlanRelaPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PricePlanRelaPK)) {
			return false;
		}
		PricePlanRelaPK castOther = (PricePlanRelaPK)other;
		return 
			(this.srcPricePlanId == castOther.srcPricePlanId)
			&& (this.objPricePlanId == castOther.objPricePlanId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.srcPricePlanId ^ (this.srcPricePlanId >>> 32)));
		hash = hash * prime + ((int) (this.objPricePlanId ^ (this.objPricePlanId >>> 32)));
		
		return hash;
	}
}
