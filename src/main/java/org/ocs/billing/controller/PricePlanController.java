package org.ocs.billing.controller;

import java.util.*;

import org.ocs.billing.common.ApiResponse;
import org.ocs.billing.dto.pPrice.PpricePlanDto;
import org.ocs.billing.entity.pPrice.PpricePlanType;
import org.ocs.billing.service.price.PpricePlanTypeService;
import org.ocs.billing.service.price.PpricePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/ppricePlan")
public class PricePlanController {

    @Autowired
    private PpricePlanService ppricePlan_Service;

    @Autowired
    private PpricePlanTypeService ppricePlanType_Service;

    @PostMapping("/")
    public ResponseEntity<ApiResponse> addPpricePlan(@RequestBody PpricePlanDto ppricePlanDto) {
        Optional<PpricePlanType> ppricePlanType = ppricePlanType_Service
                .getPpricePlanTypeName(ppricePlanDto.getPricePlanType());
        if (!ppricePlanType.isPresent()) {
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "Type is invalid"), HttpStatus.CONFLICT);
        }
        ppricePlan_Service.addPpricePlan(ppricePlanDto, ppricePlanType.get());
        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "Price Plan has been added"), HttpStatus.CREATED);

    }

}
