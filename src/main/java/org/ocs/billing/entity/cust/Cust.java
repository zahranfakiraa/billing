package org.ocs.billing.entity.cust;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cust")
@NamedQuery(name="Cust.findAll", query="SELECT c FROM Cust c")
public class Cust implements Serializable {
    private static final long serialVersionUID = 1L;

	@Column(length=255)
	private String address;

	@Column(name="area_id", precision=6)
	private BigDecimal areaId;

	@Column(name="cert_id", precision=12)
	private BigDecimal certId;

	@Column(length=255)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="cust_code", nullable=false, length=60)
	private String custCode;

	@Column(name="cust_id", nullable=false, precision=15)
	private BigDecimal custId;

	@Column(name="cust_name", nullable=false, length=255)
	private String custName;

	@Column(name="cust_type", nullable=false, length=1)
	private String custType;

	@Column(name="deliver_method", length=20)
	private String deliverMethod;

	@Column(length=255)
	private String email;

	@Column(name="imp_grade_id", precision=3)
	private BigDecimal impGradeId;

	@Column(name="need_upload", length=1)
	private String needUpload;

	@Column(name="parent_id", precision=9)
	private BigDecimal parentId;

	@Column(name="party_code", length=30)
	private String partyCode;

	@Column(name="party_type", length=1)
	private String partyType;

	@Column(length=60)
	private String pwd;

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

	@Column(length=60)
	private String zipcode;

	public Cust() {
	}
}
