package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="urf_file_receive")
@NamedQuery(name="UrfFileReceive.findAll", query="SELECT u FROM UrfFileReceive u")
public class UrfFileReceive implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="urf_id", unique=true, nullable=false, precision=9)
	private long urfId;

	@Column(name="area_id", precision=6)
	private BigDecimal areaId;

	@Column(nullable=false, length=60)
	private String batch;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="download_date")
	private Date downloadDate;

	@Column(name="download_flag", length=1)
	private String downloadFlag;

	@Column(name="employee_name", length=254)
	private String employeeName;

	@Column(name="fg_code", length=60)
	private String fgCode;

	@Column(name="fg_name", length=255)
	private String fgName;

	@Column(name="hlr_id", precision=6)
	private BigDecimal hlrId;

	@Column(length=30)
	private String material1;

	@Column(length=30)
	private String material2;

	@Column(name="po_no", length=254)
	private String poNo;

	@Column(name="po_smg", length=254)
	private String poSmg;

	@Column(precision=9)
	private BigDecimal quantity;

	@Column(name="result_file_flag", length=1)
	private String resultFileFlag;

	@Column(name="sim_type_id", precision=3)
	private BigDecimal simTypeId;

	@Column(nullable=false, length=1)
	private String state;

	@Column(name="tariff_plan", length=254)
	private String tariffPlan;

	@Column(name="urf_code", nullable=false, length=8)
	private String urfCode;

	@Column(length=16)
	private String vendor;

	@Column(name="wholesale_id", precision=9)
	private BigDecimal wholesaleId;

	public UrfFileReceive() {
	}
}
