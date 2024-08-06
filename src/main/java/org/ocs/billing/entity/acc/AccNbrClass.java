package org.ocs.billing.entity.acc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="acc_nbr_class")
@NamedQuery(name="AccNbrClass.findAll", query="SELECT a FROM AccNbrClass a")
public class AccNbrClass implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="acc_nbr_class_id", unique=true, nullable=false, precision=3)
	private long accNbrClassId;

	@Column(name="acc_nbr_class_name", nullable=false, length=60)
	private String accNbrClassName;

	@Column(name="acc_nbr_price", precision=12)
	private BigDecimal accNbrPrice;

	@Column(length=120)
	private String comments;

	@Column(name="fg_code", length=30)
	private String fgCode;

	@Column(nullable=false, precision=2)
	private BigDecimal priority;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public AccNbrClass() {
	}
}
