package org.ocs.billing.entity.attr;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class AttrValuePK implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="base_attr_id", unique=true, nullable=false, precision=6)
	private long baseAttrId;

	@Column(name="attr_value_id", unique=true, nullable=false, precision=6)
	private long attrValueId;

	public AttrValuePK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AttrValuePK)) {
			return false;
		}
		AttrValuePK castOther = (AttrValuePK)other;
		return 
			(this.baseAttrId == castOther.baseAttrId)
			&& (this.attrValueId == castOther.attrValueId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.baseAttrId ^ (this.baseAttrId >>> 32)));
		hash = hash * prime + ((int) (this.attrValueId ^ (this.attrValueId >>> 32)));
		
		return hash;
	}
}
