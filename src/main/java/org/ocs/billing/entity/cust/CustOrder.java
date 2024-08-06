package org.ocs.billing.entity.cust;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cust_order")
@NamedQuery(name="CustOrder.findAll", query="SELECT c FROM CustOrder c")
public class CustOrder implements Serializable{
    private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="accept_date", nullable=false)
	private Date acceptDate;

	@Column(name="cart_info", length=4000)
	private String cartInfo;

	@Temporal(TemporalType.DATE)
	@Column(name="confirm_date")
	private Date confirmDate;

	@Column(length=60)
	private String contact;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="cust_contact_id", nullable=false, precision=15)
	private BigDecimal custContactId;

	@Column(name="cust_id", nullable=false, precision=15)
	private BigDecimal custId;

	@Column(name="cust_order_id", nullable=false, precision=15)
	private BigDecimal custOrderId;

	@Column(name="deliver_info", length=4000)
	private String deliverInfo;

	@Column(length=60)
	private String ip;

	@Column(name="part_id", nullable=false, precision=6)
	private BigDecimal partId;

	@Column(name="party_code", length=30)
	private String partyCode;

	@Column(name="party_type", nullable=false, length=1)
	private String partyType;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="survey_state", length=1)
	private String surveyState;

	public CustOrder() {
	}
}
