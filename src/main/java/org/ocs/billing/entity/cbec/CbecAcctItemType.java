package org.ocs.billing.entity.cbec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cbec_acct_item_type")
@NamedQuery(name="CbecAcctItemType.findAll", query="SELECT c FROM CbecAcctItemType c")
public class CbecAcctItemType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="acct_item_type_id", unique=true, nullable=false, precision=6)
	private long acctItemTypeId;

	@Column(name="acct_item_type_code", length=30)
	private String acctItemTypeCode;

	@Column(name="acct_item_type_name", nullable=false, length=200)
	private String acctItemTypeName;

	@Column(name="adjust_catg", length=1)
	private String adjustCatg;

	@Column(name="advance_flag", length=1)
	private String advanceFlag;

	@Column(length=120)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="deduct_erecharge", length=1)
	private String deductErecharge;

	@Column(name="emergency_fee", length=1)
	private String emergencyFee;

	@Column(name="exchange_item_type_id", precision=6)
	private BigDecimal exchangeItemTypeId;

	@Column(name="gst_type", length=6)
	private String gstType;

	@Column(name="parent_id", precision=6)
	private BigDecimal parentId;

	@Column(name="party_code", length=30)
	private String partyCode;

	@Column(name="party_type", length=1)
	private String partyType;

	@Column(length=60)
	private String sku;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(length=1)
	private String state;

	@Column(name="usage_type", length=1)
	private String usageType;

	//bi-directional many-to-one association to CbecAcctRe
	@ManyToOne
	@JoinColumn(name="acct_res_id", nullable=false)
	private CbecAcctRes cbecAcctRe;

	public CbecAcctItemType() {
	}
}
