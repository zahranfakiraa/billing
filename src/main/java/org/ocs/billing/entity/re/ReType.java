package org.ocs.billing.entity.re;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="re_type")
@NamedQuery(name="ReType.findAll", query="SELECT r FROM ReType r")
public class ReType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="re_type", unique=true, nullable=false, length=1)
	private String reType;

	@Column(length=1000)
	private String comments;

	@Column(name="parent_re_type", length=1)
	private String parentReType;

	@Column(name="re_type_name", nullable=false, length=120)
	private String reTypeName;

	//bi-directional many-to-one association to Re
	@OneToMany(mappedBy="reTypeBean")
	private List<Re> res;

	//bi-directional many-to-one association to ReAttr
	@OneToMany(mappedBy="reTypeBean")
	private List<ReAttr> reAttrs;

	public ReType() {
	}

    public Re addRe(Re re) {
		getRes().add(re);
		re.setReTypeBean(this);

		return re;
	}

	public Re removeRe(Re re) {
		getRes().remove(re);
		re.setReTypeBean(null);

		return re;
	}

    public ReAttr addReAttr(ReAttr reAttr) {
		getReAttrs().add(reAttr);
		reAttr.setReTypeBean(this);

		return reAttr;
	}

	public ReAttr removeReAttr(ReAttr reAttr) {
		getReAttrs().remove(reAttr);
		reAttr.setReTypeBean(null);

		return reAttr;
	}
}
