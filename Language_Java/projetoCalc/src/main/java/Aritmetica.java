/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Aritmetica {
     public char validaOperacao(int operacao) {
        switch (operacao) {
            case 1:
                // code block
                System.out.println("Selecionado Soma");
                return '+';
            case 2:
                // code block
                System.out.println("Selecionado Subtracao");
                return '-';
            case 3:
                // code block
                System.out.println("Selecionado Divisao");
                return '/';
            case 4:
                // code block
                System.out.println("Selecionado Multiplicacao");
                return '*';
            case 5:
                System.out.println("Selecionado Quadrado de um numero");
                return '^';
            default:
                System.out.println("Opcao aritmetica invalida.");
                System.out.println("Selecione uma opcao entre 1 e 5.");
                return ' ';
        }
    }   
    
    public boolean validaDivisorZero(double y) {
        if(y == 0){
            System.out.println("Divisor nao pode ser zero.");
            return false;
        }
        return true;
    }
     
    public double calculo(char operacaoSel, double num1, double num2) {
        double resultado = 0;
        
        switch(operacaoSel){
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '/':
                resultado = num1 / num2;
               break;
            case '*':
                resultado = num1 * num2;
                break;
            case '^':
                resultado = num1 * num1;
                break;
        }
        return resultado;       
    }
}