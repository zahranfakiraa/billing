package org.ocs.billing.entity.bwf;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "bwf_action")
@NamedQuery(name = "BwfAction.findAll", query = "SELECT b FROM BwfAction b")
public class BwfAction implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BwfActionPK id;

	@Column(length = 60)
	private String function;

	@Column(name = "function_script", length = 4000)
	private String functionScript;

	@Column(name = "obj_re_attr", nullable = false, precision = 6)
	private BigDecimal objReAttr;

	@Column(length = 255)
	private String param1;

	@Column(length = 255)
	private String param2;

	@Column(name = "sp_id", precision = 6)
	private BigDecimal spId;

	@Column(name = "src_re_attr", nullable = false, precision = 6)
	private BigDecimal srcReAttr;

	// bi-directional many-to-one association to BwfStep
	@ManyToOne
	@JoinColumn(name = "step_id", nullable = false, insertable = false, updatable = false, referencedColumnName = "step_id")
	private BwfStep bwfStep;

	public BwfAction() {
	}
}
