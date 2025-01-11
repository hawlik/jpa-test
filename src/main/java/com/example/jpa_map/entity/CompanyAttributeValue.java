package com.example.jpa_map.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "company_attribute_value")
@Entity
public class CompanyAttributeValue {

  private Integer id;
  private String value;
  private Company company;
  private CompanyAttribute companyAttribute;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "val")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @ManyToOne(fetch = FetchType.LAZY, cascade = {})
  @JoinColumn(name = "company_id")
  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  @ManyToOne(fetch = FetchType.LAZY, cascade = {})
  @JoinColumn(name = "company_attribute_id")
  public CompanyAttribute getCompanyAttribute() {
    return companyAttribute;
  }

  public void setCompanyAttribute(CompanyAttribute companyAttribute) {
    this.companyAttribute = companyAttribute;
  }
}
