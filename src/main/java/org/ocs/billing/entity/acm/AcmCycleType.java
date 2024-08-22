package org.ocs.billing.entity.acm;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="acm_cycle_type")
@NamedQuery(name="AcmCycleType.findAll", query="SELECT a FROM AcmCycleType a")
public class AcmCycleType implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="acm_cycle_type_id",precision=6)
    private long acmCycleTypeId;

    @Column(name="re_attr", unique=true, nullable=false, precision=6)
	private long reAttr;

    @Column(name="quantity",precision=3)
    private BigDecimal quantity;

    @Column(name="time_unit", length=100)
    private String timeUnit;

    @Column(name="sp_id", precision=6)
    private BigDecimal spId;

    @Column(name="ref_type",length=120)
    private String refType;

    @Temporal(TemporalType.DATE)
    @Column(name="begin_date")
    private Date beginDate;

    @Column(name="adjust_begin_date_mode")
    private String adjustBeginDateMode;

    public AcmCycleType(){
        
    }
}
