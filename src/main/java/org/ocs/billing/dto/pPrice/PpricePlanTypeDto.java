package org.ocs.billing.dto.pPrice;

import org.ocs.billing.entity.pPrice.PpricePlanType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PpricePlanTypeDto {
    private String pricePlanType;

    private String comments;

    private String pricePlanTypeName;

    public PpricePlanTypeDto(PpricePlanType ppricePlanType) {
        this.pricePlanType = ppricePlanType.getPricePlanType();
        this.comments = ppricePlanType.getComments();
        this.pricePlanTypeName = ppricePlanType.getPricePlanTypeName();
    }

}
