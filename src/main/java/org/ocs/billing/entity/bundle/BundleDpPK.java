package org.ocs.billing.entity.bundle;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class BundleDpPK implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="group_id", unique=true, nullable=false, precision=6)
	private long groupId;

	@Column(name="depend_prod_spec_id", unique=true, nullable=false, precision=6)
	private long dependProdSpecId;

	public BundleDpPK() {
	}

    public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BundleDpPK)) {
			return false;
		}
		BundleDpPK castOther = (BundleDpPK)other;
		return 
			(this.groupId == castOther.groupId)
			&& (this.dependProdSpecId == castOther.dependProdSpecId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.groupId ^ (this.groupId >>> 32)));
		hash = hash * prime + ((int) (this.dependProdSpecId ^ (this.dependProdSpecId >>> 32)));
		
		return hash;
	}
}
