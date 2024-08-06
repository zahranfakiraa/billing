package org.ocs.billing.entity.cond;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.work.WorkCondition;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cond_acm")
@NamedQuery(name="CondAcm.findAll", query="SELECT c FROM CondAcm c")
public class CondAcm implements Serializable{
    
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="acm_up_id", unique=true, nullable=false, precision=12)
	private long acmUpId;

	@Column(length=120)
	private String comments;

	@Column(name="eff_value", precision=15)
	private BigDecimal effValue;

	@Column(name="exp_value", precision=15)
	private BigDecimal expValue;

	@Column(precision=15)
	private BigDecimal intervals;

	@Column(precision=9)
	private BigDecimal looptime;

	@Column(name="ref_resource_id", precision=9)
	private BigDecimal refResourceId;

	@Column(nullable=false, precision=3)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to WorkCondition
	@ManyToOne
	@JoinColumn(name="work_condition_id")
	private WorkCondition workCondition;

	public CondAcm() {
	}
}
