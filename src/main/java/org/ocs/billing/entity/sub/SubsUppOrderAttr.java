package org.ocs.billing.entity.sub;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="subs_upp_order_attr")
@NamedQuery(name="SubsUppOrderAttr.findAll",query="SELECT s FROM SubsUppOrderAttr s")
public class SubsUppOrderAttr implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="attr_id", nullable=false, precision=9)
	private BigDecimal attrId;

	@Column(name="old_value", length=255)
	private String oldValue;

	@Column(name="operation_type", nullable=false, length=1)
	private String operationType;

	@Column(name="part_id", nullable=false, precision=6)
	private BigDecimal partId;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="subs_upp_order_id", nullable=false, precision=15)
	private BigDecimal subsUppOrderId;

	@Column(length=255)
	private String value;

	public SubsUppOrderAttr() {
	}
}
