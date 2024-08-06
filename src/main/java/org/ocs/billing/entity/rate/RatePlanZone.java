package org.ocs.billing.entity.rate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.ocs.billing.entity.mapping.MappingUnit;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="rate_plan_zone")
@NamedQuery(name="RatePlanZone.findAll", query="SELECT r FROM RatePlanZone r")
public class RatePlanZone implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rate_plan_zone_id", unique=true, nullable=false, precision=9)
	private long ratePlanZoneId;

	@Column(name="label_show", length=60)
	private String labelShow;

	@Column(name="mapping_des_type", length=1)
	private String mappingDesType;

	@Column(name="mapping_des_value", length=60)
	private String mappingDesValue;

	@Column(name="mapping_src_type", length=1)
	private String mappingSrcType;

	@Column(name="mapping_src_value", length=60)
	private String mappingSrcValue;

	@Column(precision=6)
	private BigDecimal priority;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to MappingUnit
	@OneToMany(mappedBy="ratePlanZone")
	private List<MappingUnit> mappingUnits;

	//bi-directional many-to-one association to RatePlan
	@ManyToOne
	@JoinColumn(name="rate_plan_id")
	private RatePlan ratePlan;

	public RatePlanZone() {
	}

    public MappingUnit addMappingUnit(MappingUnit mappingUnit) {
		getMappingUnits().add(mappingUnit);
		mappingUnit.setRatePlanZone(this);

		return mappingUnit;
	}

	public MappingUnit removeMappingUnit(MappingUnit mappingUnit) {
		getMappingUnits().remove(mappingUnit);
		mappingUnit.setRatePlanZone(null);

		return mappingUnit;
	}
}
