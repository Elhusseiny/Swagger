package com.example.agreement.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MasterAgreement {
    private String id;
    private String agreementNo;
    private String companyId;
    private String agreementType;
    private String agreementName;
    private String active;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String calendarType;
    private LocalDateTime effectiveDate;
    private Boolean valid;
    private String comment;
    private Person person ;


}
