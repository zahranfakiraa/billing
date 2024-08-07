package org.ocs.billing.service.price;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.ocs.billing.dto.pPrice.PpricePlanTypeDto;
import org.ocs.billing.entity.pPrice.PpricePlanType;
import org.ocs.billing.repository.pPrice.PpricePlanType_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PpricePlanType_Service {

    @Autowired
    private PpricePlanType_Repository ppricePlanType_Repository;

    public static PpricePlanTypeDto getDtoFromPpricePlanTypeDto(PpricePlanType ppricePlanType) {
        PpricePlanTypeDto ppricePlanTypeDto = new PpricePlanTypeDto(ppricePlanType);
        return ppricePlanTypeDto;
    }

    // public List<PpricePlanTypeDto> getAllPpricePlanType() {
    //     List<PpricePlanType> ppricePlanType = ppricePlanType_Repository.findAll();
    //     List<PpricePlanTypeDto> ppricePlanTypeDto = new ArrayList<>();
    //     for (PpricePlanType ppricePlan : ppricePlanType) {
    //         ppricePlanTypeDto.add(getDtoFromPpricePlanTypeDto(ppricePlan));
    //     }
    //     return ppricePlanTypeDto;
    // }

    public Optional<PpricePlanType> getPpricePlanTypeName(String pricePlanType) {
        return ppricePlanType_Repository.findByPricePlanType(pricePlanType);
    }

    // buat sub price plan
    // public void addPpricePlanType(PpricePlanTypeDto ppricePlanTypeDto) {
    //     PpricePlanType ppricePlanType = getPpricePlanTypeFromDto(ppricePlanTypeDto);
    //     ppricePlanType_Repository.save(ppricePlanType);
    // }
}
