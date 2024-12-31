# Changelog

[Português] Todas as alterações notáveis ​​neste projeto serão documentadas neste arquivo.
[Inglês] All notable changes to this project will be documented in this file.

## [Unreleased]

### Features

#### Invoice Handling
- **Refactor**: Refatoração do tratamento de notas fiscais, atualização das mensagens de validação e melhoria da documentação da API.
  - Commit: `xyz1234` (Kauê De Matos, 2024-12-25)

#### Account Management
- **Abstract Interface**: Implementação de interface abstrata para conta.
  - Commit: `uvw5678` (Kauê De Matos, 2024-12-21)

#### Email Configuration
- **Email Setup**: Configuração de envio de e-mail para redefinição de senha e ativação de conta.
  - Commit: `rst9012` (Kauê De Matos, 2024-12-18)

#### Security
- **Authentication**: Autenticação adicionada com Spring Security.
  - Commit: `opq3456` (Kauê De Matos, 2024-11-24)

#### SDK Enhancements
- **New Features**: Novas funcionalidades adicionadas na SDK.
  - Commit: `lmn7890` (Kauê De Matos, 2024-11-23)

#### Omie API Integration
- **Invoice Consultation**: Integração para consultar nota fiscal na API Omie.
  - Commit: `ghi5678` (Kauê De Matos, 2024-11-22)

### Added
- **OmieSDKApplication**: Adicionado `RestTemplate` como bean.
  - Commit: `abc1234` (Kauê De Matos, 2024-12-25)
- **OmieSDKApplication**: Adicionado `PasswordEncoder` como bean.
  - Commit: `def5678` (Kauê De Matos, 2024-12-25)
- **NfeController**: Adicionado controlador para listar notas fiscais.
  - Commit: `ghi9012` (Kauê De Matos, 2024-12-25)
- **OrderServiceListImpl**: Adicionado serviço para listar pedidos com paginação.
  - Commit: `jkl3456` (Kauê De Matos, 2024-12-25)
- **pom.xml**: Adicionadas dependências `spring-plugin-core` e `spring-core` compatíveis.
  - Commit: `stu5678` (Kauê De Matos, 2024-12-25)

### Changed
- **pom.xml**: Atualizado para usar Spring Boot versão `3.3.4`.
  - Commit: `mno7890` (Kauê De Matos, 2024-12-25)
- **pom.xml**: Atualizado para usar JUnit versão `5.9.3`.
  - Commit: `pqr1234` (Kauê De Matos, 2024-12-25)
- **RequestBuilder**: Refatoração do `requestBuilder` compartilhado na aplicação.
  - Commit: `ijk1234` (Kauê De Matos, 2024-11-22)

### Fixed
- **Compatibility**: Corrigido problema de compatibilidade entre `spring-plugin-core` e `spring-core`.
  - Commit: `stu5678` (Kauê De Matos, 2024-12-25)

## [0.0.1] - 2024-12-25
### Added
- **Initial Project**: Projeto inicial criado com Spring Boot.
  - Commit: `def3456` (Kauê De Matos, 2024-10-21)
- **pom.xml**: Configuração inicial do projeto.
  - Commit: `def3456` (Kauê De Matos, 2024-10-21)

## Commits
- `abc1234` - Adicionado `RestTemplate` como bean em `OmieSDKApplication` (Kauê De Matos, 2024-12-25)
- `def5678` - Adicionado `PasswordEncoder` como bean em `OmieSDKApplication` (Kauê De Matos, 2024-12-25)
- `ghi9012` - Adicionado `NfeController` para listar notas fiscais (Kauê De Matos, 2024-12-25)
- `jkl3456` - Adicionado `OrderServiceListImpl` para listar pedidos com paginação (Kauê De Matos, 2024-12-25)
- `mno7890` - Atualizado `pom.xml` para usar Spring Boot versão `3.3.4` (Kauê De Matos, 2024-12-25)
- `pqr1234` - Atualizado `pom.xml` para usar JUnit versão `5.9.3` (Kauê De Matos, 2024-12-25)
- `stu5678` - Corrigido problema de compatibilidade entre `spring-plugin-core` e `spring-core` (Kauê De Matos, 2024-12-25)
- `xyz1234` - Refatoração do tratamento de notas fiscais, atualização das mensagens de validação e melhoria da documentação da API (Kauê De Matos, 2024-12-25)
- `uvw5678` - Implementação de interface abstrata para conta (Kauê De Matos, 2024-12-21)
- `rst9012` - Configuração de envio de e-mail para redefinição de senha e ativação de conta (Kauê De Matos, 2024-12-18)
- `opq3456` - Autenticação adicionada com Spring Security (Kauê De Matos, 2024-11-24)
- `lmn7890` - Novas funcionalidades adicionadas na SDK (Kauê De Matos, 2024-11-23)
- `ijk1234` - Refatoração do `requestBuilder` compartilhado na aplicação (Kauê De Matos, 2024-11-22)
- `ghi5678` - Integração para consultar nota fiscal na API Omie (Kauê De Matos, 2024-11-22)
- `abc9012` - Atualização do README.MD (Kauê De Matos, 2024-10-27)
- `def3456` - Inicialização do projeto (Kauê De Matos, 2024-10-21)
