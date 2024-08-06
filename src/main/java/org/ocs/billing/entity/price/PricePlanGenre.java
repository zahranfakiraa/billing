package org.ocs.billing.entity.price;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_plan_genre")
@NamedQuery(name="PricePlanGenre.findAll", query="SELECT p FROM PricePlanGenre p")
public class PricePlanGenre implements Serializable{
    
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="price_plan_genre", unique=true, nullable=false, length=1)
	private String pricePlanGenre;

	@Column(length=1000)
	private String comments;

	@Column(name="genre_name", nullable=false, length=120)
	private String genreName;

	@Column(length=60)
	private String tabs;

	//bi-directional many-to-one association to PricePlan
	@OneToMany(mappedBy="pricePlanGenreBean")
	private List<PricePlan> pricePlans;

	public PricePlanGenre() {
	}

    public PricePlan addPricePlan(PricePlan pricePlan) {
		getPricePlans().add(pricePlan);
		pricePlan.setPricePlanGenreBean(this);

		return pricePlan;
	}

	public PricePlan removePricePlan(PricePlan pricePlan) {
		getPricePlans().remove(pricePlan);
		pricePlan.setPricePlanGenreBean(null);

		return pricePlan;
	}
}
