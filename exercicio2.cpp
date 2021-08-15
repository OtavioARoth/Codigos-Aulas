#include <stdio.h>
#include <conio.h>
#include <string.h>

int main(void) {
	
	struct dados_usuario {
		char nome[100];
		char idade[3];
		char endereco[100];
	};
		
	struct dados_usuario lista[5];
	
	for(int i=0;i<5;i++){
	
		strcpy(lista[i].nome, "Otavio");
		strcpy(lista[i].endereco, "almeida garret ");
		strcpy(lista[i].idade, "29");
		
		printf("\nCadastro %d:\n", i);
		printf("Nome: %s \t endereço:%s \t idade:%s", lista[i].nome, lista[i].endereco,lista[i].idade);
	
	}
	
	
	
	return 0;
}
