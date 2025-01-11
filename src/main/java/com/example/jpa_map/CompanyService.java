
package com.example.jpa_map;

import com.example.jpa_map.entity.Company;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompanyService {

  @PersistenceContext
  private EntityManager entityManager;

  public Company findCompany(Integer id) {
    return entityManager.find(Company.class, id);
  }

  public void update(Company company) {
    entityManager.merge(company);
  }
}
