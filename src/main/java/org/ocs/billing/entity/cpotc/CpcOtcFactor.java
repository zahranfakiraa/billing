package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_factor")
@NamedQuery(name="CpcOtcFactor.findAll", query="SELECT c FROM CpcOtcFactor c")
public class CpcOtcFactor implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="factor_id", unique=true, nullable=false, precision=3)
	private long factorId;

	@Column(name="attr_nbr", length=30)
	private String attrNbr;

	@Column(name="con_attr_path", length=1000)
	private String conAttrPath;

	@Column(name="con_attr_type_id", precision=3)
	private BigDecimal conAttrTypeId;

	@Column(name="data_source_bean_name", length=60)
	private String dataSourceBeanName;

	@Column(name="data_type", length=1)
	private String dataType;

	@Column(name="factor_name", length=60)
	private String factorName;

	@Column(name="use_in_price", length=1)
	private String useInPrice;

	public CpcOtcFactor() {
	}
}
