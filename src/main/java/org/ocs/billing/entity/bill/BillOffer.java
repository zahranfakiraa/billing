package org.ocs.billing.entity.bill;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bill_offer")
@NamedQuery(name="BillOffer.findAll", query="SELECT b FROM BillOffer b")
public class BillOffer implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="offer_id", unique=true, nullable=false, precision=9)
	private long offerId;

	@Column(name="bundle_flag", length=1)
	private String bundleFlag;

	@Column(name="offer_code", nullable=false, length=60)
	private String offerCode;

	@Column(name="offer_name", nullable=false, length=255)
	private String offerName;

	@Column(name="offer_type", nullable=false, length=1)
	private String offerType;

	@Column(name="rent_list_price", length=30)
	private String rentListPrice;

	@Column(name="sale_list_price", length=30)
	private String saleListPrice;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public BillOffer() {
	}

}
