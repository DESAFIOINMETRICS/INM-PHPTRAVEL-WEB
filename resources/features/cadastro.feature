
Feature: cadastro
Scenario: Cadastro Guest Customers
	When que eu esteja logado
	And clique no menu Accouts
	And clique no menu Guest Customers
	And clique no botão ADD
	And preencha o fomulário
	Then devo validar o email cadastrado
