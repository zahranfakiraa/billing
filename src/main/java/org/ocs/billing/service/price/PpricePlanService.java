package org.ocs.billing.service.price;

import org.ocs.billing.dto.pPrice.PpricePlanDto;
import org.ocs.billing.entity.pPrice.PpricePlan;
import org.ocs.billing.entity.pPrice.PpricePlanType;
import org.ocs.billing.repository.pPrice.PpricePlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PpricePlanService {
    
    @Autowired
    private PpricePlanRepository ppricePlan_Repository;

    public static PpricePlan getPpricePlanFromDto(PpricePlanDto ppricePlanDto, PpricePlanType ppricePlanType) {
        PpricePlan ppricePlan = new PpricePlan();
        ppricePlan.setPricePlanType(ppricePlanType);
        ppricePlan.setComments(ppricePlanDto.getComments());
        ppricePlan.setPricePlanName(ppricePlanDto.getPricePlanName());
        ppricePlan.setPricePlanCode(ppricePlanDto.getPricePlanCode());
        ppricePlan.setState(ppricePlanDto.getState());
        ppricePlan.setApplyLevel(ppricePlanDto.getApplyLevel());
        ppricePlan.setSpId(ppricePlanDto.getSpId());
        ppricePlan.setStateDate(new java.sql.Date(ppricePlanDto.getStateDate().getTime()));
        return ppricePlan;
    }

    public void addPpricePlan(PpricePlanDto ppricePlanDto, PpricePlanType ppricePlanType) {
        PpricePlan ppricePlan = getPpricePlanFromDto(ppricePlanDto, ppricePlanType);
        ppricePlan_Repository.save(ppricePlan);
    }

    // service add price plan type
    // service add price plan
    // service gabungin ke sub price plan
}
