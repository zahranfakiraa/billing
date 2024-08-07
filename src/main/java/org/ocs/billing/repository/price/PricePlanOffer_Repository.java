package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PricePlanOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricePlanOffer_Repository extends JpaRepository<PricePlanOffer,Long>{
    
}
