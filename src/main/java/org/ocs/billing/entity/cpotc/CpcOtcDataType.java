package org.ocs.billing.entity.cpotc;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cpc_otc_data_type")
@NamedQuery(name="CpcOtcDataType.findAll",query="SELECT c FROM CpcOtcDataType c")
public class CpcOtcDataType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="data_type")
    private String dataType;

    @Column(name="data_type_name",length=32)
    private String data_type_name;

    public CpcOtcDataType(){
        
    }
}
