package org.ocs.billing.entity.price;


import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_plan_selector")
@NamedQuery(name="PricePlanSelector.findAll", query="SELECT p FROM PricePlanSelector p")
public class PricePlanSector implements Serializable{
    
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PricePlanSelectorPK id;

	@Column(name="opt_type", nullable=false, length=1)
	private String optType;

    public PricePlanSector() {
    }

    
}
