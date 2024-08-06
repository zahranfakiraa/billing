package org.ocs.billing.entity.price;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class PricePlanMemberPK implements Serializable {

    //default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="price_plan_ver_id", insertable=false, updatable=false, unique=true, nullable=false, precision=9)
	private long pricePlanVerId;

	@Column(name="price_set_id", unique=true, nullable=false, precision=9)
	private long priceSetId;

	public PricePlanMemberPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PricePlanMemberPK)) {
			return false;
		}
		PricePlanMemberPK castOther = (PricePlanMemberPK)other;
		return 
			(this.pricePlanVerId == castOther.pricePlanVerId)
			&& (this.priceSetId == castOther.priceSetId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.pricePlanVerId ^ (this.pricePlanVerId >>> 32)));
		hash = hash * prime + ((int) (this.priceSetId ^ (this.priceSetId >>> 32)));
		
		return hash;
	}
}
