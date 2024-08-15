package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PricePlanSector;
import org.ocs.billing.entity.price.PricePlanSelectorPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricePlanSectorRepository extends JpaRepository<PricePlanSector, PricePlanSelectorPK> {

}
