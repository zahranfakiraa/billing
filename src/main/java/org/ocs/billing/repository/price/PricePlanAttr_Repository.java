package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PricePlanAttr;
import org.ocs.billing.entity.price.PricePlanAttrPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricePlanAttr_Repository extends JpaRepository<PricePlanAttr,PricePlanAttrPK>{
    
}
