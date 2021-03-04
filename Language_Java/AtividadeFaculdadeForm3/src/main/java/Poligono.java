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
      protected int quantidadeDeLados;
  
      public Poligono(int quantidadeDeLados) {
          if (quantidadeDeLados < 3) {
              System.out.println("Quantidade de lados inválido");
          }
          this.quantidadeDeLados = quantidadeDeLados;
      }
      public int getQuantidadeDeLados() {
          return quantidadeDeLados;
      }
  
      public abstract void imprimirQuantidadeLados() {
          System. out.println("Quantidade de lados: " + quantidadeDeLados);
      }
  
      public abstract double calcularArea();
 }
