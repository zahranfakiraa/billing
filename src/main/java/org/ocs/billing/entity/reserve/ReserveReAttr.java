package org.ocs.billing.entity.reserve;

import java.io.Serializable;
import java.util.List;

import org.ocs.billing.entity.DefReAttr;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="reserve_re_attr")
@NamedQuery(name="ReserveReAttr.findAll", query="SELECT r FROM ReserveReAttr r")
public class ReserveReAttr implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="re_attr", unique=true, nullable=false, precision=6)
	private long reAttr;

	@Column(length=1000)
	private String comments;

	@Column(name="lookup_script", length=4000)
	private String lookupScript;

	@Column(length=60)
	private String mask;

	@Column(nullable=false, length=1)
	private String measurable;

	@Column(name="re_attr_name", nullable=false, length=120)
	private String reAttrName;

	//bi-directional many-to-one association to DefReAttr
	@OneToMany(mappedBy="reserveReAttr")
	private List<DefReAttr> defReAttrs;

	public ReserveReAttr() {
	}

    public DefReAttr addDefReAttr(DefReAttr defReAttr) {
		getDefReAttrs().add(defReAttr);
		defReAttr.setReserveReAttr(this);

		return defReAttr;
	}

	public DefReAttr removeDefReAttr(DefReAttr defReAttr) {
		getDefReAttrs().remove(defReAttr);
		defReAttr.setReserveReAttr(null);

		return defReAttr;
	}
}
