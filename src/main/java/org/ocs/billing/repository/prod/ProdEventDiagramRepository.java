package org.ocs.billing.repository.prod;

import org.ocs.billing.entity.prod.ProdEventDiagram;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdEventDiagramRepository extends CrudRepository<ProdEventDiagram,Long>{
    
}
