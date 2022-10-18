## Desconto-SpringBoot

Codificação em Java usando framework SpringBoot para desenvolvimento de aplicação de calcula Porcetagem de Desconto 5%, 7% e 10% na Compra de Produtos alterando apenas
clienteId: 1, 2 ou 3. Uso de JPA e H2 para armazenamento
de informações em mémoria. A aplicação já está conteinerizada com uso de Docker e rodando uma imagem do Jdk:11 para iniciar usei apenas o comando:

##
docker-compose up

Para consulta do Endpoint use Postman com as seguintes informações Json:
http://localhost:8081/api/v2/verDesconto para requisição das informações use o verbo Post.

	{
	    "clienteId": 1,
	    "items" : [
	        {
	            "nome": "smartphone",
	            "tipo": "celular",
	            "preco": 10000.00,
	            "quantidade": 1
	        }
	    ]
	}

