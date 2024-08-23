package org.ocs.billing.entity.acm;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="acm_threshold")
@NamedQuery(name="AcmThreshold.findAll", query="SELECT a FROM AcmThreshold a")
public class AcmThreshold implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="acm_threshold_id")
    private long acmThresholdId;

    @Column(name="trigger_id")
    private long triggerId;

    @Column(name="ref_value_id", precision=9)
	private BigDecimal refValueId;

    @Column(name="re_attr", unique=true, nullable=false, precision=6)
	private long reAttr;

    @Column(name="sp_id", precision=6)
    private BigDecimal spId;

    @Column(name="threshold_interval",length=12)
    private BigDecimal thresholdInterval;

    @Column(name="ratio",length=6)
    private BigDecimal ratio;

    public AcmThreshold() {
    }

    

}
