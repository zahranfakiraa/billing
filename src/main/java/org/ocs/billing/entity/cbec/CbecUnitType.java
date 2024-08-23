package org.ocs.billing.entity.cbec;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cbec_unit_type")
@NamedQuery(name = "CbecUnitType.findAll", query = "SELECT c FROM CbecUnitType c")
public class CbecUnitType {

    @Id
    @Column(name = "unit_type_id", precision = 3, nullable = false)
    private BigDecimal unitTypeId;

    @Column(name = "unit_type_name", length = 30, nullable = false)
    private String unitTypeName;

    @Column(name = "default_unit_id", precision = 6)
    private BigDecimal defaultUnitId;

    @Column(name = "comments", length = 260)
    private String comments;
}
