package org.ocs.billing.entity.bill;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bill_offer_attr")
@NamedQuery(name="BillOfferAttr.findAll", query="SELECT b FROM BillOfferAttr b")
public class BillOfferAttr implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="offer_attr_id", unique=true, nullable=false, precision=16)
	private long offerAttrId;

	@Column(name="attr_id", nullable=false, precision=6)
	private BigDecimal attrId;

	@Column(name="default_value", length=255)
	private String defaultValue;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date")
	private Date effDate;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="offer_id", nullable=false, precision=9)
	private BigDecimal offerId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public BillOfferAttr() {
	}
}
