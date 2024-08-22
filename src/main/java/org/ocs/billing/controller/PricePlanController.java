package org.ocs.billing.controller;

import org.ocs.billing.common.ApiResponse;
import org.ocs.billing.dto.pPrice.CreatePricePlanRequest;
import org.ocs.billing.dto.pPrice.PricePlanResponse;
import org.ocs.billing.service.price.PpricePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PricePlanController {

    @Autowired
    private PpricePlanService ppricePlanService;

    @PostMapping(path = "/api/priceplan", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ApiResponse<PricePlanResponse> createPricePlan(CreatePricePlanRequest request) {
        PricePlanResponse response = ppricePlanService.createPricePlan(request);
        return ApiResponse.<PricePlanResponse>builder().data(response).build();
    }
}
