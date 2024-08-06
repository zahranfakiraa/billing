package org.ocs.billing.entity.acc;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="acc_nbr_state")
@NamedQuery(name="AccNbrState.findAll", query="SELECT a FROM AccNbrState a")
public class AccNbrState implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="acc_nbr_state", unique=true, nullable=false, length=1)
	private String accNbrState;

	@Column(name="acc_nbr_state_name", nullable=false, length=60)
	private String accNbrStateName;

	@Column(length=120)
	private String comments;

	public AccNbrState() {
	}
}
