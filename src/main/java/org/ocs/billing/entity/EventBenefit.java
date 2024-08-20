package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="event_benefit")
@NamedQuery(name="EventBenefit.findAll",query="SELECT e FROM EventBenefit e")
public class EventBenefit implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="price_id",precision=9)
    private BigDecimal priceId;

    @Column(name="price_name",length=400)
    private String priceName;

    @Column(name="ref_value_id",precision=9)
    private BigDecimal refValueId;

    @Column(name="re_attr",precision=6)
    private BigDecimal reAttr;

    @Column(name="price_ver_id",precision=9)
    private BigDecimal priceVerId;

    @Column(name="sub_bal_type_id",precision=9)
    private BigDecimal subBalTypeId;

    @Column(name="rum",precision=12)
    private BigDecimal rum;

    @Column(name="rule_script")
    private String ruleScript;

    @Column(name="rule_comments",length=1000)
    private String ruleComments;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="script_templet_id",precision=9)
    private BigDecimal scriptTempletId;

    @Column(name="repeat_cnt",precision=3)
    private BigDecimal repeatCnt;

    @Column(name="template_flag")
    private String templateFlag;

    @Column(name="src_price_id",precision=9)
    private BigDecimal srcPriceId;

    @Column(name="comments",length=1000)
    private String comments;

    @Column(name="share_flag")
    private String shareFlag;

    @Column(name="round_method")
    private String roundMethod;

    @Column(name="benefit_code")
    private String benefitCode;

    public EventBenefit(){
        
    }
}
