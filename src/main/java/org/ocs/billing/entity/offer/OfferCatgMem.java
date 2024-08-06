package org.ocs.billing.entity.offer;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="offer_catg_mem")
@NamedQuery(name="OfferCatgMem.findAll", query="SELECT o FROM OfferCatgMem o")
public class OfferCatgMem implements Serializable{
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OfferCatgMemPK id;

	public OfferCatgMem() {
	}
}
