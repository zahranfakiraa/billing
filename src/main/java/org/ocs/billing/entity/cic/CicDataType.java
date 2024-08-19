package org.ocs.billing.entity.cic;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="cic_data_type")
@NamedQuery(name="CicDataType.findAll",query="SELECT c FROM CicDataType c")
public class CicDataType implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="data_type")
    private String dataType;

    @Column(name="data_type_name",length=32)
    private String data_type_name;

    public CicDataType(){
        
    }

}
