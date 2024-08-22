package org.ocs.billing.entity.param;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="param_category")
@NamedQuery(name="ParamCategory.findAll",query="SELECT p FROM ParamCategory p")
public class ParamCategory implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="param_category_id",precision=6)
    private BigDecimal paramCategoryId;

    @Column(name="param_category_code",length=120)
    private String paramCategoryCode;

    @Column(name="param_category_name",length=120)
    private String paramCategoryName;

    @Column(name="use_scope")
    private String useScope;

    @Column(name="comments",length=255)
    private String comments;

    public ParamCategory(){
        
    }
}
