package org.ocs.billing.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="recurring_re_type")
@NamedQuery(name="RecurringReType.findAll",query="SELECT r FROM RecurringReType r")
public class RecurringReType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="recuring_re_type")
    private String recuringReType;

    @Column(name="recurring_re_type_name",length=120)
    private String recurringReTypeName;

    @Column(name="comments")
    private String comments;

    public RecurringReType(){
        
    }
}
