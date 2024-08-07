package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PricePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricePlan_Repository extends JpaRepository<PricePlan,Long> {
    
}
