package org.ocs.billing.entity.acc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="acct")
@NamedQuery(name="Acct.findAll", query="SELECT a FROM Acct a")
public class Acct implements Serializable {
    private static final long serialVersionUID = 1L;

	@Column(name="acct_id", nullable=false, precision=15)
	private BigDecimal acctId;

	@Column(name="acct_nbr", nullable=false, length=60)
	private String acctNbr;

	@Temporal(TemporalType.DATE)
	@Column(name="bank_acct_exp_date")
	private Date bankAcctExpDate;

	@Column(name="bank_acct_name", length=120)
	private String bankAcctName;

	@Column(name="bank_acct_nbr", length=60)
	private String bankAcctNbr;

	@Column(name="bank_acct_type", length=1)
	private String bankAcctType;

	@Column(name="bank_card_type", precision=3)
	private BigDecimal bankCardType;

	@Column(name="bank_id", precision=6)
	private BigDecimal bankId;

	@Column(name="bill_format_id", precision=6)
	private BigDecimal billFormatId;

	@Column(name="billing_cycle_type_id", nullable=false, precision=6)
	private BigDecimal billingCycleTypeId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="cust_id", nullable=false, precision=15)
	private BigDecimal custId;

	@Column(name="default_acc_nbr", length=30)
	private String defaultAccNbr;

	@Column(name="default_pre_fix", length=30)
	private String defaultPreFix;

	@Column(name="need_upload", length=1)
	private String needUpload;

	@Column(name="payment_comments", length=255)
	private String paymentComments;

	@Column(name="payment_method_id", precision=3)
	private BigDecimal paymentMethodId;

	@Column(name="payment_type", nullable=false, length=1)
	private String paymentType;

	@Column(length=1)
	private String postpaid;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date", nullable=false)
	private Date updateDate;

	public Acct() {
	}
}
