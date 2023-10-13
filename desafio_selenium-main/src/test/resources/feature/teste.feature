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