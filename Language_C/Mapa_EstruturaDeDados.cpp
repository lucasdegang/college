#include <stdio.h>
#include <stdlib.h>
#include <string.h>

//Constantes
#define E 0
#define D 1
#define R -1

//Tipo n�
typedef struct NO {
	int dado;
	struct NO *esq;
	struct NO *dir;
	struct NO *pai;
} NO;

//Tipo �rvore
typedef struct ARVORE{
	NO *raiz;
}ARVORE;

//Declara��o da �rvore
ARVORE a;

//Prot�tipos das fun��es
void inicializaArvore(ARVORE arv);
void inicializaNo(NO* n, int val);
void insereNoArvoreOrdenada(int valor);
void preOrdem(NO* raiz);
void emOrdem(NO* raiz);
void posOrdem(NO* raiz);

//Fun��o que sempre deve ser chamada ao se criar uma nova �rvore
void inicializaArvore(ARVORE arv)
{
	arv.raiz = NULL;
}

//Fun��o utilizada para inicializar um novo n� na �rvore
void inicializaNo(NO* n, int val){
	if(!n)
	{
		printf("Falha de alocacao.\n");
		return;
	}
	n->pai = NULL;
	n->esq = NULL;
	n->dir = NULL;
	n->dado = val;
}

//Fun��o que realiza a inser��o de maneira ordenada
//Valores menores  v�o � esquerda
//Valores maiores ou iguais v�o � direita
void insereNoArvoreOrdenada(int valor)
{
	NO* corrente = a.raiz;
	NO* pai;

	NO* novoNo = (NO*) malloc(sizeof(NO));
	inicializaNo(novoNo, valor);
	
	if(corrente == NULL)
	{
		a.raiz = novoNo;
		return;
	}
	
	while(corrente){
		pai = corrente;
		if(novoNo->dado < corrente->dado){
			corrente = corrente->esq;
			if(!corrente){
				pai->esq = novoNo;
				return;
			}
		}
		else{
		 	corrente = corrente->dir;
			if(!corrente){
				pai->dir = novoNo;
				return;
			}
		}
	}
}

//Executa o caminhamento pr�-ordem a partir do n� indicado por "raiz"
void preOrdem(NO* raiz){
	if(raiz){
		printf("%d \t", raiz->dado);
		preOrdem(raiz->esq);
		preOrdem(raiz->dir);
	}
}

//Executa o caminhamento em-ordem a partir do n� indicado por "raiz"
void emOrdem(NO* raiz){
	if(raiz){
		emOrdem(raiz->esq);
		printf("%d \t", raiz->dado);
		emOrdem(raiz->dir);
	}
}

//Executa o caminhamento pos-ordem a partir do n� indicado por "raiz"
void posOrdem(NO* raiz){
	if(raiz){
		posOrdem(raiz->esq);
		posOrdem(raiz->dir);
		printf("%d \t", raiz->dado);
	}
}

int main()
{
	inicializaArvore(a);
	
	// numero RA - Lucas Degang Prudencio Flor
	printf("\ Aluno Lucas Degang Prudencio Flor : RA 19938465 \n");
	
	insereNoArvoreOrdenada(1);
	insereNoArvoreOrdenada(9);
	insereNoArvoreOrdenada(9);
	insereNoArvoreOrdenada(3);
	insereNoArvoreOrdenada(8);
	insereNoArvoreOrdenada(4);
	insereNoArvoreOrdenada(6);
	insereNoArvoreOrdenada(5);
	
	printf("\nBusca em ordem: \n");
	emOrdem(a.raiz);
	
	printf("\n");
	printf("                     \n");
	
	printf("Arvore\n");
	
	// saida da arvore
	printf("         ________ 8________\n");
	printf("        |                  |\n");
	printf("   ____ 3______            9________\n");
	printf("  |            |                    |\n");
	printf("  1        ___ 5____                9\n");
	printf("          |         |                \n");
	printf("          4         6                \n");
}

