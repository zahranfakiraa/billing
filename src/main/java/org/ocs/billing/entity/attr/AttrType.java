package org.ocs.billing.entity.attr;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="attr_type")
@NamedQuery(name="AttrType.findAll", query="SELECT a FROM AttrType a")
public class AttrType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="attr_type")
    private String attrType;

    @Column(name="attr_type_name",length=60)
    private String attrTypeName;

    @Column(name="comments",length=4000)
    private String comments;

    public AttrType() {
    }
}
