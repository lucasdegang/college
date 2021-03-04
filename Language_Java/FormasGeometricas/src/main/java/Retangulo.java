/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Retangulo extends Poligono{
    
    protected int _b,_h;
    
    public Retangulo(){
        _b = 0;
        _h = 0;
    }
    
    public Retangulo(int b, int h){
        _b = b;
        _h = h;
    }
    
    private void SetValoresRetangulo(int b, int h){
        _b = b;
        _h = h;
    }
    
    public void UpdateRetangulo(int base, int altura, int lados){
        SetValoresRetangulo(base, altura);
        UpdateQtdLadosPoligono(lados);
    }
    
    @Override
    public void CalculaArea(){
        double area;
        
        area = (this._b * this._h);
        
        System.out.println("A área do retangulo é: " + area);
    }
    
    public boolean ValidaBaseRetangulo(int base){
        if (base == 0 ){
            System.out.println("Atenção! Base nao pode ser zero.");
            return false;
        }
        return true;
    }
    
    public boolean ValidaAlturaRetangulo(int altura){
        if (altura == 0 ){
            System.out.println("Atenção! Altura nao pode ser zero.");
            return false;
        }
        return true;
    }
    
    public String GetStringRetangulo(){
        if (this._b == this._h){
            return "Retangulo (quadrado)";
        }else{
            return "Retangulo";
        }
    }
    
    public void ImprimirDadosRetangulo() {
        System.out.println("A forma do Polígono é: " + GetStringRetangulo());
        System.out.println("A quantidade de lados são: " + super.ImprimirQtdLadosPoligono());
        CalculaArea();
    }
}
