package org.ocs.billing.entity.reserve;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.bwf.BwfWorkflow;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="reserve_policy")
@NamedQuery(name="ReservePolicy.findAll", query="SELECT r FROM ReservePolicy r")
public class ReservePolicy implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="re_attr", nullable=false, precision=6)
	private BigDecimal reAttr;

	@Column(name="re_id", nullable=false, precision=9)
	private BigDecimal reId;

	@Column(nullable=false, precision=6)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, precision=12)
	private BigDecimal value;

	//bi-directional many-to-one association to BwfWorkflow
	@ManyToOne
	@JoinColumn(name="workflow_id")
	private BwfWorkflow bwfWorkflow;

	public ReservePolicy() {
	}
}
