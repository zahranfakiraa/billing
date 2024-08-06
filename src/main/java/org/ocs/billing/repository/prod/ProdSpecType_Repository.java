package org.ocs.billing.repository.prod;

import org.ocs.billing.entity.prod.ProdSpecType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdSpecType_Repository extends CrudRepository<ProdSpecType,String>{
    
}
