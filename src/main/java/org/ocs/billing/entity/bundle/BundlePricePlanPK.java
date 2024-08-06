package org.ocs.billing.entity.bundle;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class BundlePricePlanPK implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="group_id", unique=true, nullable=false, precision=6)
	private long groupId;

	@Column(name="price_plan_id", unique=true, nullable=false, precision=6)
	private long pricePlanId;

	public BundlePricePlanPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BundlePricePlanPK)) {
			return false;
		}
		BundlePricePlanPK castOther = (BundlePricePlanPK)other;
		return 
			(this.groupId == castOther.groupId)
			&& (this.pricePlanId == castOther.pricePlanId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.groupId ^ (this.groupId >>> 32)));
		hash = hash * prime + ((int) (this.pricePlanId ^ (this.pricePlanId >>> 32)));
		
		return hash;
	}
}
