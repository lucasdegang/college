
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Processamento {
    public void mainProcesso() {
        Scanner read = new Scanner(System.in);
        
        double num1, num2, total;
        int operacao, keepUser;
                
        do {            
            Mensagem msg = new Mensagem();
            msg.getOpcoesMsg();
            operacao = read.nextInt();
        
            Aritmetica mat = new Aritmetica();
            char operacaoSel = mat.validaOperacao(operacao);
        
            if (operacaoSel != ' '){
                msg.getDisplayNumMsg(0);
                num1 = read.nextDouble();

                // quadrado de um numero
                if(operacaoSel == '^'){
                    num2 = num1;
                }else{
                    msg.getDisplayNumMsg(1);
                    num2 = read.nextDouble();

                    // controle divisor zero - apontar erro
                    if(operacaoSel == '/'){
                        mat.validaDivisorZero(num2);                   
                    }                
                }

                double resultado = mat.calculo(operacaoSel, num1, num2);
                System.out.println("Resultado: " + resultado);
            }
            
            System.out.println("--------------");
            System.out.println("Deseja continuar? 0-Nao, 1-Sim");
            keepUser = read.nextInt();
            System.out.println("--------------");
        } while (keepUser != 0);
    }
}
