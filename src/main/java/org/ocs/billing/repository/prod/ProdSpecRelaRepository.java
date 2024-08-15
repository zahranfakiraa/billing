package org.ocs.billing.repository.prod;

import org.ocs.billing.entity.prod.ProdSpecRela;
import org.ocs.billing.entity.prod.ProdSpecRelaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdSpecRelaRepository extends JpaRepository<ProdSpecRela,ProdSpecRelaPK>{
    
}
