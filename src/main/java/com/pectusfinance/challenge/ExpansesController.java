package com.pectusfinance.challenge;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/expanses")
public class ExpansesController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping
    public List<Map<String, Object>> get(@RequestParam String query) {
        NativeQuery<Map<String, Object>> nq = (NativeQuery<Map<String, Object>>) entityManager.createNativeQuery(query);
        nq.setResultTransformer(AliasToEntityMapResultTransformer.INSTANCE);
        return nq.getResultList();
    }
}
