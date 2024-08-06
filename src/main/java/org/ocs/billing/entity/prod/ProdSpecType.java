package org.ocs.billing.entity.prod;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="prod_spec_type")
public class ProdSpecType implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="prod_spec_type")
    private String prodSpecType;

    @Column(length=120)
    private String comments;

    @Column(name="prod_spec_type_name")
    private String prodSpecTypeName;
}
