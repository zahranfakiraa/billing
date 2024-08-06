package org.ocs.billing.entity.offer;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="offer_catg")
@NamedQuery(name="OfferCatg.findAll", query="SELECT o FROM OfferCatg o")
public class OfferCatg implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="offer_catg_id", unique=true, nullable=false, precision=9)
	private long offerCatgId;

	@Column(length=255)
	private String comments;

	@Column(name="contact_channel_id", nullable=false, precision=3)
	private BigDecimal contactChannelId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="offer_catg_code", length=30)
	private String offerCatgCode;

	@Column(name="offer_catg_name", nullable=false, length=60)
	private String offerCatgName;

	@Column(name="parent_offer_catg_id", precision=9)
	private BigDecimal parentOfferCatgId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public OfferCatg() {
	}
}
