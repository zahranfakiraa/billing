package org.ocs.billing.entity.acm;

import java.io.Serializable;
import java.math.BigDecimal;

import org.ocs.billing.entity.price.PriceVer;
import org.ocs.billing.entity.re.ReAttr;

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
    @JoinColumn(name="price_ver_id", nullable=false, insertable=false, updatable=false,referencedColumnName = "price_ver_id")
    private PriceVer priceVerId;

    @Column(name="acm_name", length=60)
    private String acmName;

    @OneToOne
    @JoinColumn(name="re_attr", nullable=false, insertable=false, updatable=false,referencedColumnName = "re_attr")
    private ReAttr reAttr;

    @Column(name="sp_id", precision=6)
	private BigDecimal spId;

    @Column(length=1000)
	private String comments;

    @Column(name="rum",precision = 5)
    private BigDecimal rum;

    @Column(name="ref_resource_id", nullable=false, precision=6)
	private BigDecimal refResourceId;

    @Column(name="ref_value_id", nullable=false, precision=6)
	private BigDecimal refValueId;

    @Column(name="template_flag", length=100)
    private String templateFlag;

    @Column(name="share_flag", length=100)
    private String shareFlag;

    public Acm() {
    }
    

}
