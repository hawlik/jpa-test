package com.example.jpa_map.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapKey;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Map;

@Table(name = "company")
@Entity
public class Company {

  private Integer id;

  private String name;

  private Map<CompanyAttribute, CompanyAttributeValue> attributes;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @MapKey(name = "companyAttribute")
  public Map<CompanyAttribute, CompanyAttributeValue> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<CompanyAttribute, CompanyAttributeValue> attributes) {
    this.attributes = attributes;
  }
}
