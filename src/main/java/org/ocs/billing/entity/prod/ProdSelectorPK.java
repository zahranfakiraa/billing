package org.ocs.billing.entity.prod;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Embeddable
public class ProdSelectorPK implements Serializable{
    
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

	@Column(name="indep_prod_spec_id", unique=true, nullable=false, precision=6)
	private long indepProdSpecId;

	@Column(name="depend_prod_spec_id", unique=true, nullable=false, precision=6)
	private long dependProdSpecId;

}
