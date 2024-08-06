package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_price_rate")
@NamedQuery(name="CpcOtcPriceRate.findAll", query="SELECT c FROM CpcOtcPriceRate c")
public class CpcOtcPriceRate implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rate_id", unique=true, nullable=false, precision=9)
	private long rateId;

	@Column(name="acct_item_type_id", nullable=false, precision=6)
	private BigDecimal acctItemTypeId;

	@Column(name="con_res_id", precision=9)
	private BigDecimal conResId;

	@Column(name="include_tax", length=1)
	private String includeTax;

	@Column(precision=16)
	private BigDecimal value;

	@Column(name="value_display", length=30)
	private String valueDisplay;

	@Column(name="value_exp", length=4000)
	private String valueExp;

	@Column(name="value_exp_name", length=4000)
	private String valueExpName;

	@Column(name="value_expression", length=4000)
	private String valueExpression;

	//bi-directional many-to-one association to CpcOtcPrice
	@ManyToOne
	@JoinColumn(name="price_id")
	private CpcOtcPrice cpcOtcPrice;

	public CpcOtcPriceRate() {
	}
}
