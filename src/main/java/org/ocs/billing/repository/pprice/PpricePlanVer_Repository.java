package org.ocs.billing.repository.pPrice;

import org.ocs.billing.entity.pPrice.PpricePlanVer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PpricePlanVer_Repository extends JpaRepository<PpricePlanVer,Long>{
    
}
