package org.ocs.billing.entity.mapping;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class MappingUnitPK implements Serializable {
    private static final long serialVersionUID = 1L;

	@Column(name="mapping_id", insertable=false, updatable=false, unique=true, nullable=false, precision=9)
	private long mappingId;

	@Column(name="rate_plan_zone_id", insertable=false, updatable=false, unique=true, nullable=false, precision=9)
	private long ratePlanZoneId;

	public MappingUnitPK() {
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MappingUnitPK)) {
			return false;
		}
		MappingUnitPK castOther = (MappingUnitPK)other;
		return 
			(this.mappingId == castOther.mappingId)
			&& (this.ratePlanZoneId == castOther.ratePlanZoneId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.mappingId ^ (this.mappingId >>> 32)));
		hash = hash * prime + ((int) (this.ratePlanZoneId ^ (this.ratePlanZoneId >>> 32)));
		
		return hash;
	}
}
