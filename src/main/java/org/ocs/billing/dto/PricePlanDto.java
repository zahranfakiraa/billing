package org.ocs.billing.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PricePlanDto {
    private String pricePlanName;

    private String pricePlanCode;

    private String pricePlanType;

    private String comments;

    


}