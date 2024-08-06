package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="wholesale_inst")
@NamedQuery(name="WholesaleInst.findAll", query="SELECT w FROM WholesaleInst w")
public class WholesaleInst implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="acc_nbr_id", precision=12)
	private BigDecimal accNbrId;

	@Column(length=255)
	private String comments;

	@Column(name="ext_attr", length=4000)
	private String extAttr;

	@Column(name="goods_id", precision=15)
	private BigDecimal goodsId;

	@Column(name="is_send_sap", length=1)
	private String isSendSap;

	@Column(name="part_id", nullable=false, precision=6)
	private BigDecimal partId;

	@Column(precision=6)
	private BigDecimal seq;

	@Column(name="sim_card_id", precision=12)
	private BigDecimal simCardId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="subs_id", precision=15)
	private BigDecimal subsId;

	@Column(name="subs_order_id", precision=15)
	private BigDecimal subsOrderId;

	@Column(name="wholesale_id", nullable=false, precision=9)
	private BigDecimal wholesaleId;

	@Column(name="wholesale_inst_id", nullable=false, precision=15)
	private BigDecimal wholesaleInstId;

	public WholesaleInst() {
	}

}
