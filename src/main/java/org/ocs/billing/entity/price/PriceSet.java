package org.ocs.billing.entity.price;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_set")
@NamedQuery(name="PriceSet.findAll", query="SELECT p FROM PriceSet p")
public class PriceSet implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="price_set_id")
    private long priceSetId;

    @Column(name="apply_level")
    private String applyLevel;

    @Column(name="price_set_priority", precision=6)
    private BigDecimal priceSetPriority;

    @Column(name="priority",precision=6)
    private BigDecimal priority;

    @Column(name="sp_id", precision=6)
    private BigDecimal spId;

    public PriceSet() {
    }

    
}
