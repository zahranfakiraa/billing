package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.PricePlanGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PricePlanGenreRepository extends JpaRepository<PricePlanGenre,String>{
    
}
