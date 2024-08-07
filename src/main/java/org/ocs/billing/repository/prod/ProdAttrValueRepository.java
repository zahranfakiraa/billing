package org.ocs.billing.repository.prod;

import org.ocs.billing.entity.prod.ProdAttrValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdAttrValueRepository extends JpaRepository<ProdAttrValue,String>{
    
}