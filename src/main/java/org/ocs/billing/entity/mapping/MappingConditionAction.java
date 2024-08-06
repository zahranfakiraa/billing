package org.ocs.billing.entity.mapping;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="mapping_condition_action")
@NamedQuery(name="MappingConditionAction.findAll", query="SELECT m FROM MappingConditionAction m")
public class MappingConditionAction implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MappingConditionActionPK id;

	@Column(length=60)
	private String function;

	@Column(name="function_script", length=4000)
	private String functionScript;

	@Column(name="obj_re_attr", nullable=false, precision=6)
	private BigDecimal objReAttr;

	@Column(length=255)
	private String param1;

	@Column(length=255)
	private String param2;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="src_re_attr", nullable=false, precision=6)
	private BigDecimal srcReAttr;

	//bi-directional many-to-one association to Mapping
	@ManyToOne
	@JoinColumn(name="mapping_id", nullable=false, insertable=false, updatable=false)
	private Mapping mapping;

	public MappingConditionAction() {
	}
}
