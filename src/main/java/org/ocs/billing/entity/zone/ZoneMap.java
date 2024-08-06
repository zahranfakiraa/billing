package org.ocs.billing.entity.zone;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="zone_map")
@NamedQuery(name="ZoneMap.findAll", query="SELECT z FROM ZoneMap z")
public class ZoneMap implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="zone_map_id", unique=true, nullable=false, precision=9)
	private long zoneMapId;

	@Column(length=1000)
	private String comments;

	@Column(name="gl_type_id", precision=9)
	private BigDecimal glTypeId;

	@Column(name="match_mode", nullable=false, length=1)
	private String matchMode;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="std_code", length=30)
	private String stdCode;

	@Column(name="zone_map_name", nullable=false, length=120)
	private String zoneMapName;

	@Column(name="zone_map_type", precision=3)
	private BigDecimal zoneMapType;

	//bi-directional many-to-one association to Zone
	@OneToMany(mappedBy="zoneMap")
	private List<Zone> zones;

	public ZoneMap() {
	}

    public Zone addZone(Zone zone) {
		getZones().add(zone);
		zone.setZoneMap(this);

		return zone;
	}

	public Zone removeZone(Zone zone) {
		getZones().remove(zone);
		zone.setZoneMap(null);

		return zone;
	}

}
