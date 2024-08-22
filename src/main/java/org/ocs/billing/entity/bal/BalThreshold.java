package org.ocs.billing.entity.bal;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bal_threshold")
@NamedQuery(name="BalThreshold.findAll",query="SELECT b FROM BalThreshold b")
public class BalThreshold implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="bal_threshold_id",precision=9)
    private BigDecimal balThresholdId;
    
    @Column(name="trigger_id",precision=9)
    private BigDecimal triggerId;

    @Column(name="re_attr",precision=6)
    private BigDecimal reAttr;

    @Column(name="ratio",precision=6)
    private BigDecimal ratio;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="threshold_interval",length=12)
    private String thresholdInterval;

    @Column(name="ref_value_id",precision=9)
    private BigDecimal refValueId;

    @Column(name="is_ratio")
    private String isRatio;

    public BalThreshold(){
        
    }
}
