package org.ocs.billing.entity.prod;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="prod_spec_offer")
@NamedQuery(name="ProdSpecOffer.findAll", query="SELECT p FROM ProdSpecOffer p")
public class ProdSpecOffer implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="offer_id", unique=true, nullable=false, precision=9)
	private long offerId;

	@Column(name="prod_spec_id", nullable=false, precision=6)
	private BigDecimal prodSpecId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;
}
