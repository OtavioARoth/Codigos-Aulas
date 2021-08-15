#include <stdio.h>
#include <stdlib.h>
#include<string.h>
int main (void){
char nomes [5][10];
FILE *arq;	
arq=fopen("nomes.txt","r");
fscanf(arq,"%s%s%s%s%s",nomes[0],nomes[1],nomes[2],nomes[3],nomes[4]);
printf ("primeira linha: %s \n",nomes[0]);
printf ("segunda linha: %s \n",nomes[1]);
printf ("terceira linha: %s \n",nomes[2]);
printf ("quarta linha: %s \n",nomes[3]);
printf ("quinta linha: %s \n",nomes[4]);

	fclose(arq);
	return 0;
	}
	
