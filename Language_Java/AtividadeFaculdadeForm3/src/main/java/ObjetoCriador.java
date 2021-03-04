/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class ObjetoCriador {
    private static int contador = 0;
    
    public ObjetoCriador(int n){
        contador++;
        
        for(int i = 0; i < n; i++){
            new ObjetoCriador(n-1);
        }
    }
    
    public static void main(String[] args){
        new ObjetoCriador((3));
        System.out.println("Resultado: " + contador);
    }
}
