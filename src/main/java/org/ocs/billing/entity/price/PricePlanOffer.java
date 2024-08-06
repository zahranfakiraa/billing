package org.ocs.billing.entity.price;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_plan_offer")
@NamedQuery(name="PricePlanOffer.findAll", query="SELECT p FROM PricePlanOffer p")
public class PricePlanOffer implements Serializable{
    
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="offer_id", unique=true, nullable=false, precision=9)
	private long offerId;

	@Column(name="price_plan_id", nullable=false, precision=6)
	private BigDecimal pricePlanId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public PricePlanOffer() {
	}

}
