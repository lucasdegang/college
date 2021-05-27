#include <stdio.h>

int main()
{
    int vetorEntrada[8], vetorSaida[8], aux;
    
    for(int i = 0; i < 8; i++){
        printf("\n");
        printf("Insira um valor e aperte enter: ");
        scanf("%d", &vetorEntrada[i]);
    }

    for(int i = 0; i < 8; i++){
        vetorSaida[i] = vetorEntrada[i];
    }

    for(int x = 0;  x < 8; x++){
        for(int y = x; y < 8; y++){
            if(vetorSaida[x] < vetorSaida[y]){
                aux = vetorSaida[x];
                vetorSaida[x] = vetorSaida[y];
                vetorSaida[y] = aux;
            }
        }
    }
    
    printf("\n\n");

    printf("Valores digitados\n"); 

    for (int numEntrada = 0; numEntrada < 8; numEntrada++){
        printf(" %d", vetorEntrada[numEntrada]);
    }

    printf("\nValores decrescentes\n");

    for (int numSaida = 0; numSaida < 8; numSaida++){
        printf(" %d", vetorSaida[numSaida]);
    }

    printf("\n\n");
}