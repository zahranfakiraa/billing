package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="dyn_re_attr")
@NamedQuery(name="DynReAttr.findAll",query="SELECT d FROM DynReAttr d")
public class DynReAttr implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="re_attr")
    private BigDecimal reAttr;

    @Column(name="depend_prod_spec_id",precision=9)
    private BigDecimal depenProdSpec;

    @Column(name="dyn_attr_id",precision=16)
    private BigDecimal dynAttrId;

    @Column(name="attr_catg")
    private String attrCatg;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    public DynReAttr(){
        
    }
}
