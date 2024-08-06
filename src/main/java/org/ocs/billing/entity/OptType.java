package org.ocs.billing.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="opt_type")
@NamedQuery(name="OptType.findAll", query="SELECT o FROM OptType o")
public class OptType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="opt_type", unique=true, nullable=false, length=1)
	private String optType;

	@Column(length=120)
	private String comments;

	@Column(name="opt_type_name", nullable=false, length=60)
	private String optTypeName;

	public OptType() {
	}
}
