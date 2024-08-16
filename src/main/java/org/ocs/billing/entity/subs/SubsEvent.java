package org.ocs.billing.entity.subs;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="subs_event")
@NamedQuery(name="SubsEvent.findAll",query="SELECT s FROM SubsEvent s")
public class SubsEvent implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="subs_event_id", unique=true, nullable=false, precision=6)
	private long subsEventId;

	@Column(name="bill_service_offer", length=30)
	private String billServiceOffer;

	@Column(name="bill_service_offer_name", length=120)
	private String billServiceOfferName;

	@Column(length=120)
	private String comments;

	@Column(name="csr_visible", length=1)
	private String csrVisible;

	@Column(name="event_catg", nullable=false, length=1)
	private String eventCatg;

	@Column(name="event_code", length=60)
	private String eventCode;

	@Column(name="event_name", nullable=false, length=60)
	private String eventName;

	@Column(name="obj_prod_state", length=1)
	private String objProdState;

	@Column(name="otc_flag", length=1)
	private String otcFlag;

	@Column(precision=6)
	private BigDecimal priority;

	@Column(name="state_set", length=60)
	private String stateSet;

	@Column(name="timer_event_adjust_mins", length=10)
	private String timerEventAdjustMins;

	public SubsEvent() {
	}
}
