package org.ocs.billing.entity.prod;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="prod_selector")
@NamedQuery(name="ProdSelector.findAll", query="SELECT p FROM ProdSelector p")
public class ProdSelector implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProdSelectorPK id;

	@Column(name="opt_type", nullable=false, length=1)
	private String optType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;
}
