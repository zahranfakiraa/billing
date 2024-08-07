package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PricePlanType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricePlanType_Repository extends JpaRepository<PricePlanType, String> {

}
