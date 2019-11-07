#language: pt

Funcionalidade: Cadastro de Guest Management 
    Sendo um usuário Admin cadastrado no site https://www.phptravels.net/admin
    Posso fazer meu login com email e senha
    Para que eu possa me autenticar com sucesso e ter acesso as funcionalidades do sistema

@cadastro_GuestManagement 
Cenário: Usuário Admin cadastrado no sistema faz login e regustra um novo Guest Management com sucesso
  Dado que acesso o site da 'https://www.phptravels.net/admin'
  Quando faço login com usuário 'admin@phptravels.com' e Password 'demoadmin'
  E deve exibir a pagina inicial logada com a mensagem 'Administrator Console'
  E clico em ACCOUNTS no menu lateral
  E clico na opção GuestCustomers
  E Clico no botão Add
  E preencho os campos First Name 'Milagres' Last name 'Maria' Email 'testeday94@teste.com' Password '123456'
  E preencho os campos  Mobile Number '11987654567' Country 'Bermuda' AddressOne 'Rua Arizona'  AddressTwo 'Av Carlos Berrini' Status 'Enabled'
  E clico no botão Submit
  Então cadastro é realizado com sucesso eo email 'testeday94@teste.com' é exibido no grid