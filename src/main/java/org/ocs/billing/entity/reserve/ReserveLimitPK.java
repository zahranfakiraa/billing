package org.ocs.billing.entity.reserve;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class ReserveLimitPK implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="re_id", unique=true, nullable=false, precision=9)
	private long reId;

	@Column(name="re_attr", unique=true, nullable=false, precision=6)
	private long reAttr;

	public ReserveLimitPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ReserveLimitPK)) {
			return false;
		}
		ReserveLimitPK castOther = (ReserveLimitPK)other;
		return 
			(this.reId == castOther.reId)
			&& (this.reAttr == castOther.reAttr);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.reId ^ (this.reId >>> 32)));
		hash = hash * prime + ((int) (this.reAttr ^ (this.reAttr >>> 32)));
		
		return hash;
	}
}
