package org.ocs.billing.entity.con;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="con_res_detail")
@NamedQuery(name="ConResDetail.findAll", query="SELECT c FROM ConResDetail c")
public class ConResDetail implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="con_res_detail_id", unique=true, nullable=false, precision=9)
	private long conResDetailId;

	@Column(name="acct_item_type_id", precision=6)
	private BigDecimal acctItemTypeId;

	@Column(name="acct_res_id", precision=9)
	private BigDecimal acctResId;

	@Column(length=255)
	private String comments;

	@Column(name="exchange_rate", nullable=false, precision=9)
	private BigDecimal exchangeRate;

	@Column(name="exchange_value", nullable=false, precision=9)
	private BigDecimal exchangeValue;

	@Column(name="pay_indicator", length=30)
	private String payIndicator;

	@Column(precision=3)
	private BigDecimal priority;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to ConRe
	@ManyToOne
	@JoinColumn(name="con_res_id")
	private ConRe conRe;

	public ConResDetail() {
	}
}
