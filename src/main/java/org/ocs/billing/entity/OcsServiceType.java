package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="ocs_service_type")
@NamedQuery(name="OcsServiceType.findAll",query="SELECT g FROM OcsServiceType g")
public class OcsServiceType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="ocs_service_type",precision=3)
    private BigDecimal ocsServiceType;

    @Column(name="service_name",length=255)
    private String serviceName;

    @Column(name="service_code",length=32)
    private String serviceCode;

    @Column(name="apply")
    private String apply;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    public OcsServiceType(){
        
    }
}
