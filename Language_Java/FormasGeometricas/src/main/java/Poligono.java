/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public abstract class Poligono {
    protected int _qtdLados;

    public Poligono() {
        _qtdLados = 0;
    }
    
    public Poligono(int qtdLados) {
        _qtdLados = qtdLados;
    }
    
    private void SetQtdLadosPoligono(int ladosDoPoligono){
        this._qtdLados = ladosDoPoligono;
    }
    
    public void UpdateQtdLadosPoligono(int ladosDoPoligono){
        SetQtdLadosPoligono(ladosDoPoligono);
    }
    
    public int ImprimirQtdLadosPoligono(){
        int qtdLados = this._qtdLados;

        return qtdLados;
    }
    
    // cada subclass deve conter um metodo CalculaArea. Garante que cada classe
    // deve ter esse metodo, de acordo com o comportamento de cada uma usando o @override
    public abstract void CalculaArea();
}
