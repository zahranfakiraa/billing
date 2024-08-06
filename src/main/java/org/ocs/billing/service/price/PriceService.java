package org.ocs.billing.service.price;

import java.util.List;

import org.ocs.billing.entity.price.PricePlan;
import org.ocs.billing.repository.price.PricePlan_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceService {
    @Autowired
    private PricePlan_Repository priceRepository;

    public List<PricePlan> listPrices() {
        return priceRepository.findAll();
    }

    public void save(PricePlan pricePlan){
        
    }
}
