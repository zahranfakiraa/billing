package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_con_right")
@NamedQuery(name="CpcOtcConRight.findAll",query="SELECT c FROM CpcOtcConRight c")
public class CpcOtcConRight implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="con_right_id",precision=9)
    private BigDecimal conRigthId;

    @Column(name="con_name",length=255)
    private String conName;

    @Column(name="con_type")
    private String conType;

    @Column(name="value",length=255)
    private String value;

    @Column(name="fun_id",precision=3)
    private BigDecimal fundId;

    @Column(name="factor_id",precision=3)
    private BigDecimal factorId;

    @Column(name="con_attr_type_id",precision=3)
    private BigDecimal conAttrTypeId;

    @Column(name="con_attr_path",length=1000)
    private String conAttrPath;

    @Column(name="r_param1",length=255)
    private String rParam1;

    @Column(name="r_param2",length=255)
    private String rParam2;

    @Column(name="r_param3",length=255)
    private String rParam3;

    public CpcOtcConRight(){
        
    }
}
