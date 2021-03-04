/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Triangulo extends Poligono{
    
    protected int _b,_h;
    
    public Triangulo(){
        _b = 0;
        _h = 0;
    }

    public Triangulo(int b, int h){
        _b = b;
        _h = h;
    }
    
    private void SetValoresTriangulo(int b, int h){
        _b = b;
        _h = h;
    }
    
    public void UpdateTriangulo(int base, int altura, int lados){
        SetValoresTriangulo(base, altura);
        UpdateQtdLadosPoligono(lados);
    }
    
    @Override
    public void CalculaArea(){
        double area;
        
        area = (this._b * this._h) / 2;
        
        System.out.println("A área do triangulo é: " + area);
    }
    
    public boolean ValidaBaseTriangulo(int base){
        if (base == 0 ){
            System.out.println("Atenção! Base nao pode ser zero.");
            return false;
        }
        return true;
    }
    
    public boolean ValidaAlturaTriangulo(int altura){
        if (altura == 0 ){
            System.out.println("Atenção! Altura nao pode ser zero.");
            return false;
        }
        return true;
    }
    
    public String GetStringTriangulo(){
        return "Triangulo";
    }

    public void ImprimirDadosTriangulo() {
        System.out.println("A forma do Polígono é: " + GetStringTriangulo());
        System.out.println("A quantidade de lados são: " + super.ImprimirQtdLadosPoligono());
        CalculaArea();
    }
}
