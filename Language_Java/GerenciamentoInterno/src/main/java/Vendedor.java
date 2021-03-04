/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Vendedor extends Funcionario{
    private double percentilComissao;
    
    public Vendedor(){
        super();
        percentilComissao = 0;
    }
    
    public Vendedor(double comissao){
        super();
        percentilComissao = comissao;
    }
    
    public Vendedor(String nome, String documento, int cargo, double salario, int ramal, double comissao){
        super(nome, documento, cargo, salario, ramal);
        percentilComissao = comissao;
    }
    
    public double salarioMescomComissao(){
        double calcComissao = 0;
        
        var salario = super.getSalario();
        
        calcComissao = salario + (salario * percentilComissao);
        
        return calcComissao;
    }
}
