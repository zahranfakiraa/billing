package org.ocs.billing.entity.sim;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="sim_type")
@NamedQuery(name="SimType.findAll", query="SELECT s FROM SimType s")
public class SimType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sim_type_id", unique=true, nullable=false, precision=3)
	private long simTypeId;

	@Column(length=120)
	private String comments;

	@Column(name="fg_code", length=30)
	private String fgCode;

	@Column(name="sim_class", length=1)
	private String simClass;

	@Column(name="sim_type_code", nullable=false, length=1)
	private String simTypeCode;

	@Column(name="sim_type_name", nullable=false, length=60)
	private String simTypeName;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public SimType() {
	}

}
