package org.ocs.billing.service.price;

import java.util.List;

import org.ocs.billing.dto.response.PpricePlanType_Response;
import org.ocs.billing.entity.pPrice.PpricePlanType;
import org.ocs.billing.repository.pPrice.PpricePlanType_Repository;
import org.springframework.stereotype.Service;

@Service
public class PpricePlanType_Service {

    public PpricePlanType_Repository ppricePlanType_Repository;

    private PpricePlanType_Response toPpricePlanTypeResponse(List<PpricePlanType> ppricePlanType) {
        PpricePlanType_Response response = null;
        for (PpricePlanType planType : ppricePlanType) {
            response = PpricePlanType_Response.builder()
                    .pricePlanType(planType.getPricePlanType())
                    .comments(planType.getComments())
                    .pricePlanTypeName(planType.getPricePlanTypeName())
                    .build();
        }
        return response;
    }

    public PpricePlanType_Response getAllPpricePlanType(String pricePlanType) {
        List<PpricePlanType> ppricePlanType = ppricePlanType_Repository.findAll();
        return toPpricePlanTypeResponse(ppricePlanType);
    }

    // root table SubPricePlan

    // list all pPrice Type

    // get pPrice Type

}
