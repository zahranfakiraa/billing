package org.ocs.billing.entity.cond;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.ocs.billing.entity.work.WorkCondition;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cond_base_group")
@NamedQuery(name="CondBaseGroup.findAll", query="SELECT c FROM CondBaseGroup c")
public class CondBaseGroup implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cond_base_group_id", unique=true, nullable=false, precision=12)
	private long condBaseGroupId;

	@Column(nullable=false, precision=3)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to CondBase
	@OneToMany(mappedBy="condBaseGroup")
	private List<CondBase> condBases;

	//bi-directional many-to-one association to WorkCondition
	@ManyToOne
	@JoinColumn(name="work_condition_id", nullable=false)
	private WorkCondition workCondition;

	public CondBaseGroup() {
	}

	public CondBase addCondBas(CondBase condBas) {
		getCondBases().add(condBas);
		condBas.setCondBaseGroup(this);

		return condBas;
	}

	public CondBase removeCondBas(CondBase condBas) {
		getCondBases().remove(condBas);
		condBas.setCondBaseGroup(null);

		return condBas;
	}

}
