package org.ocs.billing.entity.cond;


import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cond_rule")
@NamedQuery(name="CondRule.findAll", query="SELECT c FROM CondRule c")
public class CondRule implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CondRulePK id;

	@Column(length=60)
	private String function;

	@Column(name="function_script", length=4000)
	private String functionScript;

	@Column(name="is_const", nullable=false, length=1)
	private String isConst;

	@Column(length=30)
	private String operand;

	@Column(length=255)
	private String param1;

	@Column(length=255)
	private String param2;

	@Column(name="r_function", length=30)
	private String rFunction;

	@Column(name="r_function_script", length=4000)
	private String rFunctionScript;

	@Column(name="r_param1", length=255)
	private String rParam1;

	@Column(name="r_param2", length=255)
	private String rParam2;

	@Column(name="r_re_attr", precision=6)
	private BigDecimal rReAttr;

	@Column(name="re_attr", precision=6)
	private BigDecimal reAttr;

	@Column(name="sort_operator", length=1)
	private String sortOperator;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="zone_id", precision=6)
	private BigDecimal zoneId;

	//bi-directional many-to-one association to CondBase
	@ManyToOne
	@JoinColumn(name="cond_base_id", nullable=false, insertable=false, updatable=false)
	private CondBase condBase;

	public CondRule() {
	}

    
}
