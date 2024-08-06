package org.ocs.billing.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="party_type")
@NamedQuery(name="PartyType.findAll", query="SELECT p FROM PartyType p")
public class PartyType implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="party_type", unique=true, nullable=false, length=1)
	private String partyType;

	@Column(length=120)
	private String comments;

	@Column(name="party_type_name", nullable=false, length=60)
	private String partyTypeName;

	public PartyType() {
	}
}
