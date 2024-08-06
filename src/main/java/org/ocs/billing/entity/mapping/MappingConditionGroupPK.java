package org.ocs.billing.entity.mapping;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class MappingConditionGroupPK implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="mapping_id", insertable=false, updatable=false, unique=true, nullable=false, precision=9)
	private long mappingId;

	@Column(name="grp_id", unique=true, nullable=false, precision=3)
	private long grpId;

	@Column(name="seq_no", unique=true, nullable=false, precision=3)
	private long seqNo;

	public MappingConditionGroupPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MappingConditionGroupPK)) {
			return false;
		}
		MappingConditionGroupPK castOther = (MappingConditionGroupPK)other;
		return 
			(this.mappingId == castOther.mappingId)
			&& (this.grpId == castOther.grpId)
			&& (this.seqNo == castOther.seqNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.mappingId ^ (this.mappingId >>> 32)));
		hash = hash * prime + ((int) (this.grpId ^ (this.grpId >>> 32)));
		hash = hash * prime + ((int) (this.seqNo ^ (this.seqNo >>> 32)));
		
		return hash;
	}
}
