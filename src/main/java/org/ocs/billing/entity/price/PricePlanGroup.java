package org.ocs.billing.entity.price;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_plan_group")
@NamedQuery(name="PricePlanGroup.findAll", query="SELECT p FROM PricePlanGroup p")
public class PricePlanGroup implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_plan_group_id", unique=true, nullable=false, precision=6)
	private long pricePlanGroupId;

	@Column(name="bundle_unit_id", nullable=false, precision=6)
	private BigDecimal bundleUnitId;

	@Column(name="depend_prod_spec_id", precision=6)
	private BigDecimal dependProdSpecId;

	@Column(name="group_type", nullable=false, length=1)
	private String groupType;

	@Column(nullable=false, length=1)
	private String necessary;

	@Column(name="price_plan_group_name", nullable=false, length=60)
	private String pricePlanGroupName;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public PricePlanGroup() {
	}

}
