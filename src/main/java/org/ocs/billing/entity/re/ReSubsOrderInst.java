package org.ocs.billing.entity.re;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="re_subs_order_inst")
@NamedQuery(name="ReSubsOrderInst.findAll", query="SELECT r FROM ReSubsOrderInst r")
public class ReSubsOrderInst implements Serializable {
    private static final long serialVersionUID = 1L;

	@Column(name="event_inst_id", nullable=false, precision=15)
	private BigDecimal eventInstId;

	@Column(name="part_id", nullable=false, precision=6)
	private BigDecimal partId;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="subs_order_id", nullable=false, precision=15)
	private BigDecimal subsOrderId;

	public ReSubsOrderInst() {
	}
}
