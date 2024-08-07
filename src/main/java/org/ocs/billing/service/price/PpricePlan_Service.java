package org.ocs.billing.service.price;

import org.ocs.billing.dto.PpricePlanDto;
import org.ocs.billing.entity.pPrice.PpricePlan;
import org.ocs.billing.repository.pPrice.PpricePlanType_Repository;
import org.ocs.billing.repository.pPrice.PpricePlan_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PpricePlan_Service {
    
    @Autowired
    private PpricePlan_Repository ppricePlan_Repository;

    @Autowired
    private PpricePlanType_Service ppricePlanType_Service;

    @Autowired
    private PpricePlanType_Repository ppricePlanType_Repository;

    public static PpricePlan getPpricePlanFromDto (PpricePlanDto ppricePlanDto) {
        PpricePlan ppricePlan = new PpricePlan();
        ppricePlan.setPricePlanName(ppricePlanDto.getPricePlanName());
        ppricePlan.setPricePlanCode(ppricePlanDto.getPricePlanCode());
        ppricePlan.setComments(ppricePlanDto.getComments());
        ppricePlan.setSpId(ppricePlanDto.getSpId());
        ppricePlan.setState(ppricePlanDto.getState());
        ppricePlan.setStateDate(ppricePlanDto.getStateDate());
        return ppricePlan;
    }

    public void addPpricePlan(PpricePlanDto ppricePlanDto) {
        PpricePlan ppricePlan = getPpricePlanFromDto(ppricePlanDto);
        ppricePlan_Repository.save(ppricePlan);
    }

    // service add price plan type
    // service add price plan
    // service gabungin ke sub price plan
}
