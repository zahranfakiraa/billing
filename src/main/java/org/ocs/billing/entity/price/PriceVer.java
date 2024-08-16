package org.ocs.billing.entity.price;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.ocs.billing.entity.bal.BalEventRule;
import org.ocs.billing.entity.mapping.Mapping;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_ver")
@NamedQuery(name="PriceVer.findAll", query="SELECT p FROM PriceVer p")
public class PriceVer implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_ver_id", unique=true, nullable=false, precision=9)
	private long priceVerId;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

    //bi-directional one-to-one association to BalEventRule
	@OneToOne(mappedBy="priceVer")
	private BalEventRule balEventRule;

	//bi-directional many-to-one association to Price
	@OneToMany(mappedBy="priceVer")
	private List<Price> prices;

	//bi-directional many-to-one association to Mapping
	@ManyToOne
	@JoinColumn(name="mapping_id")
	private Mapping mapping;

    public PriceVer() {
        
    }

    public Price addPrice(Price price) {
		getPrices().add(price);
		price.setPriceVer(this);

		return price;
	}

	

    public Price removePrice(Price price) {
		getPrices().remove(price);
		price.setPriceVer(null);

		return price;
	}
}
