package org.ocs.billing.entity.bal;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.price.PriceVer;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bal_event_rule")
@NamedQuery(name="BalEventRule.findAll", query="SELECT b FROM BalEventRule b")
public class BalEventRule implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_ver_id", unique=true, nullable=false, precision=9)
	private long priceVerId;

	@Column(name="overlap_type", nullable=false, length=1)
	private String overlapType;

	@Column(nullable=false, length=2147483647)
	private String rule;

	@Column(name="rule_name", nullable=false, length=60)
	private String ruleName;

	@Column(name="rule_type", nullable=false, precision=3)
	private BigDecimal ruleType;

	//bi-directional one-to-one association to PriceVer
	@OneToOne
	@JoinColumn(name="price_ver_id", nullable=false, insertable=false, updatable=false)
	private PriceVer priceVer;

	public BalEventRule() {
	}
}
