package com.colak.springtutorial.manytomany.bidirectional.jointable.service;

import com.colak.springtutorial.manytomany.bidirectional.jointable.jpa.Company;
import com.colak.springtutorial.manytomany.bidirectional.jointable.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Transactional(readOnly = true)
    public List<Company> findByCompanyId(int id) {
        return companyRepository.findByCompanyId(id);
    }
}
