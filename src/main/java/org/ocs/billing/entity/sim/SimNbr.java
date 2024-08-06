package org.ocs.billing.entity.sim;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="sim_nbr")
@NamedQuery(name="SimNbr.findAll", query="SELECT s FROM SimNbr s")
public class SimNbr implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sim_nbr_id", unique=true, nullable=false, precision=12)
	private long simNbrId;

	@Column(name="acc_nbr_id", nullable=false, precision=12)
	private BigDecimal accNbrId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="second_acc_nbr_id", precision=12)
	private BigDecimal secondAccNbrId;

	@Column(name="sim_card_id", nullable=false, precision=12)
	private BigDecimal simCardId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="staff_id", precision=9)
	private BigDecimal staffId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	public SimNbr() {
	}
}
