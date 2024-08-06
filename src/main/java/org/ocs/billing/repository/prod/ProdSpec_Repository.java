package org.ocs.billing.repository.prod;

import org.ocs.billing.entity.prod.ProdSpec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdSpec_Repository extends JpaRepository<ProdSpec,Long>{
    
}
