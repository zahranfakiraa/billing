package org.ocs.billing.entity.subs;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="subs_user_order")
@NamedQuery(name="SubsUserOrder.findAll",query="SELECT s FROM SubsUserOrder s")
public class SubsUserOrder implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="cust_id", nullable=false, precision=15)
	private BigDecimal custId;

	@Column(name="old_cust_id", precision=15)
	private BigDecimal oldCustId;

	@Column(name="operation_type", nullable=false, length=1)
	private String operationType;

	@Column(name="part_id", nullable=false, precision=6)
	private BigDecimal partId;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="subs_order_id", nullable=false, precision=15)
	private BigDecimal subsOrderId;

	public SubsUserOrder() {
	}
}
