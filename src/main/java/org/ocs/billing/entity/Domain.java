package org.ocs.billing.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="domain")
@NamedQuery(name="Domain.findAll", query= "SELECT d FROM Domain d")
public class Domain implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="table_name",length=60)
    private String tableName;

    @Id
    @Column(name="column_name",length=60)
    private String columName;

    @Id
    @Column(name="value",length=60)
    private String value;

    @Column(name="lookup_name",length=60)
    private String lookupName;

    @Column(name="comments",length=120)
    private String comments;

    public Domain(){
        
    }
}
