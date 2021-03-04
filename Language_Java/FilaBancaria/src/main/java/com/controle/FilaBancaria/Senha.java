/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controle.FilaBancaria;

/**
 *
 * @author lucas.flor
 */
public class Senha{ 
    
    private String _tpAtendimento;
    private int _sequenciaAtendimento;
    
    public Senha(){}
    
    // numerico
    public String getTpAtendimento() {
        return _tpAtendimento;
    }

    private void setTpAtendimento(String tipoAtendimento) {
        this._tpAtendimento = tipoAtendimento;
    }
    
    public void updateTpAtendimento(String tipoAtendimento){
        setTpAtendimento(tipoAtendimento);
    }
    
    public int getSequenciaAtendimento() {
        return _sequenciaAtendimento;
    }
    
    private void setSequenciaAtendimento() {
        this._sequenciaAtendimento += 1;
    }

    public void updateSequenciaAtendimento(){
        setSequenciaAtendimento();
    }
    
    public void createSenha(String tipoAtendimento){
        updateTpAtendimento(tipoAtendimento);
        updateSequenciaAtendimento();
    }
    
    public String getSenha(){
        String senhaCompleta = getTpAtendimento() + "-" + getSequenciaAtendimento();
        return senhaCompleta;
    }
}
