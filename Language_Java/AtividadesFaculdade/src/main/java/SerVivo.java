/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class SerVivo {
    private int _Grupo = 0;
    private double _Peso = 0;
    private boolean _Extinto = false;
    

    //construtores
     public SerVivo(){
        _Grupo = 0;
        _Peso = 0;
        _Extinto = false;
    }
    
    public SerVivo(int grupo,double peso, boolean extinto){
        _Grupo = grupo;
        _Peso = peso;
        _Extinto = extinto;
    }
    
    public char GetDescGrupo(int grupo){
        switch(grupo){
            case 1:
                // mamifero
                return 'M';
            case 2:
                // ave
                return 'A';
            default:
                return ' ';
        }
            
    }
}
