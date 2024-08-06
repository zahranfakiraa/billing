package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="finish_goods")
@NamedQuery(name="FinishGood.findAll", query="SELECT f FROM FinishGood f")
public class FinishGood implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fg_code", unique=true, nullable=false, length=30)
	private String fgCode;

	@Column(name="auto_reprovision", length=1)
	private String autoReprovision;

	@Column(length=255)
	private String comments;

	@Column(name="create_staff_id", precision=9)
	private BigDecimal createStaffId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="face_value", precision=12)
	private BigDecimal faceValue;

	@Column(name="fg_name", nullable=false, length=255)
	private String fgName;

	@Column(name="fg_type", precision=6)
	private BigDecimal fgType;

	@Column(name="offer_id", precision=9)
	private BigDecimal offerId;

	@Column(length=1)
	private String operator;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_staff_id", precision=9)
	private BigDecimal updateStaffId;

	public FinishGood() {
	}
}
