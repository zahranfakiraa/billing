package org.ocs.billing.entity.sub;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="subs")
@NamedQuery(name="Sub.findAll", query="SELECT s FROM Sub s")
public class Sub implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="acc_nbr", nullable=false, length=60)
	private String accNbr;

	@Column(name="acc_nbr_class_id", precision=3)
	private BigDecimal accNbrClassId;

	@Column(name="acc_nbr_id", precision=12)
	private BigDecimal accNbrId;

	@Column(name="acc_nbr_type_id", precision=3)
	private BigDecimal accNbrTypeId;

	@Column(name="acct_id", nullable=false, precision=15)
	private BigDecimal acctId;

	@Column(name="agent_id", precision=9)
	private BigDecimal agentId;

	@Column(name="area_id", nullable=false, precision=6)
	private BigDecimal areaId;

	@Column(name="bonus_amount", precision=12)
	private BigDecimal bonusAmount;

	@Column(length=255)
	private String comments;

	@Column(name="cust_id", nullable=false, precision=15)
	private BigDecimal custId;

	@Column(name="def_lang_id", precision=6)
	private BigDecimal defLangId;

	@Column(length=120)
	private String esn;

	@Column(name="fg_reason_id", precision=6)
	private BigDecimal fgReasonId;

	@Column(name="hlr_id", precision=6)
	private BigDecimal hlrId;

	@Column(length=60)
	private String iccid;

	@Column(length=60)
	private String imsi;

	@Column(length=60)
	private String imsi2;

	@Column(length=120)
	private String ki;

	@Column(length=30)
	private String meid;

	@Column(name="need_upload", length=1)
	private String needUpload;

	@Column(length=1)
	private String operator;

	@Column(name="org_id", precision=9)
	private BigDecimal orgId;

	@Column(name="otaf_flag", length=1)
	private String otafFlag;

	@Column(name="pps_pwd", length=60)
	private String ppsPwd;

	@Column(nullable=false, length=60)
	private String prefix;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="second_nbr", length=60)
	private String secondNbr;

	@Column(name="second_nbr_id", precision=12)
	private BigDecimal secondNbrId;

	@Column(name="sim_card_area_id", precision=6)
	private BigDecimal simCardAreaId;

	@Column(name="sim_card_id", precision=12)
	private BigDecimal simCardId;

	@Column(name="sim_card_org_id", precision=131089)
	private BigDecimal simCardOrgId;

	@Column(name="sim_type_id", precision=131089)
	private BigDecimal simTypeId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="stock_party_code", length=30)
	private String stockPartyCode;

	@Column(name="stock_party_type", length=1)
	private String stockPartyType;

	@Column(name="stock_state", length=1)
	private String stockState;

	@Column(name="subs_id", nullable=false, precision=15)
	private BigDecimal subsId;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date", nullable=false)
	private Date updateDate;

	@Column(name="user_id", nullable=false, precision=15)
	private BigDecimal userId;

	public Sub() {
	}
}
