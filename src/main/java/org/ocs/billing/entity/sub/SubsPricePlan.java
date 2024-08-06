package org.ocs.billing.entity.sub;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="subs_price_plan")
@NamedQuery(name="SubsPricePlan.findAll", query="SELECT s FROM SubsPricePlan s")
public class SubsPricePlan implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="depend_prod_spec_id", precision=6)
	private BigDecimal dependProdSpecId;

	@Column(name="price_plan_id", nullable=false, precision=6)
	private BigDecimal pricePlanId;

	@Column(name="price_plan_type", nullable=false, length=1)
	private String pricePlanType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public SubsPricePlan() {
	}

}
