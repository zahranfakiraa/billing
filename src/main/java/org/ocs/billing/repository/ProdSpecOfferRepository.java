package org.ocs.billing.repository;

import org.ocs.billing.entity.prod.ProdSpecOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdSpecOfferRepository extends JpaRepository<ProdSpecOffer,Long>{
    
}
