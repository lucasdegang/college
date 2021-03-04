/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Validacoes {

    public int operacaoAritmetica(int operacao) {
        switch (operacao) {
            case 1:
                // code block
                System.out.println("Selecionado Soma");
                return 1;
            case 2:
                // code block
                System.out.println("Selecionado Subtracao");
                return 2;
            case 3:
                // code block
                System.out.println("Selecionado Divisao");
                return 3;
            case 4:
                // code block
                System.out.println("Selecionado Multiplicacao");
                return 4;
            case 5:
                System.out.println("Selecionado Quadrado de um numero");
                return 5;
            default:
                System.out.println("Opcao aritmetica invalida.");
                return 0;
        }
    }
}
