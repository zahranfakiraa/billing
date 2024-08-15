package org.ocs.billing.entity.cbec;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cbec_unit_type")
@NamedQuery(name="CbecUnitType.findAll", query="SELECT c FROM CbecUnitType c")
public class CbecUnitType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="unit_type_id", precision=3)
    private Long unitTypeId;

    @Column(name="unit_type_name",length=30)
    private String unitTypeName;

    @Column(name="default_unit_id",precision=6)
    private BigDecimal defaultUnitId;

    @Column(name="comments",length=60)
    private String comments;

    public CbecUnitType(){
        
    }
}
