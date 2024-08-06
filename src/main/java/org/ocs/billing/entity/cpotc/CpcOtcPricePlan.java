package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_price_plan")
@NamedQuery(name="CpcOtcPricePlan.findAll", query="SELECT c FROM CpcOtcPricePlan c")
public class CpcOtcPricePlan implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_plan_id", unique=true, nullable=false, precision=9)
	private long pricePlanId;

	@Temporal(TemporalType.DATE)
	@Column(name="active_date")
	private Date activeDate;

	@Column(name="active_staff_id", precision=16)
	private BigDecimal activeStaffId;

	@Temporal(TemporalType.DATE)
	@Column(name="inactive_date")
	private Date inactiveDate;

	@Column(name="inactive_staff_id", precision=16)
	private BigDecimal inactiveStaffId;

	@Column(name="price_plan_code", length=60)
	private String pricePlanCode;

	@Column(name="price_plan_genre", length=1)
	private String pricePlanGenre;

	@Column(name="price_plan_name", nullable=false, length=400)
	private String pricePlanName;

	@Column(length=1)
	private String state;

	//bi-directional many-to-one association to CpcOtcPricePlanVer
	@OneToMany(mappedBy="cpcOtcPricePlan")
	private List<CpcOtcPricePlanVer> cpcOtcPricePlanVers;

	public CpcOtcPricePlan() {
	}

    public CpcOtcPricePlanVer addCpcOtcPricePlanVer(CpcOtcPricePlanVer cpcOtcPricePlanVer) {
		getCpcOtcPricePlanVers().add(cpcOtcPricePlanVer);
		cpcOtcPricePlanVer.setCpcOtcPricePlan(this);

		return cpcOtcPricePlanVer;
	}

	public CpcOtcPricePlanVer removeCpcOtcPricePlanVer(CpcOtcPricePlanVer cpcOtcPricePlanVer) {
		getCpcOtcPricePlanVers().remove(cpcOtcPricePlanVer);
		cpcOtcPricePlanVer.setCpcOtcPricePlan(null);

		return cpcOtcPricePlanVer;
	}
}
