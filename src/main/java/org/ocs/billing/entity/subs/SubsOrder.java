package org.ocs.billing.entity.subs;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="subs_order")
@NamedQuery(name="SubsOrder.findAll",query="SELECT s FROM SubsOrder s")
public class SubsOrder implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="acc_nbr", length=60)
	private String accNbr;

	@Column(name="accept_type", nullable=false, length=1)
	private String acceptType;

	@Column(name="agent_id", precision=9)
	private BigDecimal agentId;

	@Column(name="area_id", nullable=false, precision=6)
	private BigDecimal areaId;

	@Temporal(TemporalType.DATE)
	@Column(name="besp_date")
	private Date bespDate;

	@Column(name="besp_no", length=30)
	private String bespNo;

	@Column(name="cancel_party_code", length=30)
	private String cancelPartyCode;

	@Column(name="cancel_party_type", length=1)
	private String cancelPartyType;

	@Column(name="cancel_reason", length=255)
	private String cancelReason;

	@Column(name="cc_order_id", precision=15)
	private BigDecimal ccOrderId;

	@Column(length=4000)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="completed_date")
	private Date completedDate;

	@Column(name="credit_limit", precision=9)
	private BigDecimal creditLimit;

	@Column(name="cust_order_id", nullable=false, precision=15)
	private BigDecimal custOrderId;

	@Column(name="def_lang_id", precision=6)
	private BigDecimal defLangId;

	@Column(name="fg_code", length=60)
	private String fgCode;

	@Column(name="instalment_type_id", precision=3)
	private BigDecimal instalmentTypeId;

	@Column(name="is_print", length=1)
	private String isPrint;

	@Column(name="is_send_notify", length=1)
	private String isSendNotify;

	@Column(name="offer_id", precision=9)
	private BigDecimal offerId;

	@Column(name="old_fg_code", length=30)
	private String oldFgCode;

	@Column(name="old_offer_id", precision=9)
	private BigDecimal oldOfferId;

	@Column(name="order_id", precision=15)
	private BigDecimal orderId;

	@Column(name="order_nbr", nullable=false, length=60)
	private String orderNbr;

	@Column(name="order_reason", length=255)
	private String orderReason;

	@Column(name="order_reason_id", precision=6)
	private BigDecimal orderReasonId;

	@Column(name="order_state", nullable=false, length=1)
	private String orderState;

	@Column(name="org_id", precision=9)
	private BigDecimal orgId;

	@Column(name="part_id", nullable=false, precision=6)
	private BigDecimal partId;

	@Column(name="pps_pwd", length=60)
	private String ppsPwd;

	@Column(length=60)
	private String prefix;

	@Column(precision=6)
	private BigDecimal priority;

	@Column(name="program_id", precision=9)
	private BigDecimal programId;

	@Column(name="promotion_id", length=30)
	private String promotionId;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(precision=6)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="stock_state", length=1)
	private String stockState;

	@Column(name="sub_promotion_id", length=30)
	private String subPromotionId;

	@Column(name="subs_event_id", nullable=false, precision=6)
	private BigDecimal subsEventId;

	@Column(name="subs_id", nullable=false, precision=15)
	private BigDecimal subsId;

	@Column(name="subs_order_id", nullable=false, precision=15)
	private BigDecimal subsOrderId;

	@Column(name="survey_state", length=1)
	private String surveyState;

	@Temporal(TemporalType.DATE)
	@Column(name="timer_date")
	private Date timerDate;

	@Column(name="\"trans_id \"", length=60)
	private String transId_;

	@Temporal(TemporalType.DATE)
	@Column(name="validity_time")
	private Date validityTime;

	public SubsOrder() {
	}
}
