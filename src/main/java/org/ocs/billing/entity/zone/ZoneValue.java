package org.ocs.billing.entity.zone;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="zone_value")
@NamedQuery(name="ZoneValue.findAll", query="SELECT z FROM ZoneValue z")
public class ZoneValue implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="zone_value_id", unique=true, nullable=false, precision=12)
	private long zoneValueId;

	@Column(length=1000)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="exp_value", length=60)
	private String expValue;

	@Column(nullable=false, precision=6)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="std_code", length=60)
	private String stdCode;

	@Column(nullable=false, length=65)
	private String value;

	//bi-directional many-to-one association to Zone
	@ManyToOne
	@JoinColumn(name="zone_id", nullable=false)
	private Zone zone;

	public ZoneValue() {
	}
}
