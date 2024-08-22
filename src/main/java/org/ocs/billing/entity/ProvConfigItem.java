package org.ocs.billing.entity;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="prov_config_item")
@NamedQuery(name="ProvConfigItem.findAll",query = "Seelect p FROM ProvConfigItem p")
public class ProvConfigItem implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id",precision=9)
    private long id;

    @Column(name="section_id",precision=9)
    private String sectionId;

    @Column(name="item_key",length=255)
    private String itemKey;

    @Column(name="item_value",length=100)
    private String itemValue;

    @Column(name="comments",length=256)
    private String comments;

    public ProvConfigItem(){
        
    }

}
