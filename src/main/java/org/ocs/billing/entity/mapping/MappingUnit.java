package org.ocs.billing.entity.mapping;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.rate.RatePlanZone;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="mapping_unit")
@NamedQuery(name="MappingUnit.findAll", query="SELECT m FROM MappingUnit m")
public class MappingUnit  implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MappingUnitPK id;

	@Column(name="mapping_match_type", length=1)
	private String mappingMatchType;

	@Column(name="mapping_type", length=1)
	private String mappingType;

	@Column(name="mapping_value", length=60)
	private String mappingValue;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to Mapping
	@ManyToOne
	@JoinColumn(name="mapping_id", nullable=false, insertable=false, updatable=false)
	private Mapping mapping;

	//bi-directional many-to-one association to RatePlanZone
	@ManyToOne
	@JoinColumn(name="rate_plan_zone_id", nullable=false, insertable=false, updatable=false)
	private RatePlanZone ratePlanZone;

	public MappingUnit() {
	}
}
