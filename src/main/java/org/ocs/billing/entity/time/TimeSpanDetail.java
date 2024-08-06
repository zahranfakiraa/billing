package org.ocs.billing.entity.time;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="time_span_detail")
@NamedQuery(name="TimeSpanDetail.findAll", query="SELECT t FROM TimeSpanDetail t")
public class TimeSpanDetail implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="time_span_detail_id", unique=true, nullable=false, precision=9)
	private long timeSpanDetailId;

	@Temporal(TemporalType.DATE)
	@Column(name="cycle_begin_date")
	private Date cycleBeginDate;

	@Column(name="cycle_unit", precision=6)
	private BigDecimal cycleUnit;

	@Column(precision=9)
	private BigDecimal duration;

	@Column(nullable=false, precision=6)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="split_cdr_flag", length=1)
	private String splitCdrFlag;

	@Column(name="time_unit", length=1)
	private String timeUnit;

	//bi-directional many-to-one association to TimeSpan
	@ManyToOne
	@JoinColumn(name="time_span_id", nullable=false)
	private TimeSpan timeSpan;

	public TimeSpanDetail() {
	}
}
