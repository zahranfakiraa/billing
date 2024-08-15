package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PricePlanAttr;
import org.ocs.billing.entity.price.PricePlanAttrPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricePlanAttrRepository extends JpaRepository<PricePlanAttr,PricePlanAttrPK>{
    
}
