/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Cachorro {
    private String nome;
    public  Cachorro(String nome){
        this.nome = nome;
    }
    
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("bilu");
        System.out.println(meuCachorro);
    }     
}
