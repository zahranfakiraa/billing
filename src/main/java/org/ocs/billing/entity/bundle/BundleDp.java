package org.ocs.billing.entity.bundle;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bundle_dps")
@NamedQuery(name="BundleDp.findAll", query="SELECT b FROM BundleDp b")
public class BundleDp implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BundleDpPK id;

	@Column(name="lower_limit", precision=6)
	private BigDecimal lowerLimit;

	@Column(precision=6)
	private BigDecimal quantity;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="time_unit", length=1)
	private String timeUnit;

	@Column(name="upper_limit", precision=6)
	private BigDecimal upperLimit;

	public BundleDp() {
	}

}
