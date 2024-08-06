package org.ocs.billing.entity.lifecycle;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="lifecycle_apply")
@NamedQuery(name="LifecycleApply.findAll", query="SELECT l FROM LifecycleApply l")
public class LifecycleApply implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="prod_spec_id", unique=true, nullable=false, precision=6)
	private long prodSpecId;

	@Column(name="lifecycle_type", nullable=false, precision=6)
	private BigDecimal lifecycleType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public LifecycleApply() {
	}
}
