@tag
Feature: Cadastrar um novo usuario na conta existente da Netflix
  Eu quero cadastrar um novo usuario na minha conta da Netflix 

  @tag1
  Scenario Outline: Cadastro de novo usuario na conta
  
    Given que estou na pagina da Netflix 
    When eu realizo o login <login> <senha>
    And eu clico na foto de perfil
    And clico na opção gerenciar perfis 
    And clico na opção adicionar perfil
    And preencho o nome e clico no botão continuar 
    Then eu valido que um novo perfil foi criado
    And eu fecho o driver
    

	Examples:
	
	| login      											| senha                 |
	|"samara_cardoso_a@yahoo.com.br"	| "123456"							|	

  

    
      