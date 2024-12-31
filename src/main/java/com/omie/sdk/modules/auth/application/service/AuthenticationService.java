package com.omie.sdk.modules.auth.application.service;

import com.omie.sdk.modules.auth.application.dto.request.AuthenticationRequest;
import com.omie.sdk.modules.auth.application.dto.request.RegisterRequest;
import com.omie.sdk.modules.auth.application.dto.response.ActivationCodeResponse;
import com.omie.sdk.modules.auth.application.dto.response.AuthenticationResponse;

public interface AuthenticationService {
    ActivationCodeResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);
    ActivationCodeResponse activate(String key);
    ActivationCodeResponse reactive(String email);
}
