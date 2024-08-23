package org.ocs.billing.entity.con;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="con_res")
@NamedQuery(name="ConRes.findAll",query="SELECT c FROM ConRes c")
public class ConRes implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="con_res_id",precision=9)
    private BigDecimal conResId;

    @Column(name="bal_source_type",precision=3)
    private BigDecimal balSourceType;

    @Column(name="con_res_name",length=255)
    private String conResName;

    @Column(name="deduct_type")
    private String deductType;

    @Column(name="con_res_code",length=30)
    private String conResCode;

    @Column(name="comments",length=255)
    private String Comments;

    @Column(name="price_id",precision=9)
    private BigDecimal priceId;

    @Column(name="is_currency")
    private String isCurrency;

    @Column(name="unit_id",precision=6)
    private BigDecimal unitId;

    @Column(name="currency_type_id",precision=6)
    private BigDecimal currencyTypeId;

    @Column(name="unit_precision",precision=15)
    private BigDecimal unitPrecision;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="zero_reverse_order")
    private String zeroReverseOrder;

    public ConRes(){
        
    }
}
