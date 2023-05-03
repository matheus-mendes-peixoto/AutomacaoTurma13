
@tag
Feature: Banco original

   @aberturaconta
  	
  	Scenario: Fluxo do formulario de abertura 
 	 	#Scenario Outline: conta pessoa Fisica
 	 	
   Given que o usuario acesse a url "https://www.original.com.br/"
	 And selecione o botao abrir nova conta 
   And selecionar o botao abrir conta para voce
   When o usuario preencher o formulario 
   And selecionar o botao quero ser cliente 
   Then Valido o texto Falta pouco
   
		@contaneon	
		Scenario Outline: conta pessoa Fisica
		
		Given que o usuario acesse a url "https://www.original.com.br/"
	 	And selecione o botao abrir nova conta 
   	And selecionar o botao abrir conta para voce
   	When preencher o campo nome "<nome>"
   	When preencher o campo telefone "<telefone>"
 	 	When preencher o campo email "<email>"
 		When preencher o campo cpf "<cpf>"
 	 	And selecionar o botao quero ser cliente 
   	Then Valido o texto Falta pouco
   	
   	Examples:
					| nome    |    telefone    |    email                                     |      cpf         |
					| Matheus |    66999332456 |  	thomas_luiz_ribeiro@crbrandao.com.br      |  		34825453244	 |