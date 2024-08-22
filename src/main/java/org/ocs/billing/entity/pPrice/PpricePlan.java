package org.ocs.billing.entity.pPrice;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="pprice_plan")
@NamedQuery(name="PpricePlan.findAll", query="SELECT p FROM PpricePlan p")
public class PpricePlan implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_plan_id", unique=true, nullable=false, precision=6)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long pricePlanId;

	@Column(name="apply_level", nullable=false, length=1)
	private String applyLevel;

	@Column(length=4000)
	private String comments;

	@Column(name="policy_flag", length=1)
	private String policyFlag;

	@Column(name="price_plan_code", length=60)
	private String pricePlanCode;

	@Column(name="price_plan_name", nullable=false, length=255)
	private String pricePlanName;

	@Column(precision=6)
	private BigDecimal priority;

	@Column(name="serv_type", precision=3)
	private BigDecimal servType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="warn_level", length=1)
	private String warnLevel;



	public PpricePlan() {
	}

}
