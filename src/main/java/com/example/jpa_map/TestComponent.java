package com.example.jpa_map;

import com.example.jpa_map.entity.Company;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {

  private static final Logger log = LoggerFactory.getLogger(TestComponent.class);
  private final CompanyService companyService;

  public TestComponent(CompanyService companyService) {
    this.companyService = companyService;
  }

  @PostConstruct
  public void test () {
    log.info("**** Find company by id ****");
    Company company = companyService.findCompany(2);
    log.info("*** Company found: " + company.getName() + " ****");


    log.info("**** Running company data update ****");
    company.setName("Some new name");
    companyService.update(company);
    log.info("**** Company update success ****");


    log.info("**** Find company by id ****");
    Company updated = companyService.findCompany(2);
    log.info("**** Company found: " + updated.getName() + "****");

  }
}
