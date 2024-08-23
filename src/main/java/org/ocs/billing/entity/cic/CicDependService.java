package org.ocs.billing.entity.cic;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cic_depend_service")
@NamedQuery(name="CicDependService.findAll",query="SELECT c FROM CicDependService c")
public class CicDependService implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="service_id",precision=6)
    private BigDecimal serviceId;

    @Column(name="service_code",length=30)
    private String serviceCode;

    @Column(name="service_name",length=64)
    private String serviceName;

    @Column(name="call_method")
    private String callMethod;

    @Column(name="service_path",length=250)
    private String ServicePath;

    @Column(name="service_method",length=100)
    private String serviceMethod;

    @Column(name="registry_group",length=64)
    private String registryGroup;

    @Column(name="data_type")
    private String dataType;

    @Column(name="edi_env",length=8)
    private String ediEnv;

    public CicDependService(){
        
    }
}
