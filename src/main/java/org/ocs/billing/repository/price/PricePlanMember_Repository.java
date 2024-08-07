package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PricePlanMember;
import org.ocs.billing.entity.price.PricePlanMemberPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricePlanMember_Repository extends JpaRepository<PricePlanMember,PricePlanMemberPK>{
    
}
