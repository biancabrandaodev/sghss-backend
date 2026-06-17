# 🏥 SGHSS - Sistema de Gestão Hospitalar e de Serviços de Saúde

Projeto desenvolvido para a disciplina **Projeto Multidisciplinar** do curso de **Análise e Desenvolvimento de Sistemas**.

## 👩‍🎓 Autora

**Bianca Brandão**

---

# 📋 Sobre o Projeto

O SGHSS (Sistema de Gestão Hospitalar e de Serviços de Saúde) foi desenvolvido com o objetivo de auxiliar instituições de saúde no gerenciamento de pacientes e consultas médicas.

O sistema permite o cadastro e gerenciamento de pacientes, bem como o registro e consulta de atendimentos médicos, utilizando uma arquitetura baseada em API REST.

---

# 🚀 Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* Hibernate
* PostgreSQL
* Maven
* Lombok
* Postman
* Git
* GitHub

---

# 🏗 Arquitetura

O projeto foi desenvolvido utilizando arquitetura em camadas:

```text
Controller
   ↓
Service
   ↓
Repository
   ↓
PostgreSQL
```

Essa estrutura facilita a manutenção, organização e escalabilidade da aplicação.

---

# 📊 Modelagem

## Entidades Implementadas

### Paciente

* id
* nome
* cpf
* telefone
* email

### Consulta

* id
* dataHora
* especialidade
* status
* observacoes
* paciente

---

# 🔗 Relacionamentos

```text
PACIENTE (1) -------- (N) CONSULTA
```

Um paciente pode possuir várias consultas cadastradas.

Cada consulta pertence a apenas um paciente.

---

# 📌 Funcionalidades Implementadas

## Pacientes

* Cadastro de pacientes
* Consulta de pacientes
* Atualização de pacientes
* Exclusão de pacientes

## Consultas

* Cadastro de consultas
* Consulta de consultas
* Relacionamento entre consulta e paciente

---

# 🌐 Endpoints da API

## Pacientes

### Criar paciente

```http
POST /pacientes
```

### Listar pacientes

```http
GET /pacientes
```

### Buscar paciente por ID

```http
GET /pacientes/{id}
```

### Atualizar paciente

```http
PUT /pacientes/{id}
```

### Excluir paciente

```http
DELETE /pacientes/{id}
```

---

## Consultas

### Criar consulta

```http
POST /consultas
```

### Listar consultas

```http
GET /consultas
```

### Buscar consulta por ID

```http
GET /consultas/{id}
```

---

# 🧪 Testes

Os testes da API foram realizados utilizando o Postman.

Casos de teste executados:

* Cadastro de paciente
* Consulta de pacientes
* Atualização de pacientes
* Exclusão de pacientes
* Cadastro de consultas
* Consulta de consultas

Todos os testes foram executados com sucesso utilizando respostas HTTP 200 OK.

---

# 🗄 Banco de Dados

Banco utilizado:

```text
PostgreSQL
```

Persistência realizada através do JPA/Hibernate.

---

# 📚 Objetivo Acadêmico

Este projeto foi desenvolvido para aplicação prática dos conceitos estudados em:

* Engenharia de Software
* Programação Orientada a Objetos
* Desenvolvimento de APIs REST
* Banco de Dados Relacional
* Persistência de Dados com JPA/Hibernate

---

# 🔮 Melhorias Futuras

* Autenticação de usuários
* Controle de perfis de acesso
* Prontuário eletrônico
* Receitas digitais
* Gestão de profissionais de saúde
* Internações hospitalares
* Relatórios gerenciais

---

# 📎 Repositório

GitHub:

https://github.com/biancabrandaodev/sghss-backend

---

# 📄 Licença

Projeto desenvolvido exclusivamente para fins acadêmicos.
