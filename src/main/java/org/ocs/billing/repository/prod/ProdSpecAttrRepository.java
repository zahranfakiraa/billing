package org.ocs.billing.repository;

import org.ocs.billing.entity.prod.ProdSpecAttr;
import org.ocs.billing.entity.prod.ProdSpecAttrPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdSpecAttrRepository extends JpaRepository<ProdSpecAttr,ProdSpecAttrPK> {
    
}
