package org.ocs.billing.controller;

import java.util.List;
import java.util.Optional;

import org.ocs.billing.common.ApiResponse;
import org.ocs.billing.dto.pPrice.PpricePlanDto;
import org.ocs.billing.entity.pPrice.PpricePlanType;
import org.ocs.billing.service.price.PpricePlanType_Service;
import org.ocs.billing.service.price.PpricePlan_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/ppricePlan")
public class PricePlan_Controller {

    @Autowired
    private PpricePlan_Service ppricePlan_Service;

    @Autowired
    private PpricePlanType_Service ppricePlanType_Service;

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
