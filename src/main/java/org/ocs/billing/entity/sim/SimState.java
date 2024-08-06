package org.ocs.billing.entity.sim;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="sim_state")
@NamedQuery(name="SimState.findAll", query="SELECT s FROM SimState s")
public class SimState implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sim_state", unique=true, nullable=false, length=1)
	private String simState;

	@Column(length=120)
	private String comments;

	@Column(name="sim_state_name", nullable=false, length=60)
	private String simStateName;

	public SimState() {
	}
}
