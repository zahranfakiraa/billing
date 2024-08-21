package org.ocs.billing.entity.bwf;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.SortOperator;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bwf_cond")
@NamedQuery(name="BwfCond.findAll", query="SELECT b FROM BwfCond b")
public class BwfCond implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BwfCondPK id;

	@Column(length=60)
	private String function;

	@Column(name="function_script", length=4000)
	private String functionScript;

	@Column(name="is_const", nullable=false, length=1)
	private String isConst;

	@Column(name="l_ref_value_id", precision=9)
	private BigDecimal lRefValueId;

	@Column(name="match_type", length=1)
	private String matchType;

	@Column(length=200)
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

	@Column(name="r_ref_value_id", precision=9)
	private BigDecimal rRefValueId;

	@Column(name="re_attr", precision=6)
	private BigDecimal reAttr;

	@ManyToOne
	@JoinColumn(name = "sort_operator", referencedColumnName = "sort_operator" )
	// @Column(name="sort_operator", length=1)
	private SortOperator sortOperator;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="zone_id", precision=9)
	private BigDecimal zoneId;

	//bi-directional many-to-one association to BwfCondGroup
	@ManyToOne
	@JoinColumn(name="cond_group_id", nullable=false, insertable=false, updatable=false)
	private BwfCondGroup bwfCondGroup;

	public BwfCond() {
	}    


}
