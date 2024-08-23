package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="value_method")
@NamedQuery(name="ValueMethod.findAll",query="SELECT v FROM ValueMethod v")
public class ValueMethod implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="value_method",precision=3)
    private BigDecimal valueMethod;

    @Column(name="method_name",length=120)
    private String methodName;

    @Column(name="comments",length=10000)
    private String comments;

    public ValueMethod(){
        
    }
}
