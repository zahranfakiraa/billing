package org.ocs.billing.entity.prod;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="prod_spec")
@NamedQuery(name="ProdSpec.findAll", query="SELECT p FROM ProdSpec p")
public class ProdSpec implements Serializable {
    
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="prod_spec_id", unique=true, nullable=false, precision=6)
	private long prodSpecId;

	@Column(length=4000)
	private String comments;

	@Temporal(TemporalType.DATE)
	@Column(name="eff_date", nullable=false)
	private Date effDate;

	@Temporal(TemporalType.DATE)
	@Column(name="exp_date")
	private Date expDate;

	@Column(name="is_need_upload", length=1)
	private String isNeedUpload;

	@Column(name="prod_spec_name", nullable=false, length=255)
	private String prodSpecName;

	@Column(name="prod_spec_type", nullable=false, length=1)
	private String prodSpecType;

	@Column(name="sp_id", precision=6)
	private BigDecimal spId;

	@Column(nullable=false, length=1)
	private String state;

	@Temporal(TemporalType.DATE)
	@Column(name="state_date", nullable=false)
	private Date stateDate;

	@Column(name="std_code", length=60)
	private String stdCode;
}
