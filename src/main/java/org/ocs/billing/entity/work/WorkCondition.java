package org.ocs.billing.entity.work;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import org.ocs.billing.entity.cond.CondAcm;
import org.ocs.billing.entity.cond.CondBaseGroup;
import org.ocs.billing.entity.cond.CondRank;
import org.ocs.billing.entity.cond.CondTimeSpan;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="work_condition")
@NamedQuery(name="WorkCondition.findAll", query="SELECT w FROM WorkCondition w")
public class WorkCondition implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="work_condition_id", unique=true, nullable=false, precision=12)
	private long workConditionId;

	@Column(length=120)
	private String comments;

	@Column(name="exec_seq", nullable=false, precision=3)
	private BigDecimal execSeq;

	@Column(length=512)
	private String position;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="work_condition_name", nullable=false, length=60)
	private String workConditionName;

	@Column(name="work_condition_type", nullable=false, length=30)
	private String workConditionType;


	// //bi-directional many-to-one association to CondAcm
	@OneToMany(mappedBy="workCondition")
	private List<CondAcm> condAcms;

	// //bi-directional many-to-one association to CondBaseGroup
	@OneToMany(mappedBy="workCondition")
	private List<CondBaseGroup> condBaseGroups;

	// //bi-directional many-to-one association to CondRank
	@OneToMany(mappedBy="workCondition")
	private List<CondRank> condRanks;

	// //bi-directional many-to-one association to CondTimeSpan
	@OneToMany(mappedBy="workCondition")
	private List<CondTimeSpan> condTimeSpans;

	//bi-directional many-to-one association to WorkNode
	@ManyToOne
	@JoinColumn(name="work_node_id", nullable=false)
	private WorkNode workNode1;

	//bi-directional many-to-one association to WorkNode
	@ManyToOne
	@JoinColumn(name="work_out_node_id")
	private WorkNode workNode2;

	public WorkCondition() {
	}


    public CondAcm addCondAcm(CondAcm condAcm) {
		getCondAcms().add(condAcm);
		condAcm.setWorkCondition(this);

		return condAcm;
	}

	public CondAcm removeCondAcm(CondAcm condAcm) {
		getCondAcms().remove(condAcm);
		condAcm.setWorkCondition(null);

		return condAcm;
	}

    public CondBaseGroup addCondBaseGroup(CondBaseGroup condBaseGroup) {
		getCondBaseGroups().add(condBaseGroup);
		condBaseGroup.setWorkCondition(this);

		return condBaseGroup;
	}

	public CondBaseGroup removeCondBaseGroup(CondBaseGroup condBaseGroup) {
		getCondBaseGroups().remove(condBaseGroup);
		condBaseGroup.setWorkCondition(null);

		return condBaseGroup;
	}

    public CondRank addCondRank(CondRank condRank) {
		getCondRanks().add(condRank);
		condRank.setWorkCondition(this);

		return condRank;
	}

	public CondRank removeCondRank(CondRank condRank) {
		getCondRanks().remove(condRank);
		condRank.setWorkCondition(null);

		return condRank;
	}

    public CondTimeSpan addCondTimeSpan(CondTimeSpan condTimeSpan) {
		getCondTimeSpans().add(condTimeSpan);
		condTimeSpan.setWorkCondition(this);

		return condTimeSpan;
	}

	public CondTimeSpan removeCondTimeSpan(CondTimeSpan condTimeSpan) {
		getCondTimeSpans().remove(condTimeSpan);
		condTimeSpan.setWorkCondition(null);

		return condTimeSpan;
	}
}
