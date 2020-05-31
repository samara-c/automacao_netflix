@tag
Feature: Cadastrar um novo usuario na conta existente da Netflix
  Eu quero cadastrar um novo usuario na minha conta da Netflix 

  @tag1
  Scenario Outline: Cadastro de novo usuario na conta #Usar Scenario Outline pra todos os que tem exemplo
  
    Given que estou na pagina da Netflix 
    And eu realizo o login <login> <senha>
    When eu clico na foto de perfil e clico em gerenciar perfis
    And clico na opção adicionar perfil
    And preencho o nome e clico no botão continuar <nome> <crianca>
    Then eu valido que um novo perfil foi criado
    And eu fecho o driver
    

	Examples:
	
	| login      											| senha                 				|	nome						| crianca			|
	|"samaraecs@yahoo.com.br"					| "saMr1a101010101"							|	"Teste"					|	"sim"				|


  

    
      