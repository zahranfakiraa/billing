package org.ocs.billing.entity.cbec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cbec_inter_event")
@NamedQuery(name="CbecInterEvent.findAll",query="SELECT c FROM CbecInterEvent c")
public class CbecInterEvent implements Serializable{    
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="event_id",precision=9)
    private BigDecimal eventId;
    
    @Column(name="event_code",length=120)
    private String eventCode;

    @Column(name="event_name",length=128)
    private String eventName;

    @Column(name="event_scope")
    private String eventScope;

    @Column(name="is_system_default")
    private String isSystemDefault;

    @Column(name="notify_zmq_topic",length=60)
    private String notifyZmqTopic;

    @Column(name="state")
    private String state;

    @Temporal(TemporalType.DATE)
    @Column(name="state_date")
    private Date stateDate;

    @Temporal(TemporalType.DATE)
    @Column(name="eff_date")
    private Date effDate;

    @Temporal(TemporalType.DATE)
    @Column(name="exp_date")
    private Date expDate;

    @Column(name="party_type")
    private String partyType;

    @Column(name="party_code")
    private String partyCode;

    @Column(name="comments",length=255)
    private String comments;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="event_catg")
    private String eventCatg;

    @Column(name="state_set",length=60)
    private String stateSet;

    @Column(name="obj_prod_state")
    private String objProdState;

    public CbecInterEvent(){
        
    }

}
