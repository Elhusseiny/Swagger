package com.example.agreement.mapper;

import com.example.agreement.DTO.MasterAgreementDTO;
import com.example.agreement.entity.MasterAgreement;
import org.mapstruct.*;

@Mapper
public interface AgreementMapper {

    @Mappings({
            @Mapping(target = "imageUrl" , ignore = true) , // will not map this
            @Mapping(source = "active" , target = "status") , // will map value of 'active' to 'status'
            @Mapping(target = "createdBy" , source = "person.firstName" ) // will map the nested value
    })
    MasterAgreementDTO toDTO (MasterAgreement masterAgreement) ;

    @AfterMapping
    default void setImageUrl (MasterAgreement masterAgreement , @MappingTarget MasterAgreementDTO masterAgreementDTO)
    {
        masterAgreementDTO.setImageUrl("url");
    }

    @AfterMapping
    default void setName (MasterAgreement masterAgreement , @MappingTarget MasterAgreementDTO masterAgreementDTO)
    {
        masterAgreementDTO.setImageUrl("url");
    }
}
