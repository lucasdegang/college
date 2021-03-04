/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Mensagem {

    void getOpcoesMsg() {
        System.out.println("Digite a opcao de calculo");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Divisao");
        System.out.println("4 - Multiplicacao");
        System.out.println("5 - Quadrado de um numero");
    }

    void getDisplayNumMsg(int x) {
        if(x == 0){
            System.out.println("Informe o numero a:");
        }else{
            System.out.println("Informe o numero b:");
        }
    }
    
}
