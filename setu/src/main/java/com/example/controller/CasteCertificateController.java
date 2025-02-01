package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.service.ApplicationService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Locale;

@Controller
public class CasteCertificateController {

    @Autowired
    private ApplicationService applicationService;

    @GetMapping("/")
    public String home(@RequestParam(value = "lang", required = false) String lang, jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) {
        if (lang != null) {
            request.getSession().setAttribute("org.springframework.web.servlet.i18n.SessionLocaleResolver.LOCALE", new Locale(lang));
        }
        return "index";
    }

    @PostMapping("/submit")
    public String submitApplication(@RequestParam("beneficiaryName") String beneficiaryName,
                                     @RequestParam("fatherName") String fatherName,
                                     @RequestParam("address") String address,
                                     @RequestParam("caste") String caste,
                                     @RequestParam("mobile") String mobile,
                                     @RequestParam("email") String email,
                                     @RequestParam("certificateType") String certificateType,
                                     @RequestParam("documents") String documents,
                                     Model model) {
        applicationService.saveApplication(beneficiaryName, fatherName, address, caste, mobile, email, certificateType, documents);
        model.addAttribute("message", "success.message");
        return "success";
    }
}

