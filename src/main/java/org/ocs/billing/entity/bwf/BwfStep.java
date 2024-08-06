package org.ocs.billing.entity.bwf;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bwf_step")
@NamedQuery(name="BwfStep.findAll", query="SELECT b FROM BwfStep b")
public class BwfStep implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="step_id", unique=true, nullable=false, precision=6)
	private long stepId;

	@Column(length=120)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Column(name="exec_order", nullable=false, precision=6)
	private BigDecimal execOrder;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="sort_rule_name", nullable=false, length=60)
	private String sortRuleName;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to BwfAction
	@OneToMany(mappedBy="bwfStep")
	private List<BwfAction> bwfActions;

	//bi-directional many-to-one association to BwfCondGroup
	@OneToMany(mappedBy="bwfStep")
	private List<BwfCondGroup> bwfCondGroups;

	//bi-directional many-to-one association to BwfNode
	@ManyToOne
	@JoinColumn(name="node_id")
	private BwfNode bwfNode1;

	//bi-directional many-to-one association to BwfNode
	@ManyToOne
	@JoinColumn(name="output_node_id")
	private BwfNode bwfNode2;

	public BwfStep() {
	}

    public BwfAction addBwfAction(BwfAction bwfAction) {
		getBwfActions().add(bwfAction);
		bwfAction.setBwfStep(this);

		return bwfAction;
	}

	public BwfAction removeBwfAction(BwfAction bwfAction) {
		getBwfActions().remove(bwfAction);
		bwfAction.setBwfStep(null);

		return bwfAction;
	}

    public BwfCondGroup addBwfCondGroup(BwfCondGroup bwfCondGroup) {
		getBwfCondGroups().add(bwfCondGroup);
		bwfCondGroup.setBwfStep(this);

		return bwfCondGroup;
	}

	public BwfCondGroup removeBwfCondGroup(BwfCondGroup bwfCondGroup) {
		getBwfCondGroups().remove(bwfCondGroup);
		bwfCondGroup.setBwfStep(null);

		return bwfCondGroup;
	}


}
