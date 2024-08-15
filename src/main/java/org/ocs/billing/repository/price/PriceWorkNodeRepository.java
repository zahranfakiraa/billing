package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PriceWorkNode;
import org.ocs.billing.entity.price.PriceWorkNodePK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceWorkNodeRepository extends JpaRepository<PriceWorkNode, PriceWorkNodePK> {

}
