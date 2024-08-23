package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="interaction_event_param")
@NamedQuery(name="InteractionEventParam.findAll",query="SELECT g FROM InteractionEventParam g")
public class InteractionEventParam implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="param_id",precision=9)
    private BigDecimal paramId;

    @Column(name="event_id",precision=9)
    private BigDecimal eventId;

    @Column(name="param_name",length=60)
    private String paramName;

    @Column(name="param_desc",length=255)
    private String paramDesc;

    @Column(name="param_code",length=60)
    private String paramCode;

    @Column(name="param_type")
    private String paramType;

    @Column(name="param_value",length=60)
    private String paramValue;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    public InteractionEventParam(){
        
    }
}
