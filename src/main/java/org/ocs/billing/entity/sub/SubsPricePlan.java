package org.ocs.billing.entity.sub;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.pPrice.PpricePlan;
import org.ocs.billing.entity.pPrice.PpricePlanType;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "subs_price_plan")
@NamedQuery(name = "SubsPricePlan.findAll", query = "SELECT s FROM SubsPricePlan s")
public class SubsPricePlan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	@JoinColumn(name = "price_plan_id", referencedColumnName = "price_plan_id", nullable = false)
	// @Column(name = "price_plan_id", nullable = false, precision = 6)
	private PpricePlan pricePlanId;

	// abaikan dulu
	@Column(name = "depend_prod_spec_id", precision = 6)
	private BigDecimal dependProdSpecId;

	@OneToOne
	@JoinColumn(name = "price_plan_id", referencedColumnName = "price_plan_id", nullable = false)
	// @Column(name = "price_plan_type", nullable = false, length = 1)
	private PpricePlanType pricePlanType;

	@Column(name = "sp_id", precision = 6)
	private BigDecimal spId;

	public SubsPricePlan() {
	}
}
