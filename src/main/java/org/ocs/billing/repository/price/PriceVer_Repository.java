package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PriceVer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceVer_Repository extends JpaRepository<PriceVer, Long> {

}
