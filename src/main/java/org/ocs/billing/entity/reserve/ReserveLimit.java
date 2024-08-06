package org.ocs.billing.entity.reserve;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="reserve_limit")
@NamedQuery(name="ReserveLimit.findAll", query="SELECT r FROM ReserveLimit r")
public class ReserveLimit implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReserveLimitPK id;

	@Column(name="bal_limit", precision=15)
	private BigDecimal balLimit;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, precision=12)
	private BigDecimal value;

	public ReserveLimit() {
	}

}
