# FuelCompensator

O **FuelCompensator** é uma aplicação que ajuda os usuários a determinar qual combustível é mais vantajoso (álcool ou gasolina) com base nos preços atuais. A aplicação consiste em um **frontend** desenvolvido em **React** e um **backend** em **Java** com **Spring Boot**, integrado a um banco de dados **PostgreSQL**.

## Funcionalidades

### Frontend:
- Interface para o usuário inserir dados como nome, email, telefone, modelo do carro, valor da gasolina e valor do etanol.
- Exibe o resultado do cálculo, indicando qual combustível é mais vantajoso.

### Backend:
- Recebe os dados do frontend via API REST.
- Realiza o cálculo para determinar se o álcool ou a gasolina é mais vantajoso.
- Armazena os dados do usuário no banco de dados PostgreSQL.

## Tecnologias Utilizadas

### Frontend:
- **React.js**
- **Axios** (para requisições HTTP)
- **CSS** (para estilização)

### Backend:
- **Java** (Spring Boot)
- **Spring Data JPA** (para acesso ao banco de dados)
- **PostgreSQL** (banco de dados)

### Ferramentas:
- **IntelliJ IDEA** (para desenvolvimento do backend)
- **VS Code** (para desenvolvimento do frontend)
- **Postman** (para testar a API)

## Como Executar o Projeto

### Pré-requisitos
- **Java 17**: Instale o JDK 17.
- **Node.js**: Instale o Node.js (versão 16 ou superior).
- **PostgreSQL**: Instale e configure o PostgreSQL.
- **Maven ou Gradle**: Para gerenciar as dependências do backend.

### Configuração do Banco de Dados
1. Crie um banco de dados no PostgreSQL chamado `fuel_db`.
2. Crie um usuário `fuel_user` com senha `fuel_password`.
3. Conceda todas as permissões necessárias ao usuário:

```sql
GRANT ALL PRIVILEGES ON DATABASE fuel_db TO fuel_user;
```

## Configuração do Backend

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/FuelCompensator.git
cd FuelCompensator/backend-fuel
```

2. Configure o arquivo `application.properties`:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/fuel_db
spring.datasource.username=fuel_user
spring.datasource.password=fuel_password
spring.jpa.hibernate.ddl-auto=update
```

3. Execute o backend:
- Usando Maven:
```bash
mvn spring-boot:run
```

- Usando Gradle:
``` bash
./gradlew bootRun
```

O backend está disponível em ```http://localhost:8080```.

## Configuração do Frontend

1. Navegue até a pasta do frontend:
```bash
cd ../frontend-fuel
```

2. Instale as dependências:
```bash
npm install
```

3. Inicie o frontend:
```bash
npm start
```

O frontend estará disponível em ```http://localhost:3000```.
