package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_price")
@NamedQuery(name="CpcOtcPrice.findAll", query="SELECT c FROM CpcOtcPrice c")
public class CpcOtcPrice implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_id", unique=true, nullable=false, precision=9)
	private long priceId;

	@Column(name="charge_flag", length=1)
	private String chargeFlag;

	@Column(name="con_group_id", precision=9)
	private BigDecimal conGroupId;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_staff", precision=16)
	private BigDecimal createStaff;

	@Column(name="is_list_price", length=1)
	private String isListPrice;

	@Column(name="offer_id", nullable=false, precision=9)
	private BigDecimal offerId;

	@Column(name="otc_id", precision=9)
	private BigDecimal otcId;

	@Column(name="price_class", length=30)
	private String priceClass;

	@Column(name="price_method", length=1)
	private String priceMethod;

	@Column(precision=9)
	private BigDecimal priority;

	@Column(name="reprice_prod_id", precision=9)
	private BigDecimal repriceProdId;

	@Column(name="service_offer_id", nullable=false, precision=9)
	private BigDecimal serviceOfferId;

	@Temporal(TemporalType.DATE)
	@Column(name="status_date")
	private Date statusDate;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_staff", precision=16)
	private BigDecimal updateStaff;

	//bi-directional many-to-one association to CpcOtcPricePlanVer
	@ManyToOne
	@JoinColumn(name="price_plan_ver_id")
	private CpcOtcPricePlanVer cpcOtcPricePlanVer;

	//bi-directional many-to-one association to CpcOtcPriceBenefit
	@OneToMany(mappedBy="cpcOtcPrice")
	private List<CpcOtcPriceBenefit> cpcOtcPriceBenefits;

	//bi-directional many-to-one association to CpcOtcPriceDeposit
	@OneToMany(mappedBy="cpcOtcPrice")
	private List<CpcOtcPriceDeposit> cpcOtcPriceDeposits;

	//bi-directional many-to-one association to CpcOtcPriceRate
	@OneToMany(mappedBy="cpcOtcPrice")
	private List<CpcOtcPriceRate> cpcOtcPriceRates;

	//bi-directional one-to-one association to CpcOtcPriceScript
	@OneToOne(mappedBy="cpcOtcPrice")
	private CpcOtcPriceScript cpcOtcPriceScript;

	public CpcOtcPrice() {
	}

    public CpcOtcPriceBenefit addCpcOtcPriceBenefit(CpcOtcPriceBenefit cpcOtcPriceBenefit) {
		getCpcOtcPriceBenefits().add(cpcOtcPriceBenefit);
		cpcOtcPriceBenefit.setCpcOtcPrice(this);

		return cpcOtcPriceBenefit;
	}

	public CpcOtcPriceBenefit removeCpcOtcPriceBenefit(CpcOtcPriceBenefit cpcOtcPriceBenefit) {
		getCpcOtcPriceBenefits().remove(cpcOtcPriceBenefit);
		cpcOtcPriceBenefit.setCpcOtcPrice(null);

		return cpcOtcPriceBenefit;
	}

    public CpcOtcPriceDeposit addCpcOtcPriceDeposit(CpcOtcPriceDeposit cpcOtcPriceDeposit) {
		getCpcOtcPriceDeposits().add(cpcOtcPriceDeposit);
		cpcOtcPriceDeposit.setCpcOtcPrice(this);

		return cpcOtcPriceDeposit;
	}

	public CpcOtcPriceDeposit removeCpcOtcPriceDeposit(CpcOtcPriceDeposit cpcOtcPriceDeposit) {
		getCpcOtcPriceDeposits().remove(cpcOtcPriceDeposit);
		cpcOtcPriceDeposit.setCpcOtcPrice(null);

		return cpcOtcPriceDeposit;
	}

    public void setCpcOtcPriceRates(List<CpcOtcPriceRate> cpcOtcPriceRates) {
		this.cpcOtcPriceRates = cpcOtcPriceRates;
	}

	public CpcOtcPriceRate addCpcOtcPriceRate(CpcOtcPriceRate cpcOtcPriceRate) {
		getCpcOtcPriceRates().add(cpcOtcPriceRate);
		cpcOtcPriceRate.setCpcOtcPrice(this);

		return cpcOtcPriceRate;
	}

    public CpcOtcPriceRate removeCpcOtcPriceRate(CpcOtcPriceRate cpcOtcPriceRate) {
		getCpcOtcPriceRates().remove(cpcOtcPriceRate);
		cpcOtcPriceRate.setCpcOtcPrice(null);

		return cpcOtcPriceRate;
	}

}
