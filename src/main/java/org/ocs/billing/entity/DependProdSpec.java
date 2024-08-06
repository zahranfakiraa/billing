package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="depend_prod_spec")
@NamedQuery(name="DependProdSpec.findAll", query="SELECT d FROM DependProdSpec d")
public class DependProdSpec implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="depend_prod_spec_id", unique=true, nullable=false, precision=6)
	private long dependProdSpecId;

	@Column(name="depend_prod_spec_type", nullable=false, length=1)
	private String dependProdSpecType;

	@Column(name="serv_type", precision=3)
	private BigDecimal servType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public DependProdSpec() {
	}
}
