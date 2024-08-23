package org.ocs.billing.entity.bal;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bal_subs_event")
@NamedQuery(name="BalSubsEvent.findAll",query="SELECT b FROM BalSubsEvent b")
public class BalSubsEvent implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="bal_threshold_id",precision=9)
    private BigDecimal balThresholdId;

    @Id
    @Column(name="subs_event_id",precision=9)
    private BigDecimal subsEventId;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="ref_attr",length=255)
    private String refAttr;

    @Column(name="antibill_shock")
    private String antibillShock;

    @Column(name="ext_attr",length=4000)
    private String extAttr;

    @Column(name="template_id",precision=6)
    private BigDecimal templateId;

    public BalSubsEvent(){

    }
}
