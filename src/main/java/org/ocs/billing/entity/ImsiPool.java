package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="imsi_pool")
@NamedQuery(name="ImsiPool.findAll", query="SELECT i FROM ImsiPool i")
public class ImsiPool implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=60)
	private String imsi;

	@Column(name="area_id", nullable=false, precision=6)
	private BigDecimal areaId;

	@Column(length=4000)
	private String comments;

	@Column(name="hlr_id", nullable=false, precision=6)
	private BigDecimal hlrId;

	@Column(name="imsi_state", nullable=false, length=1)
	private String imsiState;

	@Column(length=1)
	private String operator;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="src_method", length=1)
	private String srcMethod;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="used_type", length=1)
	private String usedType;

	public ImsiPool() {
	}

}
