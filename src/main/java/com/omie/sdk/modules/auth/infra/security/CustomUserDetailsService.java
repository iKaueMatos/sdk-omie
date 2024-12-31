package com.omie.sdk.modules.auth.infra.security;

import com.omie.sdk.modules.auth.infra.repository.AccountRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final AccountRepository accountRepository;

    public CustomUserDetailsService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return accountRepository.findByEmail(email)
                .map(account -> User.withUsername(account.getEmail())
                        .password(account.getPassword())
                        .roles(account.getRole().name())
                        .build())
                .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado!."));
    }
}

