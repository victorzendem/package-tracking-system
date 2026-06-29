# 📦 Sistema de Rastreamento de Encomendas (Backend Java)

## 📖 Sobre o projeto

Este projeto consiste em um sistema de rastreamento de encomendas desenvolvido em **Java**, utilizando os princípios da
**Programação Orientada a Objetos (POO)** e uma arquitetura em camadas.

O objetivo é simular o funcionamento do backend de uma transportadora, permitindo o cadastro e o acompanhamento de
encomendas por meio de um código de rastreamento.

Além da implementação das funcionalidades, o foco principal foi compreender como organizar um projeto backend,
distribuir responsabilidades entre as camadas e aplicar boas práticas de desenvolvimento.

---

# 🚀 Funcionalidades

* Cadastro de encomendas
* Busca por código de rastreamento
* Listagem de encomendas
* Atualização de status
* Remoção de encomendas
* Histórico de alterações de status
* Validação das regras de negócio
* Lançamento de exceções personalizadas

---

# 📌 Regras de negócio

* O código de rastreamento deve ser único.
* Toda encomenda inicia com o status **PEDIDO_CRIADO**.
* Cada alteração de status é registrada automaticamente no histórico.
* Apenas transições de status permitidas podem ser realizadas.
* Não é permitido atualizar uma encomenda para um status inválido.
* Não é permitido cadastrar duas encomendas com o mesmo código.

---

# 🏗️ Arquitetura

```text
src
└── application
    └── main
        └── java
            └── br
                └── com
                    └── victorzendem
                        └── rastreamento
                            ├── application
                            ├── enums
                            ├── exception
                            ├── model
                            ├── repository
                            ├── service
                            ├── validator
                         
```

Cada camada possui uma responsabilidade específica:

* **model** → Representa as entidades do sistema.
* **repository** → Responsável pelo armazenamento e consulta das encomendas.
* **service** → Implementa as regras de negócio e coordena o fluxo da aplicação.
* **validator** → Centraliza as validações de entrada e das regras de negócio.
* **exception** → Contém as exceções personalizadas.
* **enums** → Define os estados possíveis das encomendas e suas regras de transição.
* **application** → Contém as classes responsáveis pela execução da aplicação e pela interação com o usuário.

---

# 📚 Conceitos praticados

Durante o desenvolvimento foram praticados diversos conceitos da linguagem Java, entre eles:

* Programação Orientada a Objetos (POO)
* Arquitetura em camadas
* Encapsulamento
* Collections (`List`, `Map` e `Set`)
* `Optional`
* `Stream API`
* `Enum` com atributos, construtor e métodos
* Exceções personalizadas
* Validação de regras de negócio
* `LocalDateTime`
* Imutabilidade com `final`

---

# 🧠 Objetivo de aprendizagem

Este projeto faz parte de uma sequência de projetos práticos com o objetivo de desenvolver experiência em Java Backend.

Mais do que implementar funcionalidades, o foco foi aprender a:

* Modelar problemas do mundo real.
* Separar responsabilidades entre as camadas.
* Aplicar boas práticas de orientação a objetos.
* Escolher as coleções adequadas para cada situação.
* Desenvolver código limpo, organizado e de fácil manutenção.
* Construir uma base sólida para futuramente trabalhar com Spring Boot, APIs REST e bancos de dados.

---

# 🎯 Tecnologias utilizadas

* Java
* IntelliJ IDEA (ou outra IDE Java)

# 📦 Package Tracking System (Java Backend)

## 📖 About the Project

This project consists of a package tracking system developed in **Java**, following the principles of **Object-Oriented
Programming (OOP)** and a layered architecture.

Its purpose is to simulate the backend of a shipping company, allowing package registration and tracking through a
unique tracking code.

Beyond implementing the required features, the main goal was to understand how to organize a backend project, separate
responsibilities between layers, and apply software development best practices.

---

# 🚀 Features

* Package registration
* Search by tracking code
* List all packages
* Update package status
* Remove packages
* Track status history
* Business rule validation
* Custom exception handling

---

# 📌 Business Rules

* Each tracking code must be unique.
* Every package starts with the **PEDIDO_CRIADO** status.
* Every successful status update is automatically recorded in the package history.
* Only valid status transitions are allowed.
* A package cannot be updated to an invalid status.
* Two packages cannot share the same tracking code.

---

# 🏗️ Architecture

```text
src
└── application
    └── main
        └── java
            └── br
                └── com
                    └── victorzendem
                        └── rastreamento
                            ├── application
                            ├── enums
                            ├── exception
                            ├── model
                            ├── repository
                            ├── service
                            ├── validator
                           
```

Each layer has a specific responsibility:

* **model** → Represents the application's domain entities.
* **repository** → Responsible for storing and retrieving packages.
* **service** → Contains the business logic and coordinates application use cases.
* **validator** → Centralizes input validation and business rule validation.
* **exception** → Contains the application's custom exceptions.
* **enums** → Defines package statuses and their allowed transitions.
* **application** → Contains the classes responsible for running the application and interacting with the user.

---

# 📚 Concepts Practiced

Throughout the development of this project, the following Java concepts were practiced:

* Object-Oriented Programming (OOP)
* Layered Architecture
* Encapsulation
* Collections (`List`, `Map`, and `Set`)
* `Optional`
* Stream API
* Enums with attributes, constructors, and methods
* Custom Exceptions
* Business Rule Validation
* `LocalDateTime`
* Immutability using `final`

---

# 🧠 Learning Objectives

This project is part of a practical Java Backend learning journey focused on gaining real-world development experience.

More than implementing features, the goal was to learn how to:

* Model real-world problems.
* Separate responsibilities between application layers.
* Apply Object-Oriented Programming best practices.
* Choose the most appropriate collection for each scenario.
* Write clean, organized, and maintainable code.
* Build a solid foundation before learning Spring Boot, REST APIs, and databases.

---

# 🎯 Technologies Used

* Java
* IntelliJ IDEA (or any other Java IDE)
