package org.ocs.billing.entity.con;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="con_res")
@NamedQuery(name="ConRe.findAll", query="SELECT c FROM ConRe c")
public class ConRe implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="con_res_id", unique=true, nullable=false, precision=9)
	private long conResId;

	@Column(name="bal_source_type", precision=3)
	private BigDecimal balSourceType;

	@Column(length=255)
	private String comments;

	@Column(name="con_res_code", length=30)
	private String conResCode;

	@Column(name="con_res_name", nullable=false, length=255)
	private String conResName;

	@Column(name="currency_type_id", precision=6)
	private BigDecimal currencyTypeId;

	@Column(name="deduct_type", length=1)
	private String deductType;

	@Column(name="is_currency", nullable=false, length=1)
	private String isCurrency;

	@Column(name="price_id", precision=9)
	private BigDecimal priceId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="unit_id", precision=6)
	private BigDecimal unitId;

	@Column(name="unit_precision", precision=15)
	private BigDecimal unitPrecision;

	@Column(name="zero_reverse_order", length=1)
	private String zeroReverseOrder;

	//bi-directional many-to-one association to ConResDetail
	@OneToMany(mappedBy="conRe")
	private List<ConResDetail> conResDetails;

	public ConRe() {
	}

    public ConResDetail addConResDetail(ConResDetail conResDetail) {
		getConResDetails().add(conResDetail);
		conResDetail.setConRe(this);

		return conResDetail;
	}

	public ConResDetail removeConResDetail(ConResDetail conResDetail) {
		getConResDetails().remove(conResDetail);
		conResDetail.setConRe(null);

		return conResDetail;
	}

}
