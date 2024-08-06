package org.ocs.billing.entity.acc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="acc_nbr")
@NamedQuery(name="AccNbr.findAll", query="SELECT a FROM AccNbr a")
public class AccNbr implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="acc_nbr_id", unique=true, nullable=false, precision=12)
	private long accNbrId;

	@Column(name="acc_nbr", length=60)
	private String accNbr;

	@Column(name="acc_nbr_class_id", precision=3)
	private BigDecimal accNbrClassId;

	@Column(name="acc_nbr_state", length=1)
	private String accNbrState;

	@Column(name="acc_nbr_type_id", precision=3)
	private BigDecimal accNbrTypeId;

	@Column(name="area_id", precision=6)
	private BigDecimal areaId;

	@Temporal(TemporalType.DATE)
	@Column(name="cancel_date")
	private Date cancelDate;

	@Column(name="cancel_party_code", length=30)
	private String cancelPartyCode;

	@Column(name="cancel_party_type", length=1)
	private String cancelPartyType;

	@Column(length=4000)
	private String comments;

	@Column(precision=6)
	private BigDecimal days;

	@Column(name="hlr_id", precision=6)
	private BigDecimal hlrId;

	@Column(name="is_real_nbr", length=1)
	private String isRealNbr;

	@Column(name="np_auth_code", length=60)
	private String npAuthCode;

	@Column(length=1)
	private String operator;

	@Column(name="org_id", precision=9)
	private BigDecimal orgId;

	@Column(name="otaf_flag", length=1)
	private String otafFlag;

	@Column(name="peer_operator_code", length=60)
	private String peerOperatorCode;

	@Column(name="pps_pwd", length=60)
	private String ppsPwd;

	@Column(name="pre_charging", precision=12)
	private BigDecimal preCharging;

	@Column(length=60)
	private String prefix;

	@Column(name="reserve_comments", length=4000)
	private String reserveComments;

	@Temporal(TemporalType.DATE) 
	@Column(name="reserve_date")
	private Date reserveDate;

	@Temporal(TemporalType.DATE)
	@Column(name="reserve_exp_date")
	private Date reserveExpDate;

	@Column(name="reserve_party_code", length=30)
	private String reservePartyCode;

	@Column(name="reserve_party_type", length=1)
	private String reservePartyType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="staff_id", precision=9)
	private BigDecimal staffId;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date")
	private Date stateDate;

	public AccNbr() {
	}
}
