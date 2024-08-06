package org.ocs.billing.entity.cond;


import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.work.WorkCondition;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cond_rank")
@NamedQuery(name="CondRank.findAll", query="SELECT c FROM CondRank c")
public class CondRank implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="rank_up_id", unique=true, nullable=false, precision=12)
	private long rankUpId;

	@Column(length=120)
	private String comments;

	@Column(nullable=false, precision=15)
	private BigDecimal duration;

	@Column(precision=9)
	private BigDecimal intervals;

	@Column(precision=9)
	private BigDecimal looptime;

	@Column(name="offset_", nullable=false, precision=9)
	private BigDecimal offset;

	@Column(name="offset_type", length=1)
	private String offsetType;

	@Column(nullable=false, precision=3)
	private BigDecimal seq;

	@Column(name="setup_fee_flag", length=1)
	private String setupFeeFlag;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to WorkCondition
	@ManyToOne
	@JoinColumn(name="work_condition_id")
	private WorkCondition workCondition;

	public CondRank() {
	}
}
