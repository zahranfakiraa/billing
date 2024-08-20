package org.ocs.billing.entity.gm;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="gm_model")
@NamedQuery(name="GmModel.findAll",query="SELECT g FROM GmModel g")
public class GmModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id@Column(name="model_id",precision=9)
    private BigDecimal modelId;

    @Column(name="brand_id",precision=9)
    private BigDecimal brandId;

    @Column(name="model_name",length=60)
    private String modelName;

    @Column(name="comments",length=4000)
    private String comments;

    @Column(name="cost_price",precision=12)
    private BigDecimal costPrice;

    @Column(name="std_code",length=60)
    private String stdCode;

    public GmModel(){
        
    }
}
