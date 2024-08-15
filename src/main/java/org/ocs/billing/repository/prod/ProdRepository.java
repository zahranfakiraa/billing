package org.ocs.billing.repository.prod;

import org.ocs.billing.entity.prod.Prod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdRepository extends JpaRepository<Prod,String>{
    
}
