# Desafio Selenium
Este é um projeto de automação de teste web utilizando as tecnologias Java, Maven, Cucumber e Selenium WebDriver na IDE IntelliJ IDEA. O objetivo deste projeto é automatizar testes em páginas web para garantir a qualidade do software. O projeto é a concretização da Prova técnica de Automação de Teste para o Programa FormaNT.

## Pré-requisitos
- Java 20 JDK instalado
- Maven instalado
- IntelliJ IDEA instalado

## Estrutura do Projeto

O projeto segue uma estrutura de diretório comum para projetos Maven:
- src/test/java: Contém classes Java para os testes Cucumber.
- src/test/resources: Contém os arquivos .feature que definem os cenários de teste.

## Executando os Testes

Você pode executar os testes Cucumber a partir da linha de comando ou diretamente do IntelliJ IDEA.


### A partir da linha de comando:

nvm test

### No IntelliJ IDEA:

- [ ] Abra a classe RunnerTest em src/test/java/Runner
- [ ] Clique com o botão direito na classe e selecione "Run RunnerTest"

## Estrutura dos Cenários de Teste

Os cenários de teste são definidos nos arquivos .feature em src/test/resources/feature. Por exemplo:

```
#language: pt
Funcionalidade: Teste desafio
  Esquema do Cenário: Teste primeiro exercício
    Dado que esteja na página 'https://www.grocerycrud.com/v1.x/demo/bootstrap_theme'
    Quando mudar o valor da combo Select version para 'Bootstrap V4 Theme'
    E clicar no botão Add Customer
    E preencher o formulário de cliente com:
      | Campo            | Valor         |
      | Name             | João          |
      | Last name        | Santos        |
      | ContactFirstName | seu nome      |
      | Phone            | 51 94444-4444 |
      | AddressLine1     | Rua A, n 100  |
      | AddressLine2     | Apto 201      |
      | City             | Porto Alegre  |
      | State            | RS            |
      | PostalCode       | 99999-999     |
      | Country          | Brasil        |
      | from Employeer   | Fixter        |
      | CreditLimit      | 100           |
    Então verificar se o cliente foi adicionado com sucesso


```




