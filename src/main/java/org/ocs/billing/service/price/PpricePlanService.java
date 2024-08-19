package org.ocs.billing.service.price;

import java.sql.Date;

import org.ocs.billing.dto.pPrice.CreatePricePlanRequest;
import org.ocs.billing.dto.pPrice.PricePlanResponse;
import org.ocs.billing.entity.pPrice.PpricePlan;
import org.ocs.billing.entity.price.PricePlanType;
import org.ocs.billing.entity.sub.SubsPricePlan;
import org.ocs.billing.repository.pPrice.PpricePlanRepository;
import org.ocs.billing.repository.pPrice.PpricePlanTypeRepository;
import org.ocs.billing.repository.sub.SubsPricePlanRepository;
import org.ocs.billing.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PpricePlanService {

    @Autowired
    private PpricePlanRepository ppricePlanRepository;

    @Autowired
    private SubsPricePlanRepository subsPricePlanRepository;

    @Autowired
    private ValidationService validationService;

    public PricePlanResponse createPricePlan(CreatePricePlanRequest request) {
        validationService.validate(request);

        PpricePlan ppricePlan = new PpricePlan();
        ppricePlan.setPricePlanName(request.getPricePlanName());
        ppricePlan.setPricePlanCode(request.getPricePlanCode());
        ppricePlan.setComments(request.getComments());
        ppricePlan.setState(request.getState());
        ppricePlanRepository.save(ppricePlan);

        SubsPricePlan subsPricePlan = new SubsPricePlan();
        subsPricePlan.setPricePlanId(ppricePlan.getPricePlanId());
        subsPricePlan.setPricePlanType(request.getPricePlanType());
        subsPricePlanRepository.save(subsPricePlan);

        return toResponse(ppricePlan);

    }

    private PricePlanResponse toResponse(PpricePlan ppricePlan) {
        return PricePlanResponse.builder()
                .pricePlanName(ppricePlan.getPricePlanName())
                .pricePlanCode(ppricePlan.getPricePlanCode())
                .comments(ppricePlan.getComments())
                .state(ppricePlan.getState())
                .applyLevel(ppricePlan.getApplyLevel())
                .spId(ppricePlan.getSpId())
                .stateDate((Date) ppricePlan.getStateDate())
                .build();
    }
}
