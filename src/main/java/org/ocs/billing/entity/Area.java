package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="area")
@NamedQuery(name="Area.findAll", query="SELECT a FROM Area a")
public class Area implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="area_id", unique=true, nullable=false, precision=6)
	private long areaId;

	@Column(name="area_code", length=60)
	private String areaCode;

	@Column(name="area_name", nullable=false, length=60)
	private String areaName;

	@Column(length=255)
	private String comments;

	@Column(name="parent_id", precision=6)
	private BigDecimal parentId;

	@Column(length=30)
	private String prefix;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public Area() {
	}

}
