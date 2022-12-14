package com.example.agreement.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MasterAgreementDTO {
    @JsonProperty("agreementId")
    private String id;
    private String agreementNo;
    @JsonIgnore
    private String companyId;
    private String agreementType;
    private String agreementName;
    private String status;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String calendarType;
    private LocalDateTime effectiveDate;
    private Boolean valid;
    private String comment;
    private String createdBy;
    private String imageUrl;


}
