package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_price_deposit")
@NamedQuery(name="CpcOtcPriceDeposit.findAll", query="SELECT c FROM CpcOtcPriceDeposit c")
public class CpcOtcPriceDeposit implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="deposit_id", unique=true, nullable=false, precision=9)
	private long depositId;

	@Column(name="deposit_class", length=1)
	private String depositClass;

	@Column(name="deposit_type_id", nullable=false, precision=6)
	private BigDecimal depositTypeId;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

	@Column(name="update_staff_id", precision=9)
	private BigDecimal updateStaffId;

	@Column(nullable=false, length=30)
	private String value;

	//bi-directional many-to-one association to CpcOtcPrice
	@ManyToOne
	@JoinColumn(name="price_id")
	private CpcOtcPrice cpcOtcPrice;

	public CpcOtcPriceDeposit() {
	}

}
