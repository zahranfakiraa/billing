package org.ocs.billing.entity.re;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.ocs.billing.entity.DefReAttr;
import org.ocs.billing.entity.price.Price;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="re_attr")
@NamedQuery(name="ReAttr.findAll", query="SELECT r FROM ReAttr r")
public class ReAttr implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="re_attr", unique=true, nullable=false, precision=6)
	private long reAttr;

	@Column(length=1000)
	private String comments;

	@Column(nullable=false, length=1)
	private String measurable;

	@Column(name="re_attr_code", length=30)
	private String reAttrCode;

	@Column(name="re_attr_name", nullable=false, length=120)
	private String reAttrName;

	@Column(name="re_attr_src_type", nullable=false, length=1)
	private String reAttrSrcType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	// //bi-directional one-to-one association to DefReAttr
	@OneToOne(mappedBy="reAttrBean")
	private DefReAttr defReAttr;

	//bi-directional many-to-one association to Price
	@OneToMany(mappedBy="reAttrBean")
	private List<Price> prices;

	//bi-directional many-to-one association to ReType
	@ManyToOne
	@JoinColumn(name="re_type")
	private ReType reTypeBean;

	public ReAttr() {
	}

    public Price addPrice(Price price) {
		getPrices().add(price);
		price.setReAttrBean(this);

		return price;
	}

	public Price removePrice(Price price) {
		getPrices().remove(price);
		price.setReAttrBean(null);

		return price;
	}
}
