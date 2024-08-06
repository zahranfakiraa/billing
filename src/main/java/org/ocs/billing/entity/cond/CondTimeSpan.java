package org.ocs.billing.entity.cond;


import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.time.TimeSpan;
import org.ocs.billing.entity.work.WorkCondition;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cond_time_span")
@NamedQuery(name="CondTimeSpan.findAll", query="SELECT c FROM CondTimeSpan c")
public class CondTimeSpan implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="time_span_up_id", unique=true, nullable=false, precision=12)
	private long timeSpanUpId;

	@Column(length=120)
	private String comments;

	@Column(nullable=false, precision=3)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="time_span_up_mode", length=1)
	private String timeSpanUpMode;

	//bi-directional many-to-one association to TimeSpan
	@ManyToOne
	@JoinColumn(name="time_span_id")
	private TimeSpan timeSpan;

	//bi-directional many-to-one association to WorkCondition
	@ManyToOne
	@JoinColumn(name="work_condition_id", nullable=false)
	private WorkCondition workCondition;

	public CondTimeSpan() {
	}
}
