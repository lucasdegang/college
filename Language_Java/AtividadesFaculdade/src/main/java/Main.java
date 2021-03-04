/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Main {
    private static int contX = 0;
    
    public static void main(String args[]){
        /*
        int x = 0;
        
        for(int i = 0; i < 10; i++){
            if(i == 9) break;
            System.out.println("ocor" + i);
            x = i;
        }
        System.out.println(x + " ");
        */
        
        System.out.println("-----------------------");
        Fungo fg = new Fungo();
        var descGrupo = fg.GetDescGrupo(2);
        System.out.println("Grupo: " + descGrupo);
        
        // atividade 07
        System.out.println("---atividade 7---------");
        AcessoRestrito ar = new AcessoRestrito();
        
        ar.acessar(true, true, true, true);
        ar.acessar(true, false, true, false);
        ar.acessar(false, true, true, false);
        ar.acessar(false, true, false, true);
        ar.acessar(false, false, false, false);
        
        // atividade 08
        System.out.println("---atividade 8---------");
        CaixaEletronico caixa = new CaixaEletronico();
        caixa.depositar((double) 150);
        caixa.depositar((double) 250);
        caixa.sacar((double) 300);
        caixa.sacar((double) 300);
        
        // atividade 10
        System.out.println("---atividade 10--------");
        
        boolean condicao = true;
        int contador = 1;
        while(condicao){
            if(contador > 4){
                break;
            }
            System.out.println("while: " + contador);
            contador = contador + 1;
        }
        
        contador = 1;
        
        do{
            if(contador > 4){
                break;
            }
            System.out.println("dowhile: " + contador);
            contador = contador + 1;
        }while(condicao);
    }
    
}
