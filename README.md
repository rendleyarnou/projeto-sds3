# projeto-sds3

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/rendleyarnou/projeto-sds3/blob/develop/LICENSE)

# Sobre o projeto

https://rendley-sds3.netlify.app/

DSVendas é uma aplicação web usando Java com Spring Boot no Back-End e TypeScript com ReactJS no Front-End, construída durante a 3ª edição da **Semana DevSuperior** (#sds3), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em uma pesquisa de vendas realizadas, onde os dados são armazenados no banco de dados relacional Postgres, e depois são listados no app web, que também apresenta um dashboard com gráficos baseados nestes dados.

## Layout web

![Página Home](https://github.com/rendleyarnou/projeto-sds3/blob/develop/assets/home-page.png)

![Página Dashboard](https://github.com/rendleyarnou/projeto-sds3/blob/develop/assets/dashboard-page.png)

## Modelo conceitual

![Modelo Conceitual](https://github.com/rendleyarnou/projeto-sds3/blob/develop/assets/modelo-conceitual.png)

## Padrão camadas

![Padrão Camadas](https://github.com/rendleyarnou/projeto-sds3/blob/develop/assets/camadas.png)

# Tecnologias utilizadas

## Back end

- Java
- Spring Boot
- JPA / Hibernate
- H2
- Web
- Postgres
- Maven
- Security

## Front end

- HTML / CSS / JS / TypeScript
- ReactJS
- Bootstrap
- Apex Charts
- Axios
- React Router DOM
- React Hooks
- Componentes
- Props
- Estado

## Implantação em produção

- Back-End: Heroku
- Front-End web: Netlify
- Banco de dados: PostgreSQL

# Como executar o projeto

```bash
# clonar repositório
git clone https://github.com/rendleyarnou/projeto-sds3.git
```

## Back-End

Pré-requisitos: Java 11

```bash
# entrar na pasta do projeto backend
cd backend

# executar o projeto
./mvnw spring-boot:run
```

## Front-End

Pré-requisitos: npm / yarn

```bash
# entrar na pasta do projeto frontend
cd frontend

# instalar dependências
yarn install

# executar o projeto
yarn start
```

# Autor

Rendley Arnou Xavier

[LinkedIn](https://www.linkedin.com/in/rendley-arnou/ "Perfil no LinkedIn")
