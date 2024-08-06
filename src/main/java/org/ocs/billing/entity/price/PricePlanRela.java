package org.ocs.billing.entity.price;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_plan_rela")
@NamedQuery(name="PricePlanRela.findAll", query="SELECT p FROM PricePlanRela p")
public class PricePlanRela implements Serializable {
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PricePlanRelaPK id;

	@Column(name="rela_type", length=1)
	private String relaType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public PricePlanRela() {
	}
}
