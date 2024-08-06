package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="indep_prod_spec")
@NamedQuery(name="IndepProdSpec.findAll", query="SELECT i FROM IndepProdSpec i")
public class IndepProdSpec implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="indep_prod_spec_id", unique=true, nullable=false, precision=6)
	private long indepProdSpecId;

	@Column(name="serv_type", nullable=false, precision=3)
	private BigDecimal servType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public IndepProdSpec() {
	}
}
