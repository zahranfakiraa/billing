package org.ocs.billing.entity.mapping;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.ocs.billing.entity.price.PriceVer;
import org.ocs.billing.entity.rate.RatePlan;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="mapping")
@NamedQuery(name="Mapping.findAll", query="SELECT m FROM Mapping m")
public class Mapping implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mapping_id", unique=true, nullable=false, precision=9)
	private long mappingId;

	@Column(name="mapping_default", length=1)
	private String mappingDefault;

	@Column(name="mapping_name", nullable=false, length=400)
	private String mappingName;

	@Column(precision=6)
	private BigDecimal priority;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to RatePlan
	@ManyToOne
	@JoinColumn(name="rate_plan_id")
	private RatePlan ratePlan;

	// //bi-directional many-to-one association to MappingConditionAction
	@OneToMany(mappedBy="mapping")
	private List<MappingConditionAction> mappingConditionActions;

	// //bi-directional many-to-one association to MappingConditionGroup
	@OneToMany(mappedBy="mapping")
	private List<MappingConditionGroup> mappingConditionGroups;

	// //bi-directional many-to-one association to MappingUnit
	@OneToMany(mappedBy="mapping")
	private List<MappingUnit> mappingUnits;

	//bi-directional many-to-one association to PriceVer
	@OneToMany(mappedBy="mapping")
	private List<PriceVer> priceVers;

	public Mapping() {
	}

    public MappingConditionAction addMappingConditionAction(MappingConditionAction mappingConditionAction) {
		getMappingConditionActions().add(mappingConditionAction);
		mappingConditionAction.setMapping(this);

		return mappingConditionAction;
	}

	public MappingConditionAction removeMappingConditionAction(MappingConditionAction mappingConditionAction) {
		getMappingConditionActions().remove(mappingConditionAction);
		mappingConditionAction.setMapping(null);

		return mappingConditionAction;
	}

    public MappingConditionGroup addMappingConditionGroup(MappingConditionGroup mappingConditionGroup) {
		getMappingConditionGroups().add(mappingConditionGroup);
		mappingConditionGroup.setMapping(this);

		return mappingConditionGroup;
	}

	public MappingConditionGroup removeMappingConditionGroup(MappingConditionGroup mappingConditionGroup) {
		getMappingConditionGroups().remove(mappingConditionGroup);
		mappingConditionGroup.setMapping(null);

		return mappingConditionGroup;
	}

    public MappingUnit addMappingUnit(MappingUnit mappingUnit) {
		getMappingUnits().add(mappingUnit);
		mappingUnit.setMapping(this);

		return mappingUnit;
	}

	public MappingUnit removeMappingUnit(MappingUnit mappingUnit) {
		getMappingUnits().remove(mappingUnit);
		mappingUnit.setMapping(null);

		return mappingUnit;
	}

    public PriceVer addPriceVer(PriceVer priceVer) {
		getPriceVers().add(priceVer);
		priceVer.setMapping(this);

		return priceVer;
	}

	public PriceVer removePriceVer(PriceVer priceVer) {
		getPriceVers().remove(priceVer);
		priceVer.setMapping(null);

		return priceVer;
	}

}
