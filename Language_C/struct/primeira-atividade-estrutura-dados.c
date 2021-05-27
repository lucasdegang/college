#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

// a diferenca da fila e pilha sera o comportamento do topo 
    // ex. fila FIFO: inicio -> dado -> prox -> dado -> prox -> dado -> prox -> null(topo)
        // so permite inserir ao final e remocao ao inicio 
    // ex. pilha: dado(topo) -> prox -> dado -> prox -> dado -> prox -> null

//------------------- Estrutura fila inicio -------------------

// structs são como se fossem registros
// elementos das listas são denominados nos 
// cada no guarda um dado 
typedef struct NO{
    // armazenamento de dado
    int dado;

    // ponteiro de referencia em memoria para o proximo no da lista
    struct NO* prox;

    // malloc() "cria uma estrutura de no", sizeof(), free()
}NO; // esse no eh o identificador da chamada da struct por conta do typedef

typedef struct FILA{
    struct NO* inicio; // ponteiro inicio da fila
    struct NO* fim; // ponteiro fim da fila
} FILA;

FILA *f;

//------------------- Estrutura fila fim -------------------

void enfileira(int valor){
    // ptr = ponteiro

    struct NO* ptr = (NO *) malloc(sizeof(NO));
    ptr->dado = valor;
    ptr->prox = NULL;

    // f = a fila criada
    if(f->inicio == NULL)
        f->inicio = ptr;
    else
        f->fim->prox = ptr;
    f->fim = ptr;
    printf("enfileira [ Valor de [ptr->dado] = %d ] \n", ptr->dado); //aki
}

// identico ao processo de desempilha
int desenfileira(){
    struct NO* ptr = f->inicio;
    int dado; // bk do elemento a ser excluido
    if(ptr != NULL){
        f->inicio = ptr->prox;
        ptr->prox = NULL;
        dado = ptr->dado;
        printf("desenfileira [ Valor de [ptr->dado] = %d ] \n", ptr->dado); //aki
        free(ptr);
        return dado;
    }
}

void imprimir (int etapa, struct NO* ptr){
    bool ctrl = false;

    //system("cls");
    printf("------- IMPRIMIR %d -------\n", etapa);
    
    while(ptr != NULL)
    {
        if (ctrl)
        {
            printf(", ");
        }
        else{
            ctrl = true;
        }
        
        printf( "%d", ptr->dado);
        ptr = ptr->prox;        
    }    

    if (!ctrl)
    {
        printf("Struct vazia");
    }

    // quebra quando tem e quando nao tem ocorrencias na struct. 
    // corrige layout das mensagens no terminal
    printf("\n-------\n");
}

int main(){
    
    f = (FILA *) malloc(sizeof(FILA));
    
    // ponteiro inicial da lista "inicio"
    // para struct ponteiro "NO*" a atribuicao de valor se da por "->"
        // ex.: ptr->dado, significa que teremos o valor da ocorrencia ponteiro sobre o valor dado
    // se fosse uma struct normal a sintaxe seria ptr.dado = algumaCoisa
    f->inicio = NULL;
    f->fim = NULL;

    system("cls");

    // vazia
    imprimir(0, f->inicio);

    enfileira(10);
    imprimir(1, f->inicio);
    // 10
    enfileira(30);
    imprimir(2, f->inicio);
    // 10, 30
    enfileira(50);
    imprimir(3, f->inicio);
    // 10, 30, 50
    desenfileira();
    imprimir(4, f->inicio);
    // 30, 50
    enfileira(14);
    imprimir(5, f->inicio);
    // 30, 50, 14
    
   imprimir(6, f->inicio);
}