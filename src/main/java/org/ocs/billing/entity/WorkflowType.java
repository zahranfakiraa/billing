package org.ocs.billing.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "workflow_type")
@NamedQuery(name = "WorkflowType.findAll", query = "SELECT w FROM WorkflowType w")
public class WorkflowType {

    @Id
    @Column(name = "workflow_type", precision = 1, nullable = false)
    private String workflowType;

    @Column(name = "workflow_type_name", length = 60, nullable = false)
    private String workflowTypeName;

    @Column(name = "comments", length = 255)
    private String comments;

    @Column(name = "func_type_flag_posi", precision = 3)
    private BigDecimal funcTypeFlagPosi;
}
