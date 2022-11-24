package com.example.agreement.controller;

import com.example.agreement.DTO.MasterAgreementDTO;
import com.example.agreement.DTO.SalesAgreementDTO;
import com.example.agreement.DTO.SalesAgreementDetailsDTO;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;

@RestController
@RequiredArgsConstructor
public class AgreementController {
    @Operation(summary = "list all master agreements by companyId ")
    @GetMapping("/companies/{companyId}/agreement/master")
    public MasterAgreementDTO getMasterAgreementForCompany(@PathVariable Long companyId) {
        return null;
    }

    @Operation(summary = "list all sales agreements by by masterAgreementId, allowing paging and sorting ")
    @GetMapping("/companies/{masterAgreementId}/agreement/sales")
    public Page<SalesAgreementDTO> getSalesAgreements(@PathVariable String masterAgreementId,
                                                      @RequestParam(required = false, defaultValue = "0") final Integer page,
                                                      @RequestParam(required = false, defaultValue = "10") final Integer size,
                                                      @RequestParam(required = false, defaultValue = "startDate") final String sort,
                                                      @RequestParam(required = false, defaultValue = "desc") final String sortDirection) {

        return null;
    }


    @Operation(summary = "list all sales agreements details by by masterAgreementId")
    @GetMapping("/companies/{salesAgreementId}/agreement/sales/details")
    public SalesAgreementDetailsDTO getSalesAgreementDetails(@PathVariable String salesAgreementId) {
        return null;
    }
}

