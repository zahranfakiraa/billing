package org.ocs.billing.repository.pPrice;

import org.ocs.billing.entity.pPrice.PpricePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PpricePlan_Repository extends JpaRepository<PpricePlan,Long>{

}
