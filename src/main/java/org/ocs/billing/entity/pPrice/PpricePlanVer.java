package org.ocs.billing.entity.pPrice;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="pprice_plan_ver")
@NamedQuery(name="PpricePlanVer.findAll", query="SELECT p FROM PpricePlanVer p")
public class PpricePlanVer implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_plan_ver_id", unique=true, nullable=false, precision=6)
	private long pricePlanVerId;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="price_plan_id", precision=6)
	private BigDecimal pricePlanId;

	@Column(precision=6)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public PpricePlanVer() {
	}
}
