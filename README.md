# 💳 PicPay Simplificado

O **PicPay Simplificado** é uma aplicação backend desenvolvida em **Spring Boot**, que simula uma plataforma de pagamentos digitais.  
Nela, os usuários podem **depositar** valores e realizar **transferências** entre si, de forma simples e segura.

---

## 🚀 Tecnologias utilizadas
- **Java 17+**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
- **H2 Database** (ambiente de desenvolvimento)
- **Maven** (gerenciamento de dependências)
- **Lombok** (para reduzir boilerplate code)

---

## 👥 Tipos de Usuários
O sistema possui dois tipos de usuários:
- **Usuário Comum** → pode enviar e receber transferências.  
- **Lojista** → pode apenas receber transferências (não pode enviar).  

Ambos possuem **carteira digital** com saldo para movimentações.

---

## 📌 Funcionalidades
- Criar usuários (comum ou lojista).  
- Consultar saldo da carteira.  
- Realizar depósitos.  
- Efetuar transferências entre usuários.  
- Registro das transações.  

---

## 🛠️ Como executar o projeto

### Pré-requisitos
- Java 17+  
- Maven  

### Passos para rodar a aplicação
```bash
# Clonar repositório
git clone https://github.com/seu-usuario/picpay-simplificado.git

# Entrar no diretório
cd picpay-simplificado

# Executar o projeto
mvn spring-boot:run
A aplicação estará disponível em:
👉 http://localhost:8080

🔍 Exemplos de Endpoints
Criar usuário
http
Copiar código
POST /usuarios
json
Copiar código
{
  "nome": "João Silva",
  "email": "joao@email.com",
  "cpf": "12345678900",
  "tipo": "COMUM",
  "saldo": 100.0
}
Realizar transferência
http
Copiar código
POST /transacoes
json
Copiar código
{
  "pagadorId": 1,
  "recebedorId": 2,
  "valor": 50.0
}
Consultar saldo
http
Copiar código
GET /usuarios/{id}/saldo
🗄️ Banco de Dados
Utilizado H2 Database em memória.

Console disponível em:
👉 http://localhost:8080/h2-console

Configurações no application.properties.

📖 Próximos passos
Implementar autenticação e autorização.

Integração com banco de dados relacional (PostgreSQL/MySQL).

Criação de testes unitários e de integração.

Deploy em ambiente cloud (Heroku, AWS, etc).
