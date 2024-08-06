package org.ocs.billing.entity.price;


import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_plan_attr")
@NamedQuery(name="PricePlanAttr.findAll", query="SELECT p FROM PricePlanAttr p")
public class PricePlanAttr implements Serializable{
    
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PricePlanAttrPK id;

	@Column(name="attr_value_id", precision=6)
	private BigDecimal attrValueId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public PricePlanAttr() {
	}
}
