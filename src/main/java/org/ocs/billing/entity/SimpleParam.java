package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="simple_param")
@NamedQuery(name="SimpleParam.findAll",query="SELECT s FROM SimpleParam s")
public class SimpleParam implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="param_id",precision=9)
    private BigDecimal paramId;

    @Column(name="param_ver",precision=3)
    private BigDecimal paramVer;

    @Column(name="value_method",precision=3)
    private BigDecimal valueMethod;
    
    @Column(name="def_value",length=60)
    private String defValue;

    @Temporal(TemporalType.DATE)
    @Column(name="eff_date")
    private Date effDate;
    
    @Temporal(TemporalType.DATE)
    @Column(name="exp_date")
    private Date expDate;

    @Temporal(TemporalType.DATE)
    @Column(name="state_date")
    private Date stateDate;

    @Column(name="state")
    private String state;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="use_scope")
    private String useScope;

    @Column(name="currency_type_id",precision=6)
    private BigDecimal currencyTypeId;

    @Column(name="unit_id",precision=6)
    private BigDecimal unitId;

    @Column(name="calc_unit_id",precision=6)
    private BigDecimal calcUnitId;

    @Column(name="config_unit_id",precision=6)
    private BigDecimal configUnitId;

    @Column(name="param_category_id",precision=6)
    private BigDecimal paramCategoryId;

    public SimpleParam(){
        
    }
}
