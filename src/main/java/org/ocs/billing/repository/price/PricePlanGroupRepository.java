package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PricePlanGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricePlanGroupRepository extends JpaRepository<PricePlanGroup,Long>{
    
}
