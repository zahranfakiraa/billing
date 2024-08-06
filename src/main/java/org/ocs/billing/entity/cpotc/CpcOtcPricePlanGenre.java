package org.ocs.billing.entity.cpotc;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_price_plan_genre")
@NamedQuery(name="CpcOtcPricePlanGenre.findAll", query="SELECT c FROM CpcOtcPricePlanGenre c")
public class CpcOtcPricePlanGenre implements Serializable{
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

	public CpcOtcPricePlanGenre() {
	}
}
