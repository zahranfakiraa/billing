package org.ocs.billing.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class PricePlanDto {
    private String pricePlanName;

    private String pricePlanCode;

    private String pricePlanType;

    public PricePlanDto() {
    }

    
}
