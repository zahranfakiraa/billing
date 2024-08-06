package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="hlr")
@NamedQuery(name="Hlr.findAll", query="SELECT h FROM Hlr h")
public class Hlr implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="hlr_id", unique=true, nullable=false, precision=6)
	private long hlrId;

	@Column(name="area_id", nullable=false, precision=6)
	private BigDecimal areaId;

	@Column(name="begin_acc_nbr", length=60)
	private String beginAccNbr;

	@Column(name="end_acc_nbr", length=60)
	private String endAccNbr;

	@Column(name="hlr_edition", length=30)
	private String hlrEdition;

	@Column(name="hlr_name", nullable=false, length=60)
	private String hlrName;

	@Column(name="hlr_type", length=30)
	private String hlrType;

	@Column(name="is_logic_flag", length=1)
	private String isLogicFlag;

	@Column(name="is_online", length=1)
	private String isOnline;

	@Column(name="phs_hlr_id", precision=6)
	private BigDecimal phsHlrId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	public Hlr() {
	}
}
