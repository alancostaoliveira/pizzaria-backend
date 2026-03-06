# Pizzaria Backend

Backend da aplicação de pizzaria desenvolvido em Spring Boot.

## Tecnologias

- Java 21
- Spring Boot 4.0.3
- MySQL
- JPA/Hibernate
- Lombok

## Configuração do Banco

1. Instale MySQL
2. Crie o banco `db_pizzaria` ou configure `createDatabaseIfNotExist=true`
3. Configure usuário/senha em `application.properties`

## Executar

```bash
mvn spring-boot:run
```

A API estará disponível em http://localhost:8080

## Endpoints

- GET /api/pizzas - Listar pizzas
- POST /api/clientes - Cadastrar cliente
- POST /api/auth/login - Login
- POST /api/pedidos - Fazer pedido

## Estrutura

- Controllers: Endpoints REST
- Models: Entidades JPA
- Repositories: Acesso a dados
- Services: Lógica de negócio