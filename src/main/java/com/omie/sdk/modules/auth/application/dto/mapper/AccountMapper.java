package com.omie.sdk.modules.auth.application.dto.mapper;


import com.omie.sdk.modules.auth.application.dto.request.CreateAccountRequest;
import com.omie.sdk.modules.auth.infra.entity.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account toEntity(CreateAccountRequest createAccountRequest);
}
