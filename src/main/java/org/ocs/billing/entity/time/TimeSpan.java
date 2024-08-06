package org.ocs.billing.entity.time;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.ocs.billing.entity.cond.CondTimeSpan;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="time_span")
@NamedQuery(name="TimeSpan.findAll", query="SELECT t FROM TimeSpan t")
public class TimeSpan implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="time_span_id", unique=true, nullable=false, precision=9)
	private long timeSpanId;

	@Column(length=1000)
	private String comments;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="time_span_code", length=30)
	private String timeSpanCode;

	@Column(name="time_span_name", nullable=false, length=120)
	private String timeSpanName;

	//bi-directional many-to-one association to CondTimeSpan
	@OneToMany(mappedBy="timeSpan")
	private List<CondTimeSpan> condTimeSpans;

	//bi-directional many-to-one association to TimeSpanDetail
	@OneToMany(mappedBy="timeSpan")
	private List<TimeSpanDetail> timeSpanDetails;

	public TimeSpan() {
	}

    public CondTimeSpan addCondTimeSpan(CondTimeSpan condTimeSpan) {
		getCondTimeSpans().add(condTimeSpan);
		condTimeSpan.setTimeSpan(this);

		return condTimeSpan;
	}

	public CondTimeSpan removeCondTimeSpan(CondTimeSpan condTimeSpan) {
		getCondTimeSpans().remove(condTimeSpan);
		condTimeSpan.setTimeSpan(null);

		return condTimeSpan;
	}

    public TimeSpanDetail addTimeSpanDetail(TimeSpanDetail timeSpanDetail) {
		getTimeSpanDetails().add(timeSpanDetail);
		timeSpanDetail.setTimeSpan(this);

		return timeSpanDetail;
	}

	public TimeSpanDetail removeTimeSpanDetail(TimeSpanDetail timeSpanDetail) {
		getTimeSpanDetails().remove(timeSpanDetail);
		timeSpanDetail.setTimeSpan(null);

		return timeSpanDetail;
	}
}
