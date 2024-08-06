package org.ocs.billing.entity.attr;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="attr")
@NamedQuery(name="Attr.findAll", query="SELECT a FROM Attr a")
public class Attr implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="attr_id", unique=true, nullable=false, precision=9)
	private long attrId;

	@Column(name="attr_catg", length=60)
	private String attrCatg;

	@Column(name="attr_code", length=30)
	private String attrCode;

	@Column(name="attr_name", nullable=false, length=60)
	private String attrName;

	@Column(name="attr_type", nullable=false, length=1)
	private String attrType;

	@Column(name="csr_visible", nullable=false, length=1)
	private String csrVisible;

	@Column(length=1)
	private String instantiatable;

	@Column(name="obj_attr_id", precision=6)
	private BigDecimal objAttrId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public Attr() {
	}

}
