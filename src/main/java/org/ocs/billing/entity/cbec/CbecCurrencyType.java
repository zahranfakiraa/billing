package org.ocs.billing.entity.cbec;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "cbec_currency_type")
@NamedQuery(name = "CbecCurrencyType.findAll", query = "SELECT c FROM CbecCurrencyType c")
public class CbecCurrencyType {

    @Id
    @Column(name = "currency_type_id", precision = 6, nullable = false)
    private String currencyTypeId;

    @Column(name = "currency_code", length = 30, nullable = false)
    private String currencyCode;

    @Column(name = "currency_symbol", length = 3)
    private String currencySymbol;

    @Column(name = "currency_name", length = 60, nullable = false)
    private String currencyName;

    @Column(name = "save_precision", precision = 15, nullable = false)
    private BigDecimal savePrecision;

    @Column(name = "display_scale", precision = 3)
    private BigDecimal displayScale;

    @Column(name = "rate_display_scale", precision = 3)
    private BigDecimal rateDisplayScale;

    @Column(name = "round_method", length = 1)
    private String roundMethod;

    @Column(name = "state", length = 1)
    private String state;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "party_type", length = 1)
    private String partyType;

    @Column(name = "party_code", length = 30)
    private String partyCode;

    @Column(name = "bal_round_method", length = 1)
    private String balRoundMethod;

    @OneToMany(mappedBy = "currencyTypeId")
    private CbecAcctRe cbecAcctRe;
}
