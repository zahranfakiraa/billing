package org.ocs.billing.entity.offer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="offer")
@NamedQuery(name="Offer.findAll", query="SELECT o FROM Offer o")
public class Offer implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="offer_id", unique=true, nullable=false, precision=9)
	private long offerId;

	@Column(length=255)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="list_price", length=60)
	private String listPrice;

	@Column(name="lower_limit", precision=6)
	private BigDecimal lowerLimit;

	@Column(name="offer_code", length=30)
	private String offerCode;

	@Column(name="offer_name", nullable=false, length=255)
	private String offerName;

	@Column(name="offer_type", nullable=false, length=1)
	private String offerType;

	@Column(length=1)
	private String operator;

	@Column(name="sale_cond", length=4000)
	private String saleCond;

	@Column(precision=9)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="upper_limit", precision=6)
	private BigDecimal upperLimit;

	public Offer() {
	}
}
