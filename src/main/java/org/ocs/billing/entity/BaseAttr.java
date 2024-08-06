package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="base_attr")
@NamedQuery(name="BaseAttr.findAll", query="SELECT b FROM BaseAttr b")
public class BaseAttr implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="base_attr_id", unique=true, nullable=false, precision=6)
	private long baseAttrId;

	@Column(length=4000)
	private String comments;

	@Column(name="default_value", length=60)
	private String defaultValue;

	@Column(name="input_type", nullable=false, length=1)
	private String inputType;

	@Column(nullable=false, length=1)
	private String nullable;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="value_script", length=4000)
	private String valueScript;

	public BaseAttr() {
	}
}
