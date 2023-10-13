#language: pt
  Funcionalidade: teste 2 desafio selenium

  Contexto: executar passos do exercício 1
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

    Cenario: Deletar registro já criado
      Dado que seja clicado no link Go back to list
      E clicar na coluna Search Name
      E digitar o conteúdo do nome 'João'
      E clicar no checkbox abaixo da palavra Actions
      E clicar no botão Delete
      Então validar o texto "Are you sure that you want to delete" através de uma asserção para a popup que será apresentada
      Quando clicar no botão Delete da popup
      Então validar a mensagem "Your data has been successfully deleted from the database." dentro de um box verde na parte superior direita da tela