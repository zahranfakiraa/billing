package org.ocs.billing.service;

import java.util.List;

import org.ocs.billing.entity.prod.ProdSpecAttr;
import org.ocs.billing.repository.ProdSpecAttrRepository;
import org.ocs.billing.repository.ProdSpecTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class ProdSpecTypeService {
    
    @Autowired
    private ProdSpecTypeRepository prodSpecTypeRepository;

    @Autowired
    private ProdSpecAttrRepository prodSpecAttrRepository;
    
    @PostConstruct
    void setup(){
        System.out.println("================"+prodSpecTypeRepository.count());
        List<ProdSpecAttr> listProdSpecAttr=prodSpecAttrRepository.findAll();
        listProdSpecAttr.forEach( entity->{
                   System.out.println(entity.getId().getProdSpecId()+"=="+entity.getId().getAttrId());
                }
        );
    }
}
