package org.ocs.billing.entity.mapping;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class MappingConditionActionPK implements Serializable {
    private static final long serialVersionUID = 1L;

	@Column(name="mapping_id", insertable=false, updatable=false, unique=true, nullable=false, precision=9)
	private long mappingId;

	@Column(unique=true, nullable=false, precision=6)
	private long seq;

	public MappingConditionActionPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MappingConditionActionPK)) {
			return false;
		}
		MappingConditionActionPK castOther = (MappingConditionActionPK)other;
		return 
			(this.mappingId == castOther.mappingId)
			&& (this.seq == castOther.seq);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.mappingId ^ (this.mappingId >>> 32)));
		hash = hash * prime + ((int) (this.seq ^ (this.seq >>> 32)));
		
		return hash;
	}
}
