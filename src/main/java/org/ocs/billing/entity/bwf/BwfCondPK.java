package org.ocs.billing.entity.bwf;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class BwfCondPK implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="cond_group_id", insertable=false, updatable=false, unique=true, nullable=false, precision=6)
	private long condGroupId;

	@Column(unique=true, nullable=false, precision=6)
	private long seq;

	public BwfCondPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BwfCondPK)) {
			return false;
		}
		BwfCondPK castOther = (BwfCondPK)other;
		return 
			(this.condGroupId == castOther.condGroupId)
			&& (this.seq == castOther.seq);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.condGroupId ^ (this.condGroupId >>> 32)));
		hash = hash * prime + ((int) (this.seq ^ (this.seq >>> 32)));
		
		return hash;
	}
}
