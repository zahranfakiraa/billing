package org.ocs.billing.entity.price;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.ocs.billing.entity.tariff.TariffPlanRela;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_plan")
@NamedQuery(name="PricePlan.findAll", query="SELECT p FROM PricePlan p")
public class PricePlan {
    
    @Id
	@Column(name="price_plan_id", unique=true, nullable=false, precision=9)
	private long pricePlanId;

	@Temporal(TemporalType.DATE)
	@Column(name="active_date")
	private Date activeDate;

	@Column(name="active_staff_id", precision=16)
	private BigDecimal activeStaffId;

	@Column(name="apply_level", length=1)
	private String applyLevel;

	@Column(name="discount_type_id", length=1)
	private String discountTypeId;

	@Column(name="group_code", length=20)
	private String groupCode;

	@Temporal(TemporalType.DATE)
	@Column(name="inactive_date")
	private Date inactiveDate;

	@Column(name="inactive_staff_id", precision=16)
	private BigDecimal inactiveStaffId;

	@Column(name="is_test_type", length=1)
	private String isTestType;

	@Column(name="lock_flag", length=1)
	private String lockFlag;

	@Column(name="policy_plan_flag", length=1)
	private String policyPlanFlag;

	@Column(name="price_plan_catalog", length=1)
	private String pricePlanCatalog;

	@Column(name="price_plan_code", length=60)
	private String pricePlanCode;

	@Column(name="price_plan_exit", length=1)
	private String pricePlanExit;

	@Column(name="price_plan_name", nullable=false, length=400)
	private String pricePlanName;

	@Column(nullable=false, precision=6)
	private BigDecimal priority;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(length=1)
	private String state;


	//bi-directional many-to-one association to PricePlanGenre
	@ManyToOne
	@JoinColumn(name="price_plan_genre")
	private PricePlanGenre pricePlanGenreBean;

	//bi-directional many-to-one association to PricePlanType
	@ManyToOne
	@JoinColumn(name="price_plan_type")
	private PricePlanType pricePlanTypeBean;

	//bi-directional many-to-one association to PricePlanVer
	@OneToMany(mappedBy="pricePlan")
	private List<PricePlanVer> pricePlanVers;

	// //bi-directional many-to-one association to TariffPlanRela
	@OneToMany(mappedBy="pricePlan")
	private List<TariffPlanRela> tariffPlanRelas;

	public PricePlan() {
	}


	public PricePlanVer addPricePlanVer(PricePlanVer pricePlanVer) {
		getPricePlanVers().add(pricePlanVer);
		pricePlanVer.setPricePlan(this);

		return pricePlanVer;
	}

	public PricePlanVer removePricePlanVer(PricePlanVer pricePlanVer) {
		getPricePlanVers().remove(pricePlanVer);
		pricePlanVer.setPricePlan(null);

		return pricePlanVer;
	}

    public TariffPlanRela addTariffPlanRela(TariffPlanRela tariffPlanRela) {
		getTariffPlanRelas().add(tariffPlanRela);
		tariffPlanRela.setPricePlan(this);

		return tariffPlanRela;
	}

	public TariffPlanRela removeTariffPlanRela(TariffPlanRela tariffPlanRela) {
		getTariffPlanRelas().remove(tariffPlanRela);
		tariffPlanRela.setPricePlan(null);

		return tariffPlanRela;
	}
}
