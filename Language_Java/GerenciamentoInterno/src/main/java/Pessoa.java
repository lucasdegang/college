/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public abstract class Pessoa {
    protected String _nome;
    protected String _documento;
    protected int _cargo;
    
    public Pessoa(){
        _nome = "";
        _documento = "";
        _cargo = 0;
    }
    
    public Pessoa(String nome, String documento, int cargo){
        _nome = nome;
        _documento = documento;
        _cargo = cargo;
    }
    
    public void exibeDados(){
        
        System.out.println("Nome: " + _nome);
        System.out.println("Documento: " + _documento);
        System.out.println("Cargo: " + getCargo(_cargo));
    }
    
    public String getCargo(int cargo){
        String descCargo;
        
        switch(cargo){
            case 1:
                descCargo = "Presidente";
                break;
            case 2:
                descCargo = "Secretaria";
                break;
            case 3:
                descCargo = "Vendedor";
                break;
            case 4:
                descCargo = "Usuário";
                break;
            default:
                descCargo = "Cargo invalido";
        }      
        
        return descCargo;
    }
    
    public String getNome(){
        var nome = this._nome;
        return nome;
    }
}
