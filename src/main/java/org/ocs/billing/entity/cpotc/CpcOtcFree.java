package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_free")
@NamedQuery(name="CpcOtcFree.findAll", query="SELECT c FROM CpcOtcFree c")
public class CpcOtcFree implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="free_id", unique=true, nullable=false, precision=9)
	private long freeId;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date")
	private Date createDate;

	@Column(name="create_staff", precision=16)
	private BigDecimal createStaff;

	@Column(name="des_offer_ids", length=1000)
	private String desOfferIds;

	@Column(name="price_plan_ver_id", precision=9)
	private BigDecimal pricePlanVerId;

	@Column(name="service_offer_ids", length=1000)
	private String serviceOfferIds;

	@Column(name="src_offer_id", nullable=false, precision=9)
	private BigDecimal srcOfferId;

	@Temporal(TemporalType.DATE)
	@Column(name="status_date")
	private Date statusDate;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_staff", precision=16)
	private BigDecimal updateStaff;

	public CpcOtcFree() {
	}
}
