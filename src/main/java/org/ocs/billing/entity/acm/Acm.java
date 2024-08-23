package org.ocs.billing.entity.acm;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.price.PriceVer;
import org.ocs.billing.entity.re.ReAttr;
import org.ocs.billing.entity.re.RefValue;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="acm")
@NamedQuery(name="Acm.findAll", query="SELECT a FROM Acm a")
public class Acm implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @OneToOne
    @JoinColumn(name="price_ver_id",referencedColumnName = "price_ver_id")
    private PriceVer priceVerId;

    @Column(name="acm_name", length=60)
    private String acmName;

    @Column(name="re_attr",precision=6)
    private ReAttr reAttr;

    @Column(name="sp_id", precision=6)
	private BigDecimal spId;

    @Column(length=1000)
	private String comments;

    @Column(name="rum",precision = 12)
    private BigDecimal rum;

    @Column(name="ref_resource_id", nullable=false, precision=9)
	private BigDecimal refResourceId;

    @OneToOne
    @JoinColumn(name="ref_value_id", nullable=false,referencedColumnName = "ref_value_id")
	private RefValue refValueId;

    @Column(name="template_flag", length=100)
    private String templateFlag;

    @Column(name="share_flag", length=100)
    private String shareFlag;

    public Acm() {
    }
    

}
