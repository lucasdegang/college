
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public abstract class Funcionario extends Pessoa {
    protected double _salario;
    protected int _ramal;
    
    public DecimalFormat mask = new DecimalFormat("###,###.00");
    
    public Funcionario(){
        super();
        this._salario = 0;
        this._ramal = 0;
    }
    
    public Funcionario(String nome, String documento, int cargo, double salario, int ramal){
        super(nome, documento, cargo);
        this._salario = salario;
        this._ramal = ramal;
    }
    
    public String calculaSalarioAnual(){
                
        double salarioAnual = 0;
        
        double salario = getSalario();
        
        salarioAnual = salario * 13;
        
        return mask.format(salarioAnual);
    }
    
    public double getSalario(){
        return this._salario;
    }
}