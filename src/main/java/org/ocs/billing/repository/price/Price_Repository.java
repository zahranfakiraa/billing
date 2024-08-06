package org.ocs.billing.repository.price;

import org.ocs.billing.entity.price.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Price_Repository extends JpaRepository<Price,Long>{
    
}
