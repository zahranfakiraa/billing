package org.ocs.billing.entity.Om;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="om_param")
@NamedQuery(name="OmParam.findAll",query="SELECT o FROM OmParam o")
public class OmParam implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="param_id",precision=6)
    private BigDecimal paramId;

    @Column(name="param_code",length=60)
    private String paramCode;

    @Column(name="param_name",length=60)
    private String paramName;

    @Column(name="comments",length=120)
    private String comments;

    @Column(name="method",length=4000)
    private String method;

    public OmParam(){
        
    }
}
