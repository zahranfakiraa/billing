package org.ocs.billing.entity.sub;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="subs_upp_inst")
@NamedQuery(name="SubsUppInst.findAll", query="SELECT s FROM SubsUppInst s")
public class SubsUppInst implements Serializable{
    private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="completed_date", nullable=false)
	private Date completedDate;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="cust_id", precision=15)
	private BigDecimal custId;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="need_upload", length=1)
	private String needUpload;

	@Column(name="offer_id", precision=9)
	private BigDecimal offerId;

	@Column(name="price_plan_id", nullable=false, precision=6)
	private BigDecimal pricePlanId;

	@Column(name="prod_id", precision=15)
	private BigDecimal prodId;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="subs_id", nullable=false, precision=15)
	private BigDecimal subsId;

	@Column(name="subs_upp_inst_id", nullable=false, precision=15)
	private BigDecimal subsUppInstId;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date", nullable=false)
	private Date updateDate;

	public SubsUppInst() {
	}
}
