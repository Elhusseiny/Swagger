package com.example.agreement.entity;

import java.time.LocalDateTime;

public class MasterAgreementEntity {

    private String id;
    private String bssAgreementId;


    private String bssMsaAgreementId;

    private MasterAgreementEntity msaAgreement;
    private String revision;
    private String previousRevision;

    //read it from refAgreementId, first version of agreement, will always be used displaying agreement to users
    private String bssFirstAgreementId;


    private MasterAgreementEntity firstAgreement;

    private String agreementName;
    private String agreementType;
    private String agreementSubType;
    private String sourceSystemCode;

    // we will use our ids for relations.
    // read it from accountId and mapped it to our company id using the companyAccount mapping table
    private String companyId;

    private String bssAccountId; // read it from accountId

    private String calendarType;
    private LocalDateTime effectiveDate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String comment;
    private LocalDateTime approvalDate;
    private String rejectionReason;
    private String approverName;
    private String validInd;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String createdBy;
    private String modifiedBy;

}
