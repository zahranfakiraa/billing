package org.ocs.billing.entity.bill;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="bill_offer_inst")
@NamedQuery(name="BillOfferInst.findAll",query="SELECT b FROM BillOfferInst b")
public class BillOfferInst implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="offer_inst_id",precision=15)
    private BigDecimal offerInstId;

    @Column(name="seq",precision=12)
    private BigDecimal seq;

    @Column(name="instance_id",precision=15)
    private BigDecimal instanceId;

    @Column(name="offer_id",precision=9)
    private BigDecimal offerId;

    @Column(name="obj_type",length=10)
    private String objType;

    @Temporal(TemporalType.DATE)
    @Column(name="begin_rent_date")
    private Date beginRentDate;

    @Column(name="precise_flag")
    private String preciseFlag;

    @Column(name="status_cd")
    private String statusCd;

    @Temporal(TemporalType.DATE)
    @Column(name="create_date")
    private Date createDate;

    @Temporal(TemporalType.DATE)
    @Column(name="update_date")
    private Date updateDate;

    @Temporal(TemporalType.DATE)
    @Column(name="completed_date")
    private Date completedDate;

    @Temporal(TemporalType.DATE)
    @Column(name="eff_date")
    private Date effDate;

    @Temporal(TemporalType.DATE)
    @Column(name="exp_date")
    private Date expDate;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="cust_id",precision=15)
    private BigDecimal custId;

    @Column(name="routing_id",precision=6)
    private BigDecimal routingId;

    public BillOfferInst(){
        
    }

}
