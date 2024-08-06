package org.ocs.billing.entity.bwf;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bwf_cond_group")
@NamedQuery(name="BwfCondGroup.findAll", query="SELECT b FROM BwfCondGroup b")
public class BwfCondGroup implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cond_group_id", unique=true, nullable=false, precision=6)
	private long condGroupId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to BwfCond
	@OneToMany(mappedBy="bwfCondGroup")
	private List<BwfCond> bwfConds;

	//bi-directional many-to-one association to BwfStep
	@ManyToOne
	@JoinColumn(name="step_id", nullable=false)
	private BwfStep bwfStep;

	public BwfCondGroup() {
	}

    public BwfCond addBwfCond(BwfCond bwfCond) {
		getBwfConds().add(bwfCond);
		bwfCond.setBwfCondGroup(this);

		return bwfCond;
	}

	public BwfCond removeBwfCond(BwfCond bwfCond) {
		getBwfConds().remove(bwfCond);
		bwfCond.setBwfCondGroup(null);

		return bwfCond;
	}
}
