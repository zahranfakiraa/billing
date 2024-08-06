package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.re.ReAttr;
import org.ocs.billing.entity.reserve.ReserveReAttr;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="def_re_attr")
@NamedQuery(name="DefReAttr.findAll", query="SELECT d FROM DefReAttr d")
public class DefReAttr implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="re_attr", unique=true, nullable=false, precision=6)
	private long reAttr;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional one-to-one association to ReAttr
	@OneToOne
	@JoinColumn(name="re_attr", nullable=false, insertable=false, updatable=false)
	private ReAttr reAttrBean;

	//bi-directional many-to-one association to ReserveReAttr
	@ManyToOne
	@JoinColumn(name="def_re_attr", nullable=false)
	private ReserveReAttr reserveReAttr;

	public DefReAttr() {
	}
}
