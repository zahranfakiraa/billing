package org.ocs.billing.entity.defaultt;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class DefaultPricePlanGroupPK implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="bundle_unit_id", unique=true, nullable=false, precision=6)
	private long bundleUnitId;

	@Column(name="price_plan_id", unique=true, nullable=false, precision=6)
	private long pricePlanId;

	public DefaultPricePlanGroupPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DefaultPricePlanGroupPK)) {
			return false;
		}
		DefaultPricePlanGroupPK castOther = (DefaultPricePlanGroupPK)other;
		return 
			(this.bundleUnitId == castOther.bundleUnitId)
			&& (this.pricePlanId == castOther.pricePlanId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.bundleUnitId ^ (this.bundleUnitId >>> 32)));
		hash = hash * prime + ((int) (this.pricePlanId ^ (this.pricePlanId >>> 32)));
		
		return hash;
	}
}
