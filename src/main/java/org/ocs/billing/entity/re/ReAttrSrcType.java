package org.ocs.billing.entity.re;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="re_attr_src_type")
@NamedQuery(name="ReAttrSrcType.findAll", query="SELECT r FROM ReAttrSrcType r")
public class ReAttrSrcType implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="re_attr_src_type", unique=true, nullable=false, length=1)
	private String reAttrSrcType;

	@Column(length=1000)
	private String comments;

	@Column(name="re_attr_src_type_name", nullable=false, length=120)
	private String reAttrSrcTypeName;

	public ReAttrSrcType() {
	}
}
