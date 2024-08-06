package org.ocs.billing.entity.bundle;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bundle_unit")
@NamedQuery(name="BundleUnit.findAll", query="SELECT b FROM BundleUnit b")
public class BundleUnit implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bundle_unit_id", unique=true, nullable=false, precision=6)
	private long bundleUnitId;

	@Column(name="bundle_compose_type", nullable=false, length=1)
	private String bundleComposeType;

	@Column(name="bundle_id", nullable=false, precision=6)
	private BigDecimal bundleId;

	@Column(name="goods_amount", precision=12)
	private BigDecimal goodsAmount;

	@Column(name="goods_type_id", precision=9)
	private BigDecimal goodsTypeId;

	@Column(name="indep_prod_spec_id", nullable=false, precision=6)
	private BigDecimal indepProdSpecId;

	@Column(name="lower_limit", precision=6)
	private BigDecimal lowerLimit;

	@Column(name="member_alias", length=30)
	private String memberAlias;

	@Column(nullable=false, length=1)
	private String necessary;

	@Column(precision=6)
	private BigDecimal quantity;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="time_unit", length=1)
	private String timeUnit;

	@Column(name="upper_limit", precision=6)
	private BigDecimal upperLimit;

	public BundleUnit() {
	}
}
