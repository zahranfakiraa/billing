package org.ocs.billing.repository.pPrice;

import org.ocs.billing.entity.pPrice.PpricePlanType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PpricePlanType_Repository extends JpaRepository<PpricePlanType,String>{
    
}
