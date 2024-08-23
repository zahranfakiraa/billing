package org.ocs.billing.entity.con;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="con_res_detail")
@NamedQuery(name="ConResDetail.findAll",query="SELECT c FROM ConResDetail c")
public class ConResDetail implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="con_res_detail_id",precision=9)
    private BigDecimal conResDetailId;

    @Column(name="con_res_id",precision=9)
    private BigDecimal condResId;

    @Column(name="acct_res_id",precision=9)
    private BigDecimal acctResId;

    @Column(name="acct_item_type_id",precision=6)
    private BigDecimal acctItemType;

    @Column(name="pay_indicator",length=30)
    private String payIndicator;

    @Column(name="exchange_rate",precision=9)
    private BigDecimal exchangeRate;

    @Column(name="exchange_value",precision=9)
    private BigDecimal exchangeValue;

    @Column(name="priority",precision=3)
    private BigDecimal priority;

    @Column(name="comments",length=255)
    private String comments;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    public ConResDetail(){
        
    }
}
