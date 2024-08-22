package org.ocs.billing.entity.Om;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="om_serv_ne_event")
@NamedQuery(name="OmServNeEvent.findAll",query="SELECT o FROM OmServNeEvent o")
public class OmServNeEvent implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id",precision=6)
    private BigDecimal id;

    @Column(name="serv_type",precision=3)
    private BigDecimal servType;

    @Column(name="event_id",precision=6)
    private BigDecimal eventId;

    @Column(name="event_type",precision=6)
    private BigDecimal eventType;

    @Column(name="seq1")
    private BigDecimal seq1;

    @Column(name="seq2")
    private BigDecimal seq2;

    @Column(name="attr_code",length=30)
    private String attrCode;

    @Column(name="operation_type")
    private String operationType;

    @Column(name="decide_method",length=120)
    private String decideMethod;

    public OmServNeEvent(){
        
    }
}
