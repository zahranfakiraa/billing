package org.ocs.billing.entity.price;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_plan_ver")
@NamedQuery(name="PricePlanVer.findAll", query="SELECT p FROM PricePlanVer p")
public class PricePlanVer implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_plan_ver_id", unique=true, nullable=false, precision=9)
	private long pricePlanVerId;

	@Temporal(TemporalType.DATE)
	@Column(name="approved_date")
	private Date approvedDate;

	@Column(name="approved_staff_id", precision=16)
	private BigDecimal approvedStaffId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="created_staff_id", precision=16)
	private BigDecimal createdStaffId;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Temporal(TemporalType.DATE)
	@Column(name="release_date")
	private Date releaseDate;

	@Column(name="release_staff_id", precision=16)
	private BigDecimal releaseStaffId;

	@Temporal(TemporalType.DATE)
	@Column(name="retire_date")
	private Date retireDate;

	@Column(name="retire_staff_id", precision=16)
	private BigDecimal retireStaffId;

	@Column(precision=3)
	private BigDecimal seq;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="submit_date")
	private Date submitDate;

	@Column(name="submit_staff_id", precision=16)
	private BigDecimal submitStaffId;

	@Column(name="using_state", length=1)
	private String usingState;

    //bi-directional many-to-one association to PricePlanMember
	@OneToMany(mappedBy="pricePlanVer")
	private List<PricePlanMember> pricePlanMembers;

	//bi-directional many-to-one association to PricePlan
	@ManyToOne
	@JoinColumn(name="price_plan_id")
	private PricePlan pricePlan;

    public PricePlanVer() {
	}

    public PricePlanMember addPricePlanMember(PricePlanMember pricePlanMember) {
		getPricePlanMembers().add(pricePlanMember);
		pricePlanMember.setPricePlanVer(this);

		return pricePlanMember;
	}

	public PricePlanMember removePricePlanMember(PricePlanMember pricePlanMember) {
		getPricePlanMembers().remove(pricePlanMember);
		pricePlanMember.setPricePlanVer(null);

		return pricePlanMember;
	}
}
