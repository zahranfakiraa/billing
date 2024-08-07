package org.ocs.billing.dto.sub;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class SubPricePlanDto {
    private BigDecimal pricePlanId;

    private String pricePlanType;

    private BigDecimal spId = new BigDecimal(0);
}
