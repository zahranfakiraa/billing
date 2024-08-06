package org.ocs.billing.entity.rate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.ocs.billing.entity.mapping.Mapping;
import org.ocs.billing.entity.mapping.MappingType;
import org.ocs.billing.entity.re.RePriceSet;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="rate_plan")
@NamedQuery(name="RatePlan.findAll", query="SELECT r FROM RatePlan r")
public class RatePlan implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rate_plan_id", unique=true, nullable=false, precision=9)
	private long ratePlanId;

	@Column(length=1000)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="mapping_exit", length=1)
	private String mappingExit;

	@Column(precision=6)
	private BigDecimal priority;

	@Column(name="rate_plan_name", nullable=false, length=400)
	private String ratePlanName;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	//bi-directional many-to-one association to Mapping
	@OneToMany(mappedBy="ratePlan")
	private List<Mapping> mappings;

	//bi-directional many-to-one association to MappingType
	@ManyToOne
	@JoinColumn(name="mapping_type")
	private MappingType mappingTypeBean;

	//bi-directional many-to-one association to RateChargeType
	@ManyToOne
	@JoinColumn(name="rate_charge_type")
	private RateChargeType rateChargeTypeBean;

	//bi-directional many-to-one association to RatePlanType
	@ManyToOne
	@JoinColumn(name="rate_plan_type", nullable=false)
	private RatePlanType ratePlanTypeBean;

	//bi-directional many-to-one association to RePriceSet
	@ManyToOne
	@JoinColumn(name="re_price_set_id")
	private RePriceSet rePriceSet;

	//bi-directional many-to-one association to RatePlanZone
	@OneToMany(mappedBy="ratePlan")
	private List<RatePlanZone> ratePlanZones;

	public RatePlan() {
	}

    public Mapping addMapping(Mapping mapping) {
		getMappings().add(mapping);
		mapping.setRatePlan(this);

		return mapping;
	}

	public Mapping removeMapping(Mapping mapping) {
		getMappings().remove(mapping);
		mapping.setRatePlan(null);

		return mapping;
	}

    public RatePlanZone addRatePlanZone(RatePlanZone ratePlanZone) {
		getRatePlanZones().add(ratePlanZone);
		ratePlanZone.setRatePlan(this);

		return ratePlanZone;
	}

	public RatePlanZone removeRatePlanZone(RatePlanZone ratePlanZone) {
		getRatePlanZones().remove(ratePlanZone);
		ratePlanZone.setRatePlan(null);

		return ratePlanZone;
	}
}
