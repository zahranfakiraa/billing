package org.ocs.billing.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PpricePlanType_Response {
    private String pricePlanType;

    private String comments;

    private String pricePlanTypeName;

}
