package org.ocs.billing.entity.bwf;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class BwfActionPK implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="step_id", insertable=false, updatable=false, unique=true, nullable=false, precision=6)
	private long stepId;

	@Column(unique=true, nullable=false, precision=6)
	private long seq;

	public BwfActionPK() {
	}


	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BwfActionPK)) {
			return false;
		}
		BwfActionPK castOther = (BwfActionPK)other;
		return 
			(this.stepId == castOther.stepId)
			&& (this.seq == castOther.seq);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.stepId ^ (this.stepId >>> 32)));
		hash = hash * prime + ((int) (this.seq ^ (this.seq >>> 32)));
		
		return hash;
	}
}
