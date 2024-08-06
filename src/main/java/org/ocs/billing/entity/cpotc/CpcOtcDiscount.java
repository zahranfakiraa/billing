package org.ocs.billing.entity.cpotc;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_discount")
@NamedQuery(name="CpcOtcDiscount.findAll", query="SELECT c FROM CpcOtcDiscount c")
public class CpcOtcDiscount implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="discount_id", unique=true, nullable=false, precision=9)
	private long discountId;

	@Column(name="con_group_id", precision=9)
	private BigDecimal conGroupId;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_staff", precision=16)
	private BigDecimal createStaff;

	@Column(name="des_offer_id", precision=9)
	private BigDecimal desOfferId;

	@Column(name="price_plan_ver_id", precision=9)
	private BigDecimal pricePlanVerId;

	@Column(precision=9)
	private BigDecimal priority;

	@Column(name="service_offer_id", nullable=false, precision=9)
	private BigDecimal serviceOfferId;

	@Column(name="src_offer_id", precision=9)
	private BigDecimal srcOfferId;

	@Temporal(TemporalType.DATE)
	@Column(name="status_date")
	private Date statusDate;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_staff", precision=16)
	private BigDecimal updateStaff;

	public CpcOtcDiscount() {
	}
}
