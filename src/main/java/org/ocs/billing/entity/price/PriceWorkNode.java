package org.ocs.billing.entity.price;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.work.WorkNode;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="price_work_node")
@NamedQuery(name="PriceWorkNode.findAll", query="SELECT p FROM PriceWorkNode p")
public class PriceWorkNode implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PriceWorkNodePK id;

	@Column(length=120)
	private String comments;

	@Column(name="price_node_name", nullable=false, length=60)
	private String priceNodeName;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	//bi-directional many-to-one association to Price
	@ManyToOne
	@JoinColumn(name="price_id", nullable=false, insertable=false, updatable=false)
	private Price price;

	// bi-directional many-to-one association to WorkNode
	@ManyToOne
	@JoinColumn(name="work_node_id", nullable=false)
	private WorkNode workNode;

	public PriceWorkNode() {
	}
}
