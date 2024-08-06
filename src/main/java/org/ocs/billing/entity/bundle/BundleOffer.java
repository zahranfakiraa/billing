package org.ocs.billing.entity.bundle;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bundle_offer")
@NamedQuery(name="BundleOffer.findAll", query="SELECT b FROM BundleOffer b")
public class BundleOffer implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="offer_id", unique=true, nullable=false, precision=9)
	private long offerId;

	@Column(name="bundle_id", nullable=false, precision=6)
	private BigDecimal bundleId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public BundleOffer() {
	}

}
