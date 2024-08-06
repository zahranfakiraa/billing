package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="dps_group")
@NamedQuery(name="DpsGroup.findAll", query="SELECT d FROM DpsGroup d")
public class DpsGroup implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dps_group_id", unique=true, nullable=false, precision=6)
	private long dpsGroupId;

	@Column(name="bundle_unit_id", nullable=false, precision=6)
	private BigDecimal bundleUnitId;

	@Column(name="group_type", nullable=false, length=1)
	private String groupType;

	@Column(nullable=false, length=1)
	private String necessary;

	@Column(name="prod_spec_group_name", nullable=false, length=60)
	private String prodSpecGroupName;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public DpsGroup() {
	}
}
