package org.ocs.billing.entity.prod;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="prod_spec_attr")
public class ProdSpecAttr implements Serializable {

    @Id
    private ProdSpecAttrPK id;
    
    @Column(name="attr_value_id",precision = 6)
    private BigDecimal attrValueId;

    @Column(name="disp_order",precision = 6)
    private BigDecimal dispOrder;

    @Column(name="sp_id",precision = 6)
    private BigDecimal spId;
}
