/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
  public class Retangulo extends Poligono {
      private int base;
      private int altura;
  
      public Retangulo(int base, int altura) {
          super(4);
          this.base = base;
          this.altura = altura;
      }
      public double calcularArea() {
          return base * altura;
      }
  }
