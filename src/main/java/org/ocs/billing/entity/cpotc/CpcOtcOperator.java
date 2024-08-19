package org.ocs.billing.entity.cpotc;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_operator")
@NamedQuery(name="CpcOtcOperator.findAll",query="SELECT c FROM CpcOtcOperator c")
public class CpcOtcOperator implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="operator",precision=3)
    private BigDecimal operator;

    @Column(name="operator_name",length=60)
    private String operatorName;

    @Column(name="comments",length=255)
    private String comments;

    @Column(name="operand_count")
    private String operandCount;

    public CpcOtcOperator(){
        
    }
}
