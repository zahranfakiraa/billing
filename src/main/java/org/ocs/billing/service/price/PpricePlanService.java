package org.ocs.billing.service.price;

import java.math.BigDecimal;
import java.sql.Date;

import org.ocs.billing.dto.pPrice.CreatePricePlanRequest;
import org.ocs.billing.dto.pPrice.PricePlanResponse;
import org.ocs.billing.entity.pPrice.PpricePlan;
import org.ocs.billing.entity.pPrice.PpricePlanType;
import org.ocs.billing.entity.sub.SubsPricePlan;
import org.ocs.billing.repository.pPrice.PpricePlanRepository;
import org.ocs.billing.repository.pPrice.PpricePlanTypeRepository;
import org.ocs.billing.repository.sub.SubsPricePlanRepository;
import org.ocs.billing.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class PpricePlanService {

    @Autowired
    private PpricePlanRepository ppricePlanRepository;

    @Autowired
    private SubsPricePlanRepository subsPricePlanRepository;

    @Autowired
    private PpricePlanTypeRepository pricePlanTypeRepository;

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

        PpricePlanType ppricePlanType = pricePlanTypeRepository.findById(request.getPricePlanType())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Price plan type not found"));

        SubsPricePlan subsPricePlan = new SubsPricePlan();
        subsPricePlan.setPricePlanId(ppricePlan);
        subsPricePlan.setPricePlanType(ppricePlanType);
        subsPricePlan.setSpId(new BigDecimal(0));
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
