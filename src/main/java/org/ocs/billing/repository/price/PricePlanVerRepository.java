package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PricePlanVer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricePlanVerRepository extends JpaRepository<PricePlanVer, Long> {

}
