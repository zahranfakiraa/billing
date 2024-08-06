package org.ocs.billing.entity.prod;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Embeddable
public class ProdSpecAttrPK implements Serializable{

    //default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="prod_spec_id", unique=true, nullable=false, precision=6)
	private long prodSpecId;

	@Column(name="attr_id", unique=true, nullable=false, precision=9)
	private long attrId;
}
