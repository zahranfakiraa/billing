package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="fg_evoucher")
@NamedQuery(name="FgEvoucher.findAll",query="SELECT g FROM FgEvoucher g")
public class FgEvoucher implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="fg_code",length=30)
    private String fgCode;

    @Column(name="par_value",precision=12)
    private BigDecimal parValue;

    public FgEvoucher(){
        
    }
}
