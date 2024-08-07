package org.ocs.billing.dto;

import lombok.*;

@Data
public class PricePlanDto {
    private String pricePlanName;

    private String pricePlanCode;

    private String pricePlanType;

    public PricePlanDto() {
    }
    
}
