package org.ocs.billing.entity.re;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="re")
@NamedQuery(name="Re.findAll", query="SELECT r FROM Re r")
public class Re implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="re_id", unique=true, nullable=false, precision=9)
	private long reId;

	@Column(length=1000)
	private String comments;

	@Column(name="re_code", length=30)
	private String reCode;

	@Column(name="re_display_name", length=500)
	private String reDisplayName;

	@Column(name="re_name", nullable=false, length=500)
	private String reName;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to ReType
	@ManyToOne
	@JoinColumn(name="re_type", nullable=false)
	private ReType reTypeBean;

	public Re() {
	}

}
