import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Processamento {
    
    Scanner scan = new Scanner(System.in);
    
    public Processamento(){}
    
    public void Principal(){
        int opcao;
        
        System.out.println("------ Poligonos ------");
        
        System.out.println("Selecione uma forma:");
        System.out.println("1 - Triangulo");
        System.out.println("2 - Retangulo");
                
        do{
            opcao = this.scan.nextInt();
            
            switch(opcao){
                case 1:
                    DadosTriangulo();
                    break;
                case 2:
                    DadosRetangulo();
                    break;
                default:
                    System.out.println("Atenção! Opcao invalida.");
                    System.out.println("Selecione uma forma abaixo:");
                    System.out.println("1 - Triangulo");
                    System.out.println("2 - Retangulo");
                    break;
            }
        }while(opcao != 1 && opcao != 2);
    }
    
    public void DadosTriangulo(){
        int base, altura;
        boolean flagBaseTriangulo, flagAlturaTriangulo;
        
        Triangulo tri = new Triangulo();
        
        do{
            System.out.println("Informe a base do triangulo");
            base = this.scan.nextInt();
            
            flagBaseTriangulo = tri.ValidaBaseTriangulo(base);
            
        }while(!flagBaseTriangulo);
        
        do{
            System.out.println("Informe a altura do triangulo");
            altura = this.scan.nextInt();
            
            flagAlturaTriangulo = tri.ValidaAlturaTriangulo(altura);
        }while(!flagAlturaTriangulo);
        
        System.out.println("--------------------------");
        
        tri.UpdateTriangulo(base, altura, 3);
        tri.ImprimirDadosTriangulo();
    }
    
    public void DadosRetangulo(){
        int base, altura;
        boolean flagBaseRetangulo, flagAlturaRetangulo;
        
        Retangulo ret = new Retangulo();
        
        do{
            System.out.println("Informe a base do retangulo");
            base = this.scan.nextInt();
            
            flagBaseRetangulo = ret.ValidaBaseRetangulo(base);
            
        }while(!flagBaseRetangulo);
        
        do{
            System.out.println("Informe a altura do retangulo");
            altura = this.scan.nextInt();
            
            flagAlturaRetangulo = ret.ValidaAlturaRetangulo(altura);
        }while(!flagAlturaRetangulo);
        
        System.out.println("--------------------------");
        
        ret.UpdateRetangulo(base, altura, 4);
        ret.ImprimirDadosRetangulo();
    }
}
