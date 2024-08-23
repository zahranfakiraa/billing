package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="sub_bal_type")
@NamedQuery(name="SubBalType.findAll",query="SELECT s FROM SubBalType s")
public class SubBalType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="sub_bal_type_id",precision=6)
    private BigDecimal subBalTypeId;

    @Column(name="acct_res_id",precision=9)
    private BigDecimal acctResId;

    @Column(name="period_id",precision=9)
    private BigDecimal periodId;

    @Column(name="ceil_limit",precision=15)
    private BigDecimal ceilLimit;

    @Column(name="floor_limit",precision=15)
    private BigDecimal floorLimit;

    @Column(name="daily_ceil_limit",precision=15)
    private BigDecimal dailyCeilLimit;

    @Column(name="daily_floor_limit",precision=15)
    private BigDecimal dailyFloorLimit;

    @Column(name="priority",precision=6)
    private BigDecimal priority;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="max_days",precision=6)
    private BigDecimal maxDays;

    @Column(name="limit_subs")
    private String limitSubs;

    @Column(name="period_rel_unit")
    private String periodRelUnit;

    @Column(name="abs_exp_offset",precision=15)
    private BigDecimal absExpOffset;

    @Column(name="acct_item_type_id",precision=6)
    private BigDecimal acctItmTypeId;    

    @Column(name="extend_rule")
    private String extendRule;

    @Column(name="rollover_flag")
    private String rolloverFlag;

    @Column(name="max_benefit_result",precision=18)
    private BigDecimal maxBenefitResult;

    @Column(name="res_value_rate",length=30)
    private String resValueRate;

    public SubBalType(){
        
    }

}
