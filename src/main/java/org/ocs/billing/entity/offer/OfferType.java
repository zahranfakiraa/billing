package org.ocs.billing.entity.offer;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="offer_type")
@NamedQuery(name="OfferType.findAll", query="SELECT o FROM OfferType o")
public class OfferType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="offer_type", unique=true, nullable=false, length=1)
	private String offerType;

	@Column(length=120)
	private String comments;

	@Column(name="offer_type_name", nullable=false, length=60)
	private String offerTypeName;

	public OfferType() {
	}
}
