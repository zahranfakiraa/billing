package org.ocs.billing.entity.bal;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bal_trigger")
@NamedQuery(name="BalTrigger.findAll",query="SELECT b FROM BalTrigger b")
public class BalTrigger implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="trigger_id",precision=9)
    private BigDecimal triggerId;

    @Column(name="trigger_name",length=120)
    private String triggerName;

    @Column(name="acct_rest_id",precision=9)
    private BigDecimal acctRestId;

    @Column(name="price_set_id",precision=9)
    private BigDecimal preiceSetId;

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
    private Date stateDate;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="is_limit_balance")
    private String isLimitBalance;

    @Column(name="destination")
    private String destination;

    @Column(name="trigger_mode")
    private String triggerMode;

    @Column(name="workflow_id",precision=9)
    private BigDecimal workflowId;

    @Column(name="acct_res_group_id",precision=9)
    private BigDecimal acctResGroupId;

    public BalTrigger(){
        
    }


}
