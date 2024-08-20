package org.ocs.billing.entity.re;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NamedQuery(name="RePpSecurring.findAll",query="SELECT r FROM RePpSecurring r")
public class RePpSecurring implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="re_id",precision=9)
    private BigDecimal reId;

    @Column(name="recurring_re_type")
    private String recurringReType;

    @Column(name="price_plan_ver_id",precision=9)
    private BigDecimal pricePlanVerId;

    @Column(name="price_plan_id",precision=9)
    private BigDecimal pricePlanId;

    @Column(name="state")
    private String state;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    public RePpSecurring(){
        
    }
}
