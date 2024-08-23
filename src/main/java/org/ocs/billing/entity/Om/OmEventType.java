package org.ocs.billing.entity.Om;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="om_event_type")
@NamedQuery(name="OmEventType.findAll",query="SELECT o FROM OmEventType o")
public class OmEventType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="event_type",precision=6)
    private BigDecimal eventType;

    @Column(name="ne_type")
    private String neType;

    @Column(name="event_type_name",length=60)
    private String eventTypeName;

    @Column(name="comments",length=255)
    private String comments;

    @Column(name="ws_type")
    private String wsType;

    public OmEventType(){
        
    }
}
