package com.example.agreement.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SalesAgreementDetailsDTO {

    private String id;
    private String agreementNo;
    private String agreementType;
    private String agreementName;
    private String status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String calendarType;
    private LocalDateTime effectiveDate;
    private Boolean valid;
    private String comment;
    private List<SalesAgreementItemDTO> salesAgreementItems;
}
