package org.ocs.billing.entity.Om;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="om_ne_param_inst")
@NamedQuery(name="OmNeParamInst.findAll",query="SELECT o FROM OmNeParamInst o")
public class OmNeParamInst implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="ne_id",precision=6)
    private BigDecimal neId;

    @Column(name="param_id",precision=6)
    private BigDecimal paramId;

    @Column(name="default_value",length=1024)
    private String defaultValue;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    public OmNeParamInst(){
        
    }
}
