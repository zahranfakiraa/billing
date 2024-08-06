package org.ocs.billing.entity.mapping;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="mapping_condition_group")
@NamedQuery(name="MappingConditionGroup.findAll", query="SELECT m FROM MappingConditionGroup m")
public class MappingConditionGroup implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MappingConditionGroupPK id;

	@Column(name="l_function_id", precision=9)
	private BigDecimal lFunctionId;

	@Column(name="l_param1", length=255)
	private String lParam1;

	@Column(name="l_param2", length=255)
	private String lParam2;

	@Column(name="l_re_attr", precision=6)
	private BigDecimal lReAttr;

	@Column(name="l_value_type", length=1)
	private String lValueType;

	@Column(name="r_function_id", precision=9)
	private BigDecimal rFunctionId;

	@Column(name="r_param1", length=255)
	private String rParam1;

	@Column(name="r_param2", length=255)
	private String rParam2;

	@Column(name="r_re_attr", precision=6)
	private BigDecimal rReAttr;

	@Column(name="r_value", length=255)
	private String rValue;

	@Column(name="r_value_type", nullable=false, length=1)
	private String rValueType;

	@Column(name="sort_operator", nullable=false, length=1)
	private String sortOperator;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="zone_id", precision=6)
	private BigDecimal zoneId;

	//bi-directional many-to-one association to Mapping
	@ManyToOne
	@JoinColumn(name="mapping_id", nullable=false, insertable=false, updatable=false)
	private Mapping mapping;

	public MappingConditionGroup() {
	}

}
