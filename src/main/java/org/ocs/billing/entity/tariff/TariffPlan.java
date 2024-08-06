package org.ocs.billing.entity.tariff;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="tariff_plan")
@NamedQuery(name="TariffPlan.findAll", query="SELECT t FROM TariffPlan t")
public class TariffPlan implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tariff_plan_id", unique=true, nullable=false, precision=9)
	private long tariffPlanId;

	@Temporal(TemporalType.DATE)
	@Column(name="active_date")
	private Date activeDate;

	@Column(name="active_staff_id", precision=9)
	private BigDecimal activeStaffId;

	@Column(length=1000)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="inactive_date")
	private Date inactiveDate;

	@Column(name="inactive_staff_id", precision=9)
	private BigDecimal inactiveStaffId;

	@Column(name="obj_id", precision=9)
	private BigDecimal objId;

	@Column(name="obj_type", length=10)
	private String objType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="tariff_plan_code", length=60)
	private String tariffPlanCode;

	@Column(name="tariff_plan_name", nullable=false, length=400)
	private String tariffPlanName;

	@Column(name="tariff_plan_type", nullable=false, length=1)
	private String tariffPlanType;

	//bi-directional many-to-one association to TariffPlanRela
	@OneToMany(mappedBy="tariffPlan")
	private List<TariffPlanRela> tariffPlanRelas;

	public TariffPlan() {
	}

    public TariffPlanRela addTariffPlanRela(TariffPlanRela tariffPlanRela) {
		getTariffPlanRelas().add(tariffPlanRela);
		tariffPlanRela.setTariffPlan(this);

		return tariffPlanRela;
	}

	public TariffPlanRela removeTariffPlanRela(TariffPlanRela tariffPlanRela) {
		getTariffPlanRelas().remove(tariffPlanRela);
		tariffPlanRela.setTariffPlan(null);

		return tariffPlanRela;
	}
}
