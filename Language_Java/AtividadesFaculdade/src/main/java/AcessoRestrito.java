/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class AcessoRestrito {
    public static void acessar(boolean a, boolean b, boolean c, boolean d){
        boolean temAcesso = !(a || d) && c && ((a && (!b || d)) || c);
        
        if(temAcesso){
            System.out.println("Sim");
        }else{
            System.out.println("Nao");
        }
    }
}
