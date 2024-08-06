package org.ocs.billing.entity.cond;


import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class CondRulePK implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="cond_base_id", insertable=false, updatable=false, unique=true, nullable=false, precision=12)
	private long condBaseId;

	@Column(unique=true, nullable=false, precision=6)
	private long seq;

	public CondRulePK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CondRulePK)) {
			return false;
		}
		CondRulePK castOther = (CondRulePK)other;
		return 
			(this.condBaseId == castOther.condBaseId)
			&& (this.seq == castOther.seq);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.condBaseId ^ (this.condBaseId >>> 32)));
		hash = hash * prime + ((int) (this.seq ^ (this.seq >>> 32)));
		
		return hash;
	}
}
