package org.ocs.billing.entity.bundle;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bundle_price_plan")
@NamedQuery(name="BundlePricePlan.findAll", query="SELECT b FROM BundlePricePlan b")
public class BundlePricePlan implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BundlePricePlanPK id;

	@Column(name="eff_cycle", precision=6)
	private BigDecimal effCycle;

	@Column(precision=6)
	private BigDecimal quantity;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="time_unit", length=1)
	private String timeUnit;

	public BundlePricePlan() {
	}

}
