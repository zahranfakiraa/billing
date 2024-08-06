package org.ocs.billing.entity.cpotc;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_price_script")
@NamedQuery(name="CpcOtcPriceScript.findAll", query="SELECT c FROM CpcOtcPriceScript c")
public class CpcOtcPriceScript implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_id", unique=true, nullable=false, precision=9)
	private long priceId;

	@Column(length=255)
	private String comments;

	@Column(name="rule_script", nullable=false, length=2147483647)
	private String ruleScript;

	//bi-directional one-to-one association to CpcOtcPrice
	@OneToOne
	@JoinColumn(name="price_id", nullable=false, insertable=false, updatable=false)
	private CpcOtcPrice cpcOtcPrice;

	public CpcOtcPriceScript() {
	}

}
