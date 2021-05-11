<h2>API REST com retorno da distância entre duas cidades brasileiras</h2>

Pequeno sistema desenvolvido com base em curso da Digital Inovation - Bootcamp Java Developer - para retornar a distância entre duas cidades do brasil.


Neste sistema foram desenvolvidos os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initializr em https://start.spring.io;
* Desenvolvimento de operações de busca de países, estados e cidades com o padrão arquitetural REST;
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados;
* Utilização do Postgre através do Docker;  
* Implantação do sistema na nuvem através do Heroku.

Para consultar o app implantado no Heroku deve-se usar os seguintes end-points:

* Buscar os países:

```shell script
https://distancebetweenbrazilscities.herokuapp.com/countries
```

* Buscar os estados:
```shell script
https://distancebetweenbrazilscities.herokuapp.com/states
``` 

* Buscar as cidades:
```shell script
https://distancebetweenbrazilscities.herokuapp.com/cities
``` 

* Buscar a distancia entre cidades em metros:
```shell script
https://distancebetweenbrazilscities.herokuapp.com/distances/by-cube?from={idCidade1}&to={idCidade2}
``` 

* Buscar a distancia entre cidades em milhas:
```shell script
https://distancebetweenbrazilscities.herokuapp.com/distances/by-points?from={idCidade1}&to={idCidade2}
``` 

São necessários os seguintes pré-requisitos para a execução do projeto:

* Java 8
* Maven
* Spring Web
* Spring Data JPA
* PostgreSQL Driver
* Docker
* Preferencialmente Intellj IDEA Community Edition