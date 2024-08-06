package org.ocs.billing.entity.cbec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cbec_billing_cycle")
@NamedQuery(name="CbecBillingCycle.findAll", query="SELECT c FROM CbecBillingCycle c")
public class CbecBillingCycle implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="billing_cycle_id", unique=true, nullable=false, precision=6)
	private long billingCycleId;

	@Column(name="billing_cycle_type_id", nullable=false, precision=6)
	private BigDecimal billingCycleTypeId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="cycle_begin_date", nullable=false)
	private Date cycleBeginDate;

	@Temporal(TemporalType.DATE)
	@Column(name="cycle_end_date", nullable=false)
	private Date cycleEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="debt_date", nullable=false)
	private Date debtDate;

	@Column(name="party_code", length=30)
	private String partyCode;

	@Column(name="party_type", length=1)
	private String partyType;

	@Temporal(TemporalType.DATE)
	@Column(name="run_date")
	private Date runDate;

	@Column(precision=4)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date")
	private Date stateDate;

	public CbecBillingCycle() {
	}
}
