package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_con_group")
@NamedQuery(name="CpcOtcConGroup.findAll",query="SELECT c FROM CpcOtcConGroup c")
public class CpcOtcConGroup implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="con_group_id",precision=9)
    private BigDecimal conGroupId;

    @Column(name="con_group_name",length=1000)
    private String conGroupName;

    @Column(name="con_group_expression",length=4000)
    private String conGroupExpression;

    public CpcOtcConGroup(){
        
    }
}
