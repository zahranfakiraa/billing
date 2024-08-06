package org.ocs.billing.repository;

import org.ocs.billing.entity.prod.ProdSpec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdSpecRepository extends JpaRepository<ProdSpec,Long>{
    
}
