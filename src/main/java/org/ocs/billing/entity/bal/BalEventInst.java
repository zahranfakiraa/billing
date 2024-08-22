package org.ocs.billing.entity.bal;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bal_event_inst")
@NamedQuery(name="BalEventInst.findAll", query="SELECT b FROM BalEventInst b")
public class BalEventInst implements Serializable {
    private static final long serialVersionUID = 1L;

	@Column(name="acct_id", nullable=false, precision=15)
	private BigDecimal acctId;

	@Column(name="acct_res_id", precision=9)
	private BigDecimal acctResId;

	@Column(precision=16)
	private BigDecimal bal;

	@Column(name="bal_event", nullable=false, length=1)
	private String balEvent;

	@Column(name="bal_event_inst_id", nullable=false, precision=15)
	private BigDecimal balEventInstId;

	@Column(name="benefit_bal", nullable=false, precision=16)
	private BigDecimal benefitBal;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Column(name="event_inst_id", precision=15)
	private BigDecimal eventInstId;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="part_id", nullable=false, precision=6)
	private BigDecimal partId;

	@Column(name="price_desc", length=255)
	private String priceDesc;

	@Column(name="resource_id", precision=6)
	private BigDecimal resourceId;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="sub_bal_type_id", nullable=false, precision=9)
	private BigDecimal subBalTypeId;

	@Column(name="threshold_bal", precision=16)
	private BigDecimal thresholdBal;

	@Column(name="threshold_value", precision=16)
	private BigDecimal thresholdValue;

	@Column(precision=16)
	private BigDecimal value;

	public BalEventInst() {
	}
}
