package org.ocs.billing.entity.lifecycle;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="lifecycle_type")
@NamedQuery(name="LifecycleType.findAll", query="SELECT l FROM LifecycleType l")
public class LifecycleType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="lifecycle_type", unique=true, nullable=false, precision=6)
	private long lifecycleType;

	@Column(length=255)
	private String comments;

	@Column(name="lifecycle_type_name", nullable=false, length=60)
	private String lifecycleTypeName;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public LifecycleType() {
	}
}
