package org.ocs.billing.entity.cbec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cbec_acct_res")
@NamedQuery(name="CbecAcctRe.findAll", query="SELECT c FROM CbecAcctRe c")
public class CbecAcctRe implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="acct_res_id", unique=true, nullable=false, precision=6)
	private long acctResId;

	@Column(name="acct_res_name", nullable=false, length=120)
	private String acctResName;

	@Column(name="bal_type", nullable=false, precision=3)
	private BigDecimal balType;

	@Column(length=400)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@ManyToOne
	@JoinColumn(name="currency_type_id", referencedColumnName = "currency_type_id")
	private CbecCurrencyType currencyTypeId;

	@Column(name="eff_type", length=1)
	private String effType;

	@Column(name="exclude_pack_inner", length=1)
	private String excludePackInner;

	@Column(name="is_channel_bal", length=1)
	private String isChannelBal;

	@Column(name="is_currency", nullable=false, length=1)
	private String isCurrency;

	@Column(name="max_value", precision=15)
	private BigDecimal maxValue;

	@Column(name="overdraft_flag", length=1)
	private String overdraftFlag;

	@Column(name="pack_inner", length=1)
	private String packInner;

	@Column(name="party_code", length=30)
	private String partyCode;

	@Column(name="party_type", length=1)
	private String partyType;

	@Column(precision=6)
	private BigDecimal priority;

	@Column(name="ref_value", precision=18)
	private BigDecimal refValue;

	@Column(length=1)
	private String refillable;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(length=1)
	private String state;

	@Column(name="std_code", length=60)
	private String stdCode;

	@Column(name="unit_id", precision=6)
	private BigDecimal unitId;

	@Column(name="unit_precision", precision=15)
	private BigDecimal unitPrecision;

	@Column(name="unlimited_flag", length=1)
	private String unlimitedFlag;

	//bi-directional many-to-one association to CbecAcctItemType
	@OneToMany(mappedBy="cbecAcctRe")
	private List<CbecAcctItemType> cbecAcctItemTypes;

	//bi-directional many-to-one association to CbecAcctRe
	@ManyToOne
	@JoinColumn(name="parent_acct_res_id")
	private CbecAcctRe cbecAcctRe;

	//bi-directional many-to-one association to CbecAcctRe
	@OneToMany(mappedBy="cbecAcctRe")
	private List<CbecAcctRe> cbecAcctRes;

	public CbecAcctRe() {
	}

    public CbecAcctItemType addCbecAcctItemType(CbecAcctItemType cbecAcctItemType) {
		getCbecAcctItemTypes().add(cbecAcctItemType);
		cbecAcctItemType.setCbecAcctRe(this);

		return cbecAcctItemType;
	}

    public CbecAcctItemType removeCbecAcctItemType(CbecAcctItemType cbecAcctItemType) {
		getCbecAcctItemTypes().remove(cbecAcctItemType);
		cbecAcctItemType.setCbecAcctRe(null);

		return cbecAcctItemType;
	}

    public CbecAcctRe addCbecAcctRe(CbecAcctRe cbecAcctRe) {
		getCbecAcctRes().add(cbecAcctRe);
		cbecAcctRe.setCbecAcctRe(this);

		return cbecAcctRe;
	}

	public CbecAcctRe removeCbecAcctRe(CbecAcctRe cbecAcctRe) {
		getCbecAcctRes().remove(cbecAcctRe);
		cbecAcctRe.setCbecAcctRe(null);

		return cbecAcctRe;
	}
}
