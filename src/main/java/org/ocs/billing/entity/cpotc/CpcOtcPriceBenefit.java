package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_price_benefit")
@NamedQuery(name="CpcOtcPriceBenefit.findAll", query="SELECT c FROM CpcOtcPriceBenefit c")
public class CpcOtcPriceBenefit implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="benefit_id", unique=true, nullable=false, precision=9)
	private long benefitId;

	@Temporal(TemporalType.DATE)
	@Column(name="abs_eff_date")
	private Date absEffDate;

	@Temporal(TemporalType.DATE)
	@Column(name="abs_exp_date")
	private Date absExpDate;

	@Column(name="acct_res_id", nullable=false, precision=9)
	private BigDecimal acctResId;

	@Column(name="benefit_code", length=60)
	private String benefitCode;

	@Column(name="benefit_level", length=1)
	private String benefitLevel;

	@Column(name="ceil_limit", precision=16)
	private BigDecimal ceilLimit;

	@Column(name="config_unit_id", precision=6)
	private BigDecimal configUnitId;

	@Column(name="daily_ceil_limit", precision=16)
	private BigDecimal dailyCeilLimit;

	@Column(name="daily_floor_limit", precision=16)
	private BigDecimal dailyFloorLimit;

	@Column(name="exp_date_prolong_rule", length=1)
	private String expDateProlongRule;

	@Column(name="floor_limit", precision=16)
	private BigDecimal floorLimit;

	@Column(name="fun_id", precision=3)
	private BigDecimal funId;

	@Column(name="max_days", precision=6)
	private BigDecimal maxDays;

	@Column(name="period_type", length=1)
	private String periodType;

	@Column(name="ref_sysdate_precision", length=1)
	private String refSysdatePrecision;

	@Column(name="rel_eff_offset", precision=9)
	private BigDecimal relEffOffset;

	@Temporal(TemporalType.DATE)
	@Column(name="rel_eff_time")
	private Date relEffTime;

	@Column(name="rel_eff_unit", length=3)
	private String relEffUnit;

	@Column(name="rel_exp_offset", precision=9)
	private BigDecimal relExpOffset;

	@Column(name="rel_exp_offset_exp_name", length=4000)
	private String relExpOffsetExpName;

	@Column(name="rel_exp_offset_expression", length=4000)
	private String relExpOffsetExpression;

	@Column(name="rel_exp_offset2", precision=9)
	private BigDecimal relExpOffset2;

	@Temporal(TemporalType.DATE)
	@Column(name="rel_exp_time")
	private Date relExpTime;

	@Column(name="rel_exp_unit", length=3)
	private String relExpUnit;

	@Column(name="rel_exp_unit2", length=3)
	private String relExpUnit2;

	@Column(name="res_value_rate", length=30)
	private String resValueRate;

	@Column(name="reverse_flag", length=1)
	private String reverseFlag;

	@Column(length=30)
	private String value;

	@Column(name="value_desc", length=1000)
	private String valueDesc;

	@Column(name="value_exp", length=1000)
	private String valueExp;

	@Column(name="value_exp_name", length=1000)
	private String valueExpName;

	@Column(name="value_expression", length=4000)
	private String valueExpression;

	//bi-directional many-to-one association to CpcOtcPrice
	@ManyToOne
	@JoinColumn(name="price_id")
	private CpcOtcPrice cpcOtcPrice;

	public CpcOtcPriceBenefit() {
	}
}
