package org.ocs.billing.entity.Om;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="om_node_inst")
@NamedQuery(name="OmNodeInst.findAll", query="SELECT o FROM OmNodeInst o")
public class OmNodeInst implements Serializable{
    private static final long serialVersionUID = 1L;

	@Column(name="check_in_comments", length=4000)
	private String checkInComments;

	@Temporal(TemporalType.DATE)
	@Column(name="check_in_date")
	private Date checkInDate;

	@Column(name="check_out_comments", length=4000)
	private String checkOutComments;

	@Temporal(TemporalType.DATE)
	@Column(name="check_out_date")
	private Date checkOutDate;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="is_lock", length=1)
	private String isLock;

	@Column(name="node_inst_id", nullable=false, precision=15)
	private BigDecimal nodeInstId;

	@Column(name="order_id", nullable=false, precision=15)
	private BigDecimal orderId;

	@Column(name="part_id", nullable=false, precision=6)
	private BigDecimal partId;

	@Column(name="r_node_inst_id", precision=15)
	private BigDecimal rNodeInstId;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="wf_node_id", nullable=false, precision=6)
	private BigDecimal wfNodeId;

	public OmNodeInst() {
	}
}
