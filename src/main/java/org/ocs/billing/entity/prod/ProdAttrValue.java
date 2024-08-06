package org.ocs.billing.entity.prod;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="prod_attr_value", indexes ={
    @Index(name = "idx_prod_attr_id",  columnList="attr_id", unique =false),
    @Index(name = "idx_prod_attr_value", columnList="attr_id,value", unique = false),
    @Index(name = "pk_prod_attr_value", columnList="prod_id,attr_id", unique = true)
})
@NamedQuery(name="ProdAttrValue.findAll", query="SELECT p FROM ProdAttrValue p")
public class ProdAttrValue implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	private String id = java.util.UUID.randomUUID().toString();

	@Column(name="attr_id", nullable=false, precision=9)
	private BigDecimal attrId;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="need_upload", length=1)
	private String needUpload;

	@Column(name="prod_id", nullable=false, precision=15)
	private BigDecimal prodId;

	@Column(name="routing_id", nullable=false, precision=6)
	private BigDecimal routingId;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date", nullable=false)
	private Date updateDate;

	@Column(nullable=false, length=120)
	private String value;

}
