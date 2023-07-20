# Contracts registry
This project aims to provide a comprehensive software solution designed to streamline
and optimize the management of contracts within a capital group. This sytem shall
centralize and automate the entire contract lifecycle, from creation and approval 
to tracking and renewal, ensuring seamless collaboration between engaged parties and 
increasing overall operational efficiency.

## Table of contents

1. [Key features](features)
2. [Used technologies](technologies)
3. [Deployment](deployment)
4. [Usage](usage)

## Key features
<a name="features"/>

- [ ] Contract drafts – allows to create drafts and propose them for acceptation.
- [ ] Contract approval – allows selected users to approve or disapprove contracts.
- [ ] Contract management – allows contract manager, manager of assigned department
and organization/legal/economic department employess to edit contracts.
- [ ] Contractors management – allows to manage contractors data.
- [ ] Register of changes – stores information on contract and contractors data 
revisions.
- [ ] Organization structure management – allows to manage capital group companies
and their departments.
- [ ] Users management – allows administrator to create, update, and delete users 
and assign them to roles and departments.

## Used technologies
<a name="technologies"/>

- [Java 20](https://dev.java/) ([Maven](https://maven.apache.org/))
- [Spring 3](https://spring.io/) ([Hibernate](https://hibernate.org/), [Swagger](https://swagger.io/))
- [Vue 3](https://vuejs.org/)
- [Materialize CSS](https://materializecss.com/)
- [Postgres](https://www.postgresql.org/)
- [Docker](https://www.docker.com/)


## Deployment
<a name="technologies"/>

### Prerequisites
- Computer supporitng amd64 or arm64/v8 instruction set.
- Installed [Docker Desktop](https://www.docker.com/products/docker-desktop/) or 
[Docker Engine on Linux](https://docs.docker.com/engine/install/).
- Downloaded source code.

### Run the environment
1. Run with `docker compose --env-file development.env up --build`.
2. ~~The application will be available at [localhost](http://localhost).~~ <br>
The client application has not been created yet; therefore, only the
API is currently available at [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Usage
<a name="usage"/>

> ⚠️ The client application has not been created yet.