# Santander Dev Week 2023 – API de Conta Bancária 💳

Projeto desenvolvido como parte do bootcamp *Santander Dev Week 2023, promovido pela **DIO (Digital Innovation One)*.
O objetivo é construir uma API RESTful em Java utilizando *Spring Boot, com integração ao banco de dados **PostgreSQL* hospedado na *Railway*.

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL (na nuvem, via Railway)
- Gradle
- pgAdmin 4
- Git & GitHub

---

## 🧠 Funcionalidades implementadas

- Cadastro de contas bancárias
- Consulta de contas por ID ou listagem geral
- Atualização de dados de conta
- Exclusão de contas
- Persistência de dados no banco PostgreSQL remoto
- Acesso e visualização dos dados via pgAdmin

---

## 📦 Modelo da entidade Account

```java
@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal additionalLimit;
}