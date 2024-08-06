package org.ocs.billing.entity.tariff;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.ocs.billing.entity.price.PricePlan;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="tariff_plan_rela")
@NamedQuery(name="TariffPlanRela.findAll", query="SELECT t FROM TariffPlanRela t")
public class TariffPlanRela implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tariff_plan_rela_id", unique=true, nullable=false, precision=9)
	private long tariffPlanRelaId;

	@Temporal(TemporalType.DATE)
	@Column(name="active_date")
	private Date activeDate;

	@Column(name="active_staff_id", precision=9)
	private BigDecimal activeStaffId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="inactive_date")
	private Date inactiveDate;

	@Column(name="inactive_staff_id", precision=9)
	private BigDecimal inactiveStaffId;

	@Column(nullable=false, precision=6)
	private BigDecimal priority;

	@Column(name="rent_rela_type", nullable=false, precision=6)
	private BigDecimal rentRelaType;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="tariff_plan_rela_name", length=120)
	private String tariffPlanRelaName;

	//bi-directional many-to-one association to PricePlan
	@ManyToOne
	@JoinColumn(name="price_plan_id", nullable=false)
	private PricePlan pricePlan;

	//bi-directional many-to-one association to TariffPlan
	@ManyToOne
	@JoinColumn(name="tariff_plan_id", nullable=false)
	private TariffPlan tariffPlan;

	public TariffPlanRela() {
	}
}
