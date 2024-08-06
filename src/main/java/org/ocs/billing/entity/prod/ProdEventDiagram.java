package org.ocs.billing.entity.prod;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="prod_event_diagram")
@NamedQuery(name="ProdEventDiagram.findAll", query="SELECT p FROM ProdEventDiagram p")
public class ProdEventDiagram implements Serializable{
    
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="node_id", unique=true, nullable=false, precision=6)
	private long nodeId;

	@Column(name="lifecycle_type", nullable=false, precision=6)
	private BigDecimal lifecycleType;

	@Column(name="obj_prod_state", nullable=false, length=1)
	private String objProdState;

	@Column(name="service_name", length=120)
	private String serviceName;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(name="src_prod_state", length=1)
	private String srcProdState;

	@Column(name="subs_event_id", nullable=false, precision=6)
	private BigDecimal subsEventId;

	@Column(precision=6)
	private BigDecimal timer;

}
