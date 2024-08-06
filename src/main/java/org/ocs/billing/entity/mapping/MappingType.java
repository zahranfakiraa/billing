package org.ocs.billing.entity.mapping;

import java.io.Serializable;
import java.util.List;

import org.ocs.billing.entity.rate.RatePlan;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="mapping_type")
@NamedQuery(name="MappingType.findAll", query="SELECT m FROM MappingType m")
public class MappingType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mapping_type", unique=true, nullable=false, length=1)
	private String mappingType;

	@Column(length=1000)
	private String comments;

	@Column(name="type_name", nullable=false, length=120)
	private String typeName;

	//bi-directional many-to-one association to RatePlan
	@OneToMany(mappedBy="mappingTypeBean")
	private List<RatePlan> ratePlans;

	public MappingType() {
	}

    public RatePlan addRatePlan(RatePlan ratePlan) {
		getRatePlans().add(ratePlan);
		ratePlan.setMappingTypeBean(this);

		return ratePlan;
	}

	public RatePlan removeRatePlan(RatePlan ratePlan) {
		getRatePlans().remove(ratePlan);
		ratePlan.setMappingTypeBean(null);

		return ratePlan;
	}


}
