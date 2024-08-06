package org.ocs.billing.entity.sub;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="subs_rela")
@NamedQuery(name="SubsRela.findAll", query="SELECT s FROM SubsRela s")
public class SubsRela implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="subs_rela_id", unique=true, nullable=false, precision=12)
	private long subsRelaId;

	@Column(name="bind_type", nullable=false, length=1)
	private String bindType;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="cust_id", precision=15)
	private BigDecimal custId;

	@Column(name="parent_subs_id", nullable=false, precision=15)
	private BigDecimal parentSubsId;

	@Temporal(TemporalType.DATE)
	@Column(name="rela_eff_date")
	private Date relaEffDate;

	@Temporal(TemporalType.DATE)
	@Column(name="rela_exp_date")
	private Date relaExpDate;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="subs_id", nullable=false, precision=15)
	private BigDecimal subsId;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date", nullable=false)
	private Date updateDate;

	public SubsRela() {
	}

}
