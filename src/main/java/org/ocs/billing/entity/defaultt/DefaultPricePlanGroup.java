package org.ocs.billing.entity.defaultt;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="default_price_plan_group")
@NamedQuery(name="DefaultPricePlanGroup.findAll", query="SELECT d FROM DefaultPricePlanGroup d")
public class DefaultPricePlanGroup implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DefaultPricePlanGroupPK id;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public DefaultPricePlanGroup() {
	}
}
