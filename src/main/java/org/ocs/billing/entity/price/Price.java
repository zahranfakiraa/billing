package org.ocs.billing.entity.price;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.ocs.billing.entity.re.ReAttr;
import org.ocs.billing.entity.re.RefValue;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price")
@NamedQuery(name="Price.findAll", query="SELECT p FROM Price p")
public class Price implements Serializable{
    
    @Id
	@Column(name="price_id", unique=true, nullable=false, precision=9)
	private long priceId;

	@Column(name="calc_type", length=1)
	private String calcType;

	@Column(length=1000)
	private String comments;

	@Column(name="con_res_id", precision=9)
	private BigDecimal conResId;

	@Column(name="configure_type", length=1)
	private String configureType;

	@Column(name="currency_type_id", precision=3)
	private BigDecimal currencyTypeId;

	@Column(name="exchange_re_attr", precision=6)
	private BigDecimal exchangeReAttr;

	@Column(name="exchange_rum", precision=12, scale=5)
	private BigDecimal exchangeRum;

	@Column(name="min_rum", precision=12)
	private BigDecimal minRum;

	@Column(name="price_name", nullable=false, length=120)
	private String priceName;

	@Column(name="price_type", length=1)
	private String priceType;

	@Column(precision=6)
	private BigDecimal priority;

	@Column(nullable=false, precision=12)
	private BigDecimal rum;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="src_price_id", precision=9)
	private BigDecimal srcPriceId;

	//bi-directional many-to-one association to PriceVer
	@ManyToOne
	@JoinColumn(name="price_ver_id")
	private PriceVer priceVer;

    // bi-directional many-to-one association to ReAttr
	@ManyToOne
	@JoinColumn(name="re_attr")
	private ReAttr reAttrBean;

	//bi-directional many-to-one association to RefValue
	@ManyToOne
	@JoinColumn(name="ref_value_id")
	private RefValue refValue;

	//bi-directional many-to-one association to PriceWorkNode
	@OneToMany(mappedBy="price")
	private List<PriceWorkNode> priceWorkNodes;

    public Price() {
	}

    public PriceWorkNode addPriceWorkNode(PriceWorkNode priceWorkNode) {
		getPriceWorkNodes().add(priceWorkNode);
		priceWorkNode.setPrice(this);

		return priceWorkNode;
	}

	public PriceWorkNode removePriceWorkNode(PriceWorkNode priceWorkNode) {
		getPriceWorkNodes().remove(priceWorkNode);
		priceWorkNode.setPrice(null);

		return priceWorkNode;
	}
}
