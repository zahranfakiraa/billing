package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_function")
@NamedQuery(name="CpcOtcFunction.findAll", query="SELECT c FROM CpcOtcFunction c")
public class CpcOtcFunction implements Serializable{
    private static final long serialVersionUID = 1L;

	@Id
	@Column(name="fun_id", unique=true, nullable=false, precision=3)
	private long funId;

	@Column(length=255)
	private String comments;

	@Column(name="data_type", length=1)
	private String dataType;

	@Column(name="fun_code", length=60)
	private String funCode;

	@Column(name="fun_name", length=60)
	private String funName;

	@Column(name="is_array", length=1)
	private String isArray;

	@Column(name="param_num", precision=1)
	private BigDecimal paramNum;

	@Column(name="param1_data_type", length=1)
	private String param1DataType;

	@Column(name="param1_desc", length=255)
	private String param1Desc;

	@Column(name="param1_ds_bean", length=30)
	private String param1DsBean;

	@Column(name="param1_name", length=120)
	private String param1Name;

	@Column(name="param2_data_type", length=1)
	private String param2DataType;

	@Column(name="param2_desc", length=255)
	private String param2Desc;

	@Column(name="param2_ds_bean", length=30)
	private String param2DsBean;

	@Column(name="param2_name", length=120)
	private String param2Name;

	@Column(name="param2_price_flag", length=1)
	private String param2PriceFlag;

	@Column(name="param3_data_type", length=1)
	private String param3DataType;

	@Column(name="param3_desc", length=255)
	private String param3Desc;

	@Column(name="param3_ds_bean", length=30)
	private String param3DsBean;

	@Column(name="param3_name", length=120)
	private String param3Name;

	@Column(name="result_attr_nbr", length=30)
	private String resultAttrNbr;

	@Column(name="result_data_type", length=1)
	private String resultDataType;

	@Column(name="result_ds_bean", length=30)
	private String resultDsBean;

	@Column(name="result_is_array", length=1)
	private String resultIsArray;

	public CpcOtcFunction() {
	}
}
