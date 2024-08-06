package org.ocs.billing.entity.Om;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="om_order")
@NamedQuery(name="OmOrder.findAll", query="SELECT o FROM OmOrder o")
public class OmOrder implements Serializable{
    private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="completed_date")
	private Date completedDate;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="in_rollback", length=1)
	private String inRollback;

	@Column(name="order_id", nullable=false, precision=15)
	private BigDecimal orderId;

	@Column(name="parent_order_id", precision=15)
	private BigDecimal parentOrderId;

	@Column(name="part_id", nullable=false, precision=6)
	private BigDecimal partId;

	@Column(precision=6)
	private BigDecimal priority;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(precision=6)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="wf_templet_id", nullable=false, precision=6)
	private BigDecimal wfTempletId;

	public OmOrder() {
	}

}
