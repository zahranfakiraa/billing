package org.ocs.billing.entity.prod;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="prod_spec_rela")
@NamedQuery(name="ProdSpecRela.findAll", query="SELECT p FROM ProdSpecRela p")
public class ProdSpecRela implements Serializable {
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProdSpecRelaPK id;

	@Column(name="rela_type", nullable=false, length=1)
	private String relaType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;
}
