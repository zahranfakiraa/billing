package org.ocs.billing.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="ratable_resoruce")
@NamedQuery(name="RatableResource.findAll",query="SELECT g FROM RatableResource g")
public class RatableResource implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne
    @JoinColumn(name="resource_id",referencedColumnName="acm_cycle_type_id")
    private BigDecimal resourceId;

    @Column(name="acm_type")
    private String acmType;

    @Column(name="mask",length=30)
    private String mask;

    @Column(name="resource_name",length=120)
    private String resourceName;

    @Column(name="comments",length=1000)
    private String comments;

    @Column(name="re_attr",precision=6)
    private BigDecimal reAttr;

    @Column(name="offset",precision=9)
    private BigDecimal offset;

    @Column(name="time_unit")
    private String timeUnit;

    @Column(name="is_package_res")
    private String isPackageRes;

    @Column(name="acm_once")
    private String acmOne;

    @Column(name="resource_code",length=30)
    private String resourceCode;

    @Column(name="sp_id",precision=6)
    private BigDecimal spId;

    @Column(name="acct_res_id",precision=6)
    private BigDecimal acctResId;

    @Column(name="acct_res_id_list",length=120)
    private String acctResIdList;

    public RatableResource(){
        
    }
}
