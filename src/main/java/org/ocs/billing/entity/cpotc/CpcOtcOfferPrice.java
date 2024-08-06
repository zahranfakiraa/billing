package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_offer_price")
@NamedQuery(name="CpcOtcOfferPrice.findAll", query="SELECT c FROM CpcOtcOfferPrice c")
public class CpcOtcOfferPrice implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="offer_price_id", unique=true, nullable=false, precision=9)
	private long offerPriceId;

	@Column(name="offer_id", nullable=false, precision=9)
	private BigDecimal offerId;

	@Column(name="price_plan_id", nullable=false, precision=9)
	private BigDecimal pricePlanId;

	public CpcOtcOfferPrice() {
	}
}
