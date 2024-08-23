package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="wholesale")
@NamedQuery(name="Wholesale.findAll",query="SELECT w FROM Wholesale w")
public class Wholesale implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="wholesale_id")
    private long wholesaleId;

    @Column(name="subs_event_id",precision=6)
    private BigDecimal subsEventId;

    @Column(name="offer_id",precision=9)
    private BigDecimal offerId;

    @Column(name="agent_id",precision=9)
    private BigDecimal agentId;

    @Temporal(TemporalType.DATE)
    @Column(name="created_date")
    private Date createdDate;

    @Column(name="comments",length=255)
    private String comments;

    @Column(name="commision_amount",precision=9)
    private BigDecimal commisionAmount;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="wholesale_code",length=30)
    private String wholesaleCode;

    @Column(name="invoice_no",length=60)
    private String invoiceNo;

    @Column(name="start_nbr",length=60)
    private String startNbr;

    @Column(name="end_nbr",length=60)
    private String endNbr;

    @Column(name="part_type")
    private String partType;

    @Column(name="party_code",length=30)
    private String partyCode;

    @Column(name="wholesale_type")
    private String wholesaleType;

    @Temporal(TemporalType.DATE)
    @Column(name="req_date")
    private Date reqDate;

    @Column(name="priority",precision=3)
    private BigDecimal priority;

    @Column(name="state")
    private String state;

    @Temporal(TemporalType.DATE)
    @Column(name="state_date")
    private Date stateDate;

    public Wholesale(){
        
    }
}
