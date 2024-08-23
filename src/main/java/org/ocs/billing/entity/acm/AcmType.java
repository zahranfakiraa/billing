package org.ocs.billing.entity.acm;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="acm_type")
@NamedQuery(name="AcmType.findAll", query="SELECT a FROM AcmType a")
public class AcmType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="acm_type")
    private String acmType;

    @Column(name="acm_type_name",length=120)
    private String acmTypeName;

    @Column(name="comments",length=1000)
    private String comments;

    public AcmType() {
    }

    
}
