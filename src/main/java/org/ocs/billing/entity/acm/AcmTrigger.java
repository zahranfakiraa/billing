package org.ocs.billing.entity.acm;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.ocs.billing.entity.price.PriceSet;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="acm_trigger")
@NamedQuery(name="AcmTrigger.findAll", query="SELECT a FROM AcmTrigger a")
public class AcmTrigger implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="trigger_id")
    private long triggerId;

    @Column(name="trigger_name",length=120)
    private String triggerName;

    @OneToOne
    @JoinColumn(name="price_set_id",referencedColumnName = "price_set_id")
    private PriceSet priceSetId;

    @Column(name="trigger_type")
    private String triggerType;

    @Temporal(TemporalType.DATE)
    @Column(name="eff_date")
    private Date effDate;

    @Temporal(TemporalType.DATE)
    @Column(name="exp_date")
    private Date expDate;

    @Column(name="state")
    private String state;

    @Temporal(TemporalType.DATE)
    @Column(name="state_date")
    private String stateDate;

    @Column(name="sp_id", precision=6)
    private String spId;

    @Column(name="trigger_mode")
    private String triggerMode;

    @Column(name="workflow_id",precision=9)
    private BigDecimal workflowId;

    @Column(name="ref_resource_id", precision=9)
    private BigDecimal refResourceId;

    @Column(name="ref_resource_group_id",precision=9)
    private BigDecimal refResourceGroupId;

    public AcmTrigger() {
    }

}
