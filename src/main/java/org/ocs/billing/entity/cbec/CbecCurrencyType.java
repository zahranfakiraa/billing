package org.ocs.billing.entity.cbec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cbec_currency_type")
@NamedQuery(name="CbecCurrencyType.findAll", query="SELECT c FROM CbecCurrencyType c")
public class CbecCurrencyType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="currency_type_id",precision=6)
    private BigDecimal currencyType;

    @Column(name="currency_code",length=30)
    private String currencyCode;

    @Column(name="currency_symbol",length=3)
    private String currencySymbol;

    @Column(name="currency_name",length=60)
    private String currencyName;

    @Column(name="save_precision",precision=15)
    private BigDecimal savePrecision;

    @Column(name="display_scale",precision=3)
    private BigDecimal displayScale;

    @Column(name="rate_display_scale",precision=3)
    private BigDecimal rateDisplayScale;

    @Column(name="round_method")
    private String roundMethod;

    @Column(name="state")
    private String state;

    @Temporal(TemporalType.DATE)
    @Column(name="created_date")
    private Date createdDate;

    @Column(name="party_type")
    private String partyType;

    @Column(name="party_code",length=30)
    private String partyCode;

    @Column(name="bal_round_method")
    private String balRoundMethod;

    public CbecCurrencyType(){
        
    }
}
