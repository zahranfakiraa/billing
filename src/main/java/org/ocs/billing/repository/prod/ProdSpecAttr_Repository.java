package org.ocs.billing.repository.prod;

import org.ocs.billing.entity.prod.ProdSpecAttr;
import org.ocs.billing.entity.prod.ProdSpecAttrPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdSpecAttr_Repository extends JpaRepository<ProdSpecAttr,ProdSpecAttrPK> {
    
}
