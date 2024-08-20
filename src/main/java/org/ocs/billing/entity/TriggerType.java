package org.ocs.billing.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="trigger_type")
@NamedQuery(name="TriggerType.findAll",query="SELECT t FROM TriggerType t")
public class TriggerType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="trigger_type")
    private String triggerType;

    @Column(name="trigger_type_name",length=120)
    private String triggerTypeName;

    @Column(name="comments",length=1000)
    private String comments;

    public TriggerType(){
        
    }
}
