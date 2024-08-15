package org.ocs.billing.repository.prod;

import org.ocs.billing.entity.prod.ProdSelector;
import org.ocs.billing.entity.prod.ProdSelectorPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdSelectorRepository extends CrudRepository<ProdSelector,ProdSelectorPK>{
    
}
