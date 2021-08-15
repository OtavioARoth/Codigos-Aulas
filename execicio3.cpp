#include <stdio.h>
#include <conio.h>
#include <string.h>

int main(void) {
	FILE *arq;
char url[]="matriculas.txt";	
	
	struct dados_usuario {
		char nome[100];
		char matricula[4];
		char curso[100];
	}usuario;
	


	
	struct dados_usuario cadastro[5];
	
	
arq=fopen(url,"w");
		
		if (arq==NULL){
			printf("erro, não foi possivel abrir o arquivo");
		}
		for(int i=0;i<5;i++){
		printf ("Escreva seu nome:\n");
		fflush(stdin);
		gets(cadastro[i].nome);
	fputs(cadastro[i].nome,arq);
		printf ("Escreva sua matricula:\n");
		fflush(stdin);
		gets(cadastro[i].matricula);
	fputs(cadastro[i].matricula,arq);
		printf ("Escreva seu curso:\n");
		fflush(stdin);
		gets(cadastro[i].curso);
		fputs(cadastro[i].curso,arq);
	
	printf("\nCadastro %d:\n", i);
		printf ("Nome: %s \n", cadastro[i].nome,cadastro[i].matricula,cadastro[i].curso);
			
		fclose(arq);
              
	
}
	
	return 0;
}
