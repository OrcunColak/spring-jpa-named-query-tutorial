package com.colak.springtutorial.manytomany.bidirectional.jointable.repository;

import com.colak.springtutorial.manytomany.bidirectional.jointable.jpa.Company;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.extractProperty;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
@Slf4j
class CompanyRepositoryTest {

    @Autowired
    private CompanyRepository companyRepository;


    @Test
    void testHasNameLike() {
        List<Company> companyList = companyRepository.findByCompanyId(1);

        List<String> expectedNames = List.of("company-1");
        List<Object> actualNames = extractProperty("name").from(companyList);

        assertThat(actualNames).containsExactlyElementsOf(expectedNames);
    }

}
