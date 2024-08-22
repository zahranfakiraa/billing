package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_con_left")
@NamedQuery(name="CpcOtcConLeft.findAll",query="SELECT c FROM CpcOtcConLeft c")
public class CpcOtcConLeft implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="con_left_id",precision=9)
    private String conLeftId;

    @Column(name="con_name",length=255)
    private String conName;

    @Column(name="con_code")
    private String conCode;

    @Column(name="con_desc")
    private String conDesc;

    @Column(name="factor_id",precision=3)
    private BigDecimal factorId;

    @Column(name="con_attr_type_id",precision=3)
    private BigDecimal conAttrTypeId;

    @Column(name="con_attr_path",length=1000)
    private String conAttrPath;

    @Column(name="fund_id",precision=3)
    private BigDecimal funId;

    @Column(name="l_param1",length=255)
    private String lParam1;

    @Column(name="l_param2",length=255)
    private String lParam2;

    @Column(name="is_list")
    private String isList;

    @Column(name="l_param3",length=255)
    private String lParam3;

    public CpcOtcConLeft(){
        
    }
}
