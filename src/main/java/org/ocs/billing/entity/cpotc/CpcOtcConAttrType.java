package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_con_attr_type")
@NamedQuery(name="CpcOtcConAttrType.findAll",query="SELECT c FROM CpcOtcConAttrType c")
public class CpcOtcConAttrType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="con_attr_type_id",precision=3)
    private BigDecimal conAttrTypeId;

    @Column(name="con_attr_type_name",length=60)
    private String conAttrTypeName;

    @Column(name="data_sevice",length=120)
    private String dataService;

    @Column(name="comments",length=255)
    private String comments;

    public CpcOtcConAttrType(){
        
    }
}
