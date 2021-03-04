/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Cliente extends Pessoa{
    private String Usuario;
    private String Senha;
    private String SenhaTemp;
    
    public Cliente(){
        super();
        Usuario = "";
        Senha = "";
    }
    
    public Cliente(String usuario, String senha){
        super();
        Usuario = usuario;
        Senha = senha;
    }
    
    public Cliente(String nome, String documento, int cargo, String usuario, String senha){
        super(nome, documento, cargo);
        Usuario = usuario;
        Senha = senha;
    }
    
    public boolean verificarSenha(String s){
        setSenhaTemp(s);        
        
        if (Senha.equals(SenhaTemp)){
            System.out.println("Senha valida");
            return true;
        }else{
            System.out.println("Senha do usuario " + super.getNome() + " nao valida");
            System.out.println("Senha do usuario " + super.getNome() + " cadastrada é : " + getSenha());
            return false;
        }
    }
    
    private String getSenha(){
        String senhaSalva = Senha;
        return senhaSalva;
    }
    
    public void setSenhaTemp(String s){
        SenhaTemp = s;
    }
}
