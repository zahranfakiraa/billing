package org.ocs.billing.entity.offer;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class OfferCatgMemPK implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="offer_catg_id", unique=true, nullable=false, precision=9)
	private long offerCatgId;

	@Column(name="offer_id", unique=true, nullable=false, precision=9)
	private long offerId;

	public OfferCatgMemPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OfferCatgMemPK)) {
			return false;
		}
		OfferCatgMemPK castOther = (OfferCatgMemPK)other;
		return 
			(this.offerCatgId == castOther.offerCatgId)
			&& (this.offerId == castOther.offerId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.offerCatgId ^ (this.offerCatgId >>> 32)));
		hash = hash * prime + ((int) (this.offerId ^ (this.offerId >>> 32)));
		
		return hash;
	}
}
