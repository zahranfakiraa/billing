package org.ocs.billing.repository.sub;



import org.ocs.billing.entity.pPrice.PpricePlan;
import org.ocs.billing.entity.sub.SubsPricePlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubsPricePlanRepository extends JpaRepository<SubsPricePlan, PpricePlan> {


}
