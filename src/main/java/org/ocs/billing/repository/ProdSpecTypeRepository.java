package org.ocs.billing.repository;

import org.ocs.billing.entity.prod.ProdSpecType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdSpecTypeRepository extends CrudRepository<ProdSpecType,String>{
    
}
