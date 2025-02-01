package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Application;
import com.example.repository.ApplicationRepository;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;

    public void saveApplication(String beneficiaryName, String fatherName, String address, String caste,
                                 String mobile, String email, String certificateType, String documents) {
        Application application = new Application();
        application.setBeneficiaryName(beneficiaryName);
        application.setFatherName(fatherName);
        application.setAddress(address);
        application.setCaste(caste);
        application.setMobile(mobile);
        application.setEmail(email);
        application.setCertificateType(certificateType);
        application.setDocumentsPath(documents);
        applicationRepository.save(application);
    }
}

