#include <stdio.h>
#include <string>
int main () {
		setlocale(LC_ALL, "Portuguese");
	    int assentos[30];
    char nomes[60][10];
    int ocupados[10][3] = {0};
    int contadorAssentos = 0;
    char escolha;
        do 
	{ 	printf("\nDigite seu nome: ");
        	scanf("%s", &nomes[contadorAssentos]);
        printf("\nDigite o numero do assento desejado: ");
        	scanf("%d", &assentos[contadorAssentos]);
        printf("\nNome do passageiro: %s", nomes[contadorAssentos]);
        printf("\nAssento escolhido: %d", assentos[contadorAssentos]);
        
		int fileira = (assentos[contadorAssentos] - 1)/3;
        int assento = assentos[contadorAssentos] - 1 - fileira*3;
        	
			if (ocupados[fileira][assento]) 
				printf("\n O assento já está ocupado, selecione outro");
        		ocupados[fileira][assento] = 1;
        		     	if (contadorAssentos++ == 30) 
			break;
        		printf("\nDeseja continuar? S/N\n");
        			scanf("%c", &escolha);
    } 
		while (escolha=='S' || escolha=='s');
    		printf("\n");
    	    	for (int i=0;i<10;i++) {
        	for (int j=0;j<3;j++) 
				printf("F%02dA%d =%s| ", i+1, j+1, ocupados[i][j] ? "Ocupado" : " Livre ");
        printf("\n");
    }
}
