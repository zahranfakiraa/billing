package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="serv_type_nbr_type")
@NamedQuery(name="ServTypeNbrType.findAll",query="SELECT g FROM ServTypeNbrType g")
public class ServTypeNbrType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="acc_nbr_type_id",precision=3)
    private BigDecimal accNbrTypeId;

    @Column(name="serv_type",precision=3)
    private BigDecimal servType;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    public ServTypeNbrType(){
        
    }
}
