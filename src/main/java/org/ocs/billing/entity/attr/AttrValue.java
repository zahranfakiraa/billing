package org.ocs.billing.entity.attr;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="attr_value")
@NamedQuery(name="AttrValue.findAll", query="SELECT a FROM AttrValue a")
public class AttrValue implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AttrValuePK id;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(length=60)
	private String value;

	@Column(name="value_mark", nullable=false, length=60)
	private String valueMark;

	public AttrValue() {
	}
}
