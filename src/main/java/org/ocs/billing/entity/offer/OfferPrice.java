package org.ocs.billing.entity.offer;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="offer_price")
@NamedQuery(name="OfferPrice.findAll", query="SELECT o FROM OfferPrice o")
public class OfferPrice implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="offer_price_id", unique=true, nullable=false, precision=9)
	private long offerPriceId;

	@Column(name="offer_id", nullable=false, precision=16)
	private BigDecimal offerId;

	@Column(name="role_id", precision=9)
	private BigDecimal roleId;

	@Column(name="tariff_plan_id", nullable=false, precision=9)
	private BigDecimal tariffPlanId;

	public OfferPrice() {
	}
}
