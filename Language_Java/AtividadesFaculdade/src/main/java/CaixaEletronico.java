/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
class CaixaEletronico {
    double dinheiro;
    
    public void depositar(double dinheiro){
        this.dinheiro += dinheiro;
    }
    
    public void sacar(double dinheiro){
        if(dinheiro > this.dinheiro){
            System.out.println("Valor indisponivel na conta.");
        }else{
            this.dinheiro -= dinheiro;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + this.dinheiro);
        }
    }
}
