# Primos em Pi
Projeto realizado utilizando Spring Boot, H2 Database, Spring Web, Spring Data JPA, Spring Boot DevTools e Bean Validation

## Visão Geral
A resolução do problema foi realizada utilizando uma REST API para gerenciar inicialmente o número PI, ao decorrer da solução imaginei uma solução mais reutilizável e capaz de ser utilizada de forma dinâmica com possibilidade de passar qualquer número pela API e assim retornar o resultado trabalhado.

## Passo a Passo
A solução pode ser utilizada em conjunto com uma API Client, por exemplo o POSTMAN, a fim de gerenciar os números que serão salvos no banco de dados H2, um CRUD completo foi implementado para esse gerenciamento.
A solução foi desenvolvida para que o primeiro número que seja salvo no banco de dados seja trabalhado de forma a retornar no console a maior sequência de números primos, de até 4 dígitos.

Por exemplo: Se passarmos 20 casas decimais do número PI, ele irá capturar as maiores sequências de números primos e imprimir uma linha contendo a maior sequência encontrada, sem espaços.

Como validação, foi usado o bean validation para limitar o tamanho do número que pode ser passado ao banco de dados, nesse cenário setando a limitação até 200 caracteres

# Banco de Dados
O banco de dados H2 pode ser utilizado ao rodar a aplicação pela porta “http://localhost:8080/h2” e utilizando as credenciais:

url = jdbc:h2:mem:banco
username = adm
password = adm



