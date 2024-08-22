package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_con")
@NamedQuery(name="CpcOtcCon.findAll",query="SELECT c FROM CpcOtcCon c")
public class CpcOtcCon implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="cond_id",precision=9)
    private BigDecimal condId;

    @Column(name="con_left_id",precision=9)
    private BigDecimal conLeftId;

    @Column(name="operator",precision=3)
    private BigDecimal operator;

    @Column(name="con_right_id",precision=9)
    private BigDecimal condRightId;

    @Column(name="con_name",length=1000)
    private String conName;

    @Column(name="con_group_id",precision=9)
    private BigDecimal conGroupId;

    public CpcOtcCon(){
        
    }

}
