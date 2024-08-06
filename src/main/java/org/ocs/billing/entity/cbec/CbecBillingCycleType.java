package org.ocs.billing.entity.cbec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cbec_billing_cycle_type")
@NamedQuery(name="CbecBillingCycleType.findAll", query="SELECT c FROM CbecBillingCycleType c")
public class CbecBillingCycleType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="billing_cycle_type_id", unique=true, nullable=false, precision=6)
	private long billingCycleTypeId;

	@Temporal(TemporalType.DATE)
	@Column(name="begin_date", nullable=false)
	private Date beginDate;

	@Column(name="billing_cycle_type_code", length=60)
	private String billingCycleTypeCode;

	@Column(name="billing_cycle_type_name", nullable=false, length=60)
	private String billingCycleTypeName;

	@Column(length=120)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="debt_date", nullable=false)
	private Date debtDate;

	@Column(length=1)
	private String operator;

	@Column(name="party_code", length=30)
	private String partyCode;

	@Column(name="party_type", length=1)
	private String partyType;

	@Column(nullable=false, length=1)
	private String postpaid;

	@Column(nullable=false, precision=3)
	private BigDecimal quantity;

	@Temporal(TemporalType.DATE)
	@Column(name="run_date")
	private Date runDate;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(length=1)
	private String state;

	@Column(name="time_unit", nullable=false, length=1)
	private String timeUnit;

	public CbecBillingCycleType() {
	}
}
