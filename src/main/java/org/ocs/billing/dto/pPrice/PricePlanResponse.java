package org.ocs.billing.dto.pPrice;

import java.math.BigDecimal;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PricePlanResponse {

    private String pricePlanName;

    private String pricePlanCode;

    private String comments;

    private String state;

    private String applyLevel;

    private BigDecimal spId;

    private Date stateDate;
}
