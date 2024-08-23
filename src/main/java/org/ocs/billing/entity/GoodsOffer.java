package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="goods_offer")
@NamedQuery(name="GoodsOffer.findAll",query="SELECT g FROM GoodsOffer g")
public class GoodsOffer implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="offer_id",precision=9)
    private BigDecimal offerId;

    @Column(name="model_id",precision=9)
    private BigDecimal modelId;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    public GoodsOffer(){

    }
}
