package org.ocs.billing.entity.cbec;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cbec_unit")
@NamedQuery(name="CbecUnit.findAll", query="SELECT c FROM CbecUnit c")
public class CbecUnit implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="unit_id",precision=6)
    private BigDecimal unitId;

    @Column(name="unit_type_id",precision=3)
    private BigDecimal unitTypeId;

    @Column(name="unit_name",length=60)
    private String unitName;

    @Column(name="unit_code",length=60)
    private String unitCode;

    @Column(name="system_revserve")
    private String systemReverse;

    @Column(name="display_scale",precision=3)
    private BigDecimal displayScale;

    @Column(name="comments",length=255)
    private String comments;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="state")
    private String state;

    @Temporal(TemporalType.DATE)
    @Column(name="created_date")
    private Date createdDate;

    @Column(name="party_type")
    private String partyType;

    @Column(name="party_code",length=30)
    private String partyCode;

    @Column(name="sub_unit_id",precision=6)
    private BigDecimal subUnitId;

    public CbecUnit(){
        
    }
}
