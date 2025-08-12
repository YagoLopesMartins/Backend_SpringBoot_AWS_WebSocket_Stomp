# 💬 Real-Time Chat com Spring Boot, STOMP WebSocket e Deploy na AWS EC2

Este projeto é uma aplicação **Spring Boot** com suporte a **STOMP WebSocket**, permitindo interações de chat em tempo real.  
A aplicação foi configurada para **deploy na AWS EC2**, garantindo alta disponibilidade e escalabilidade para ambientes de produção.

---

## 🚀 Tecnologias Utilizadas

- **Java 17** (compatível com versões superiores)
- **Spring Boot** (API REST e WebSocket)
- **STOMP** (protocolo para comunicação bidirecional)
- **SockJS** (fallback para navegadores sem suporte nativo a WebSocket)
- **AWS EC2** (deploy em instância na nuvem)
- **Maven** (gerenciamento de dependências)
- **Lombok** (redução de boilerplate no código)

---

## ⚙️ Funcionalidades

- Conexão WebSocket via protocolo **STOMP**
- Envio e recebimento de mensagens em tempo real
- Suporte a múltiplas salas de chat
- Mensagens broadcast para todos os usuários conectados
- Deploy automatizado em **AWS EC2**
- Configuração segura com variáveis de ambiente

---

## 📂 Estrutura do Projeto

```plaintext
src/
 ├── main/
 │   ├── java/
 │   │   └── com.example.chat/
 │   │        ├── config/        # Configurações do WebSocket
 │   │        ├── controller/    # Endpoints REST e WebSocket
 │   │        ├── model/         # Modelos e DTOs
 │   │        ├── service/       # Lógica de negócio
 │   │        └── ChatApplication.java
 │   └── resources/
 │       ├── application.yml     # Configurações da aplicação
 │       └── static/             # Arquivos estáticos (frontend)
 └── test/                       # Testes unitários e de integração

## Clone este repositório
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio

## Configure as variáveis de ambiente
export SPRING_PROFILES_ACTIVE=dev
export AWS_ACCESS_KEY=seu-access-key
export AWS_SECRET_KEY=seu-secret-key

## Compile e execute
mvn clean install
mvn spring-boot:run



