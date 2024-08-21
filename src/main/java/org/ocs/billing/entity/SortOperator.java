package org.ocs.billing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sort_operator")
@NamedQuery(name = "SortOperator.findAll", query = "SELECT s FROM SortOperator s")
public class SortOperator {

    @Id
    @Column(name = "sort_operator", precision = 1, nullable = false)
    private String sortOperator;

    @Column(name = "sort_operator_name", length = 60, nullable = false)
    private String sortOperatorName;

    @Column(name = "comments", length = 120)
    private String comments;
}
