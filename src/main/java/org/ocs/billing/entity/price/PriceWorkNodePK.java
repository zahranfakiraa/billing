package org.ocs.billing.entity.price;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class PriceWorkNodePK {
    
    @Column(name="price_id", insertable=false, updatable=false, unique=true, nullable=false, precision=9)
	private long priceId;

	@Column(unique=true, nullable=false, precision=3)
	private long seq;

	public PriceWorkNodePK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PriceWorkNodePK)) {
			return false;
		}
		PriceWorkNodePK castOther = (PriceWorkNodePK)other;
		return 
			(this.priceId == castOther.priceId)
			&& (this.seq == castOther.seq);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.priceId ^ (this.priceId >>> 32)));
		hash = hash * prime + ((int) (this.seq ^ (this.seq >>> 32)));
		
		return hash;
	}
}
