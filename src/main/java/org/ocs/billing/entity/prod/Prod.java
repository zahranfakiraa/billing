package org.ocs.billing.entity.prod;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@NamedQuery(name="Prod.findAll", query="SELECT p FROM Prod p")
@Table(name="prod", indexes ={
    @Index(name = "idx_prod_com_date",  columnList="completed_date", unique =false),
    @Index(name = "idx_prod_exp_date", columnList="prod_exp_date", unique = false),
    @Index(name = "idx_prod_fg_code", columnList="fg_code", unique = false),
    @Index(name = "idx_prod_indep_prod_id", columnList="indep_prod_id", unique = false),
    @Index(name = "idx_prod_state_composite", columnList="state,prod_state,block_reason", unique = false)

})

public class Prod implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	private String id = java.util.UUID.randomUUID().toString();

	@Column(name="block_reason", length=60)
	private String blockReason;

	@Temporal(TemporalType.DATE)
	@Column(name="completed_date", nullable=false)
	private Date completedDate;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date", nullable=false)
	private Date createdDate;

	@Column(name="cust_id", precision=15)
	private BigDecimal custId;

	@Column(name="fg_code", length=60)
	private String fgCode;

	@Column(name="indep_prod_id", precision=15)
	private BigDecimal indepProdId;

	@Column(name="need_upload", length=1)
	private String needUpload;

	@Column(name="offer_id", precision=9)
	private BigDecimal offerId;

	@Temporal(TemporalType.DATE)
	@Column(name="prod_exp_date")
	private Date prodExpDate;

	@Column(name="prod_id", nullable=false, precision=12)
	private BigDecimal prodId;

	@Column(name="prod_spec_id", nullable=false, precision=6)
	private BigDecimal prodSpecId;

	@Column(name="prod_state", nullable=false, length=1)
	private String prodState;

	@Temporal(TemporalType.DATE)
	@Column(name="prod_state_date", nullable=false)
	private Date prodStateDate;

	@Column(name="promotion_id", length=30)
	private String promotionId;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="sub_promotion_id", length=30)
	private String subPromotionId;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date", nullable=false)
	private Date updateDate;

}
