package org.ocs.billing.repository.prod;

import org.ocs.billing.entity.prod.ProdSpecOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdSpecOffer_Repository extends JpaRepository<ProdSpecOffer,Long>{
    
}
