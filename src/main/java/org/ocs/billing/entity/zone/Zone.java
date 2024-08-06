package org.ocs.billing.entity.zone;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="zone")
@NamedQuery(name="Zone.findAll", query="SELECT z FROM Zone z")
public class Zone implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="zone_id", unique=true, nullable=false, precision=9)
	private long zoneId;

	@Column(length=1000)
	private String comments;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="zone_code", length=200)
	private String zoneCode;

	@Column(name="zone_name", nullable=false, length=200)
	private String zoneName;

	//bi-directional many-to-one association to Zone
	@ManyToOne
	@JoinColumn(name="parent_zone_id")
	private Zone zone;

	//bi-directional many-to-one association to Zone
	@OneToMany(mappedBy="zone")
	private List<Zone> zones;

	//bi-directional many-to-one association to ZoneMap
	@ManyToOne
	@JoinColumn(name="zone_map_id")
	private ZoneMap zoneMap;

	//bi-directional many-to-one association to ZoneValue
	@OneToMany(mappedBy="zone")
	private List<ZoneValue> zoneValues;

	public Zone() {
	}

    public Zone addZone(Zone zone) {
		getZones().add(zone);
		zone.setZone(this);

		return zone;
	}

	public Zone removeZone(Zone zone) {
		getZones().remove(zone);
		zone.setZone(null);

		return zone;
	}

    public ZoneValue addZoneValue(ZoneValue zoneValue) {
		getZoneValues().add(zoneValue);
		zoneValue.setZone(this);

		return zoneValue;
	}

	public ZoneValue removeZoneValue(ZoneValue zoneValue) {
		getZoneValues().remove(zoneValue);
		zoneValue.setZone(null);

		return zoneValue;
	}

}
