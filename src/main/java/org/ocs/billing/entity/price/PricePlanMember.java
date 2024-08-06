package org.ocs.billing.entity.price;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_plan_member")
@NamedQuery(name="PricePlanMember.findAll", query="SELECT p FROM PricePlanMember p")
public class PricePlanMember implements Serializable {
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PricePlanMemberPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to PricePlanVer
	@ManyToOne
	@JoinColumn(name="price_plan_ver_id", nullable=false, insertable=false, updatable=false)
	private PricePlanVer pricePlanVer;

	public PricePlanMember() {
	}
}
