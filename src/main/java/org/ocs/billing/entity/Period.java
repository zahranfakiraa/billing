package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="period")
@NamedQuery(name="Period.findAll",query="SELECT p FROM Period p")
public class Period implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="period_id",precision=9)
    private BigDecimal periodId;

    @Temporal(TemporalType.DATE)
    @Column(name="abs_eff_date")
    private Date absEffDate;

    @Column(name="rel_eff_offset",precision=9)
    private BigDecimal relEffOffset;

    @Column(name="rel_eff_unit")
    private String relEffUnit;

    @Column(name="rel_exp_offset",precision=9)
    private BigDecimal relExpOffset;

    @Column(name="rel_exp_unit")
    private String relExpUnit;

    @Temporal(TemporalType.DATE)
    @Column(name="rel_eff_time")
    private Date relEffTime;

    @Temporal(TemporalType.DATE)
    @Column(name="rel_exp_time")
    private Date relExpTime;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="param_flag")
    private String paramFlag;

    @Column(name="rel_eff_offset_ref",precision=9)
    private BigDecimal relEffOffsetRef;

    @Column(name="rel_eff_unit_ref",precision=9)
    private BigDecimal relEffUnitRef;

    @Column(name="rel_exp_offset_ref",precision=9)
    private BigDecimal relExpOffsetRef;

    @Column(name="rel_exp_unit_ref",precision=9)
    private BigDecimal relExpUnitRef;

    @Column(name="rel_eff_time_ref",precision=9)
    private BigDecimal relEffTimeRef;

    @Column(name="rel_exp_time_ref",precision=9)
    private BigDecimal relExpTimeRef;

    @Column(name="follow_rent_cycle")
    private String followRentCycle;

    public Period(){

    }

}
