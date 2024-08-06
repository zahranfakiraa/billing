package org.ocs.billing.entity.pPrice;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="pprice_plan_type")
@NamedQuery(name="PpricePlanType.findAll", query="SELECT p FROM PpricePlanType p")
public class PpricePlanType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_plan_type", unique=true, nullable=false, length=1)
	private String pricePlanType;

	@Column(length=120)
	private String comments;

	@Column(name="price_plan_type_name", nullable=false, length=60)
	private String pricePlanTypeName;

	public PpricePlanType() {
	}
}
