package org.ocs.billing.entity.acc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="acc_nbr_type")
@NamedQuery(name="AccNbrType.findAll", query="SELECT a FROM AccNbrType a")
public class AccNbrType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="acc_nbr_type_id", unique=true, nullable=false, precision=3)
	private long accNbrTypeId;

	@Column(name="acc_nbr_type_name", nullable=false, length=60)
	private String accNbrTypeName;

	@Column(length=120)
	private String comments;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public AccNbrType() {
	}
}
