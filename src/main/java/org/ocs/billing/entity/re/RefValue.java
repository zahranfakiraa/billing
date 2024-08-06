package org.ocs.billing.entity.re;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.ocs.billing.entity.price.Price;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="ref_value")
@NamedQuery(name="RefValue.findAll", query="SELECT r FROM RefValue r")
public class RefValue implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ref_value_id", unique=true, nullable=false, precision=9)
	private long refValueId;

	@Column(name="bundle_member_alisa", length=120)
	private String bundleMemberAlisa;

	@Column(name="col_id", precision=9)
	private BigDecimal colId;

	@Column(length=1000)
	private String comments;

	@Column(name="config_unit_id", precision=6)
	private BigDecimal configUnitId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="def_value", length=60)
	private String defValue;

	@Column(name="function_param1", length=255)
	private String functionParam1;

	@Column(name="function_param2", length=255)
	private String functionParam2;

	@Column(name="multi_col_id", length=255)
	private String multiColId;

	@Column(name="multi_re_attr", length=255)
	private String multiReAttr;

	@Column(name="price_id", precision=9)
	private BigDecimal priceId;

	@Column(name="price_set_id", precision=9)
	private BigDecimal priceSetId;

	@Column(name="rate_plan_id", precision=9)
	private BigDecimal ratePlanId;

	@Column(name="re_attr", precision=6)
	private BigDecimal reAttr;

	@Column(name="ref_value_apply", length=1)
	private String refValueApply;

	@Column(name="ref_value_type", nullable=false, length=1)
	private String refValueType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="staff_id", precision=16)
	private BigDecimal staffId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="value_string", nullable=false, length=500)
	private String valueString;

	@Column(name="workflow_id", precision=6)
	private BigDecimal workflowId;

	//bi-directional many-to-one association to Price
	@OneToMany(mappedBy="refValue")
	private List<Price> prices;

	public RefValue() {
	}

    public Price addPrice(Price price) {
		getPrices().add(price);
		price.setRefValue(this);

		return price;
	}

	public Price removePrice(Price price) {
		getPrices().remove(price);
		price.setRefValue(null);

		return price;
	}
}
