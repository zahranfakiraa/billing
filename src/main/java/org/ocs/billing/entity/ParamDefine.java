package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="param_define")
@NamedQuery(name="ParamDefine.findAll", query="SELECT p FROM ParamDefine p")
public class ParamDefine implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="param_id", unique=true, nullable=false, precision=9)
	private long paramId;

	@Column(length=1000)
	private String comments;

	@Column(name="is_global", length=1)
	private String isGlobal;

	@Column(name="param_code", length=30)
	private String paramCode;

	@Column(name="param_name", nullable=false, length=120)
	private String paramName;

	@Column(name="param_type", nullable=false, length=1)
	private String paramType;

	@Column(name="price_plan_id", precision=9)
	private BigDecimal pricePlanId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	public ParamDefine() {
	}
}
