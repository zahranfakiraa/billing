package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PricePlanRela;
import org.ocs.billing.entity.price.PricePlanRelaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricePlanRela_Repository extends JpaRepository<PricePlanRela, PricePlanRelaPK> {

}
