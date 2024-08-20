package org.ocs.billing.entity.gm;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.ocs.billing.entity.sim.SimCard;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="gm_box")
@NamedQuery(name="GmBox.findAll", query="SELECT g FROM GmBox g")
public class GmBox implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="gm_box_id", unique=true, nullable=false, precision=9)
	private long gmBoxId;

	@Column(name="box_type", length=1)
	private String boxType;

	@Column(length=255)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="create_date", nullable=false)
	private Date createDate;

	@Column(name="gm_box_code", length=60)
	private String gmBoxCode;

	@Column(name="gm_pallet_id", precision=9)
	private BigDecimal gmPalletId;

	@Column(precision=6)
	private BigDecimal seq;

	@Column(name="staff_id", precision=9)
	private BigDecimal staffId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	//bi-directional many-to-one association to GmBox
	@ManyToOne
	@JoinColumn(name="parent_box_id")
	private GmBox gmBox;

	//bi-directional many-to-one association to GmBox
	@OneToMany(mappedBy="gmBox")
	private List<GmBox> gmBoxs;

	//bi-directional many-to-one association to SimCard
	@OneToMany(mappedBy="gmBox")
	private List<SimCard> simCards;

	public GmBox() {
	}

    public GmBox addGmBox(GmBox gmBox) {
		getGmBoxs().add(gmBox);
		gmBox.setGmBox(this);

		return gmBox;
	}

	public GmBox removeGmBox(GmBox gmBox) {
		getGmBoxs().remove(gmBox);
		gmBox.setGmBox(null);

		return gmBox;
	}

    public SimCard addSimCard(SimCard simCard) {
		getSimCards().add(simCard);
		simCard.setGmBox(this);

		return simCard;
	}

	public SimCard removeSimCard(SimCard simCard) {
		getSimCards().remove(simCard);
		simCard.setGmBox(null);

		return simCard;
	}


}
