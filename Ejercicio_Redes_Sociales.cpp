#include <stdio.h>
#include <string.h>
#include <string>
#include <iostream>

int main()
{
	char coma=',';
	char linea[500];
	char palabra[50];
	char redsocial[50];
	FILE* redes;

	fopen_s(&redes,"presenciaredes.csv", "r");
	
	if (redes == NULL)
	{
		return 1;
	}

	fgets(linea, sizeof(linea), redes);

	while (feof(redes) == 0)
	{
		//letras = fgetc(redes);
		//printf("%c", letras);
		fgets(linea, sizeof(linea), redes);
		fgets(palabra,',', redes);
		printf("%s", &linea);

		printf("%s", &palabra);
	}
	fclose(redes);



	for (int x =0; i <sizeof(linea);x++)
	{	
	for (int i = 0; i < palabra; i++) {
		if (palabra[x][i]=="TWITTER") {
			printf("Diferencia de followers (enero - junio) : ");
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
		 


	
}


