package com.colak.springtutorial.manytomany.bidirectional.jointable.repository;

import com.colak.springtutorial.manytomany.bidirectional.jointable.jpa.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// We can also use QuerydslPredicateExecutor  instead of JpaSpecificationExecutor
public interface CompanyRepository extends JpaRepository<Company, Integer> {

    // Using the named query defined in the Company entity
    @Query(name = "Company.findById")
    List<Company> findByCompanyId(int id);

}
