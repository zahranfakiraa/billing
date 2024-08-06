package org.ocs.billing.entity.cond;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cond_base")
@NamedQuery(name="CondBase.findAll", query="SELECT c FROM CondBase c")
public class CondBase implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cond_base_id", unique=true, nullable=false, precision=12)
	private long condBaseId;

	@Column(name="auto_cond_id", nullable=false, precision=12)
	private BigDecimal autoCondId;

	@Column(name="auto_cond_type", precision=5)
	private BigDecimal autoCondType;

	@Column(nullable=false, precision=3)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to CondBaseGroup
	@ManyToOne
	@JoinColumn(name="cond_base_group_id")
	private CondBaseGroup condBaseGroup;

	// //bi-directional many-to-one association to CondRule
	@OneToMany(mappedBy="condBase")
	private List<CondRule> condRules;

	public CondBase() {
	}

    public CondRule addCondRule(CondRule condRule) {
    	getCondRules().add(condRule);
    	condRule.setCondBase(this);
    
    	return condRule;
    }
    
    public CondRule removeCondRule(CondRule condRule) {
    	getCondRules().remove(condRule);
    	condRule.setCondBase(null);
    
    	return condRule;
    }

}
