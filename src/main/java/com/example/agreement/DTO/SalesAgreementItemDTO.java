package com.example.agreement.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SalesAgreementItemDTO {

    private String productName;
    private String productOfferName;
    private String currencyCode;
    private String productSpecificationName;
}
