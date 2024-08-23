package org.ocs.billing.entity.sim;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.ocs.billing.entity.gm.GmBox;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="sim_card")
@NamedQuery(name="SimCard.findAll", query="SELECT s FROM SimCard s")
public class SimCard implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sim_card_id", unique=true, nullable=false, precision=12)
	private long simCardId;

	@Column(length=60)
	private String adm;

	@Column(name="algo_kic", length=120)
	private String algoKic;

	@Column(name="algo_kid", length=120)
	private String algoKid;

	@Column(name="algo_kik", length=120)
	private String algoKik;

	@Column(name="aota_flag", length=1)
	private String aotaFlag;

	@Column(name="area_id", precision=6)
	private BigDecimal areaId;

	@Column(name="box_seq", precision=6)
	private BigDecimal boxSeq;

	@Column(name="check_sum", length=120)
	private String checkSum;

	@Column(length=4000)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(length=120)
	private String esn;

	@Column(name="fg_code", length=30)
	private String fgCode;

	@Column(name="fg_reason_id", precision=6)
	private BigDecimal fgReasonId;

	@Column(name="hlr_id", precision=6)
	private BigDecimal hlrId;

	@Column(length=30)
	private String hrpdss;

	@Column(length=60)
	private String iccid;

	@Column(length=60)
	private String imsi;

	@Column(length=60)
	private String imsi2;

	@Column(name="inject_flag", length=1)
	private String injectFlag;

	@Column(length=60)
	private String k4;

	@Column(length=120)
	private String k4l;

	@Column(name="keyset_no", length=120)
	private String keysetNo;

	@Column(length=120)
	private String ki;

	@Column(length=120)
	private String ki2;

	@Column(length=255)
	private String kic;

	@Column(length=255)
	private String kid;

	@Column(length=255)
	private String kik;

	@Column(length=120)
	private String kil;

	@Column(name="me_id", length=30)
	private String meId;

	@Column(name="nai_password", length=120)
	private String naiPassword;

	@Column(name="nai_username", length=120)
	private String naiUsername;

	@Column(name="old_imsi", length=60)
	private String oldImsi;

	@Column(name="org_id", precision=131089)
	private BigDecimal orgId;

	@Column(name="otaf_flag", length=1)
	private String otafFlag;

	@Column(length=120)
	private String pin1;

	@Column(length=120)
	private String pin2;

	@Column(length=120)
	private String puk1;

	@Column(length=120)
	private String puk2;

	@Column(name="recycle_flag", length=1)
	private String recycleFlag;

	@Column(name="security_domain", length=120)
	private String securityDomain;

	@Column(name="sim_state", length=1)
	private String simState;

	@Column(name="sim_type_id", nullable=false, precision=131089)
	private BigDecimal simTypeId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="staff_id", precision=9)
	private BigDecimal staffId;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date")
	private Date stateDate;

	@Column(name="sync_counter", length=120)
	private String syncCounter;

	@Column(length=3)
	private String vendor;

	//bi-directional many-to-one association to GmBox
	@ManyToOne
	@JoinColumn(name="gm_box_id")
	private GmBox gmBox;

	public SimCard() {
	}
}
