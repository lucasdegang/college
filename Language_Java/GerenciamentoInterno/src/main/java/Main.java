
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas.flor
 */
public class Main {
    public static void main(String args[]){
        System.out.println("Inicio Processo");
        
        ArrayList<Presidente> lstPresidente = new ArrayList();
        Presidente ObjPresidente = new Presidente();
        
        ArrayList<Secretaria> lstSecretaria = new ArrayList<Secretaria>();
        Secretaria ObjSecretaria = new Secretaria();
        
        ArrayList<Vendedor> lstVendedor = new ArrayList<Vendedor>();
        Vendedor ObjVendedor = new Vendedor();
        
        ArrayList<Cliente> lstCliente = new ArrayList<Cliente>();
        Cliente ObjCliente = new Cliente();
        
        lstPresidente.add(new Presidente("Asdrubal Leôncio Correa", "123.456.789.10", 1, 15000, 999));       
        
        lstSecretaria.add(new Secretaria("Fátima", "123.456.789.11", 2, 2500, 1));
        lstSecretaria.add(new Secretaria("Ana", "123.456.789.12", 2, 2500, 2));
        
        lstVendedor.add(new Vendedor("Joao", "123.456.789.13", 3, 1800, 10, 0.15));
        lstVendedor.add(new Vendedor("Vanessa", "123.456.789.14", 3, 1800, 11, 0.23));
        lstVendedor.add(new Vendedor("Carlos", "123.456.789.15", 3, 1800, 12, 0.17));
        
        lstCliente.add(new Cliente("Marcos", "123.456.789.16", 4, "Markinho.K", "123456"));
        lstCliente.add(new Cliente("Joana", "123.456.789.17", 4, "Joana.J", "teste"));
        lstCliente.add(new Cliente("Elisa", "123.456.789.18", 4, "Elisa.E", "segredo"));
        lstCliente.add(new Cliente("Lucas", "123.456.789.19", 4, "Lucas.L", "123456"));
        
        // valor de comissao passado na instancia de vendedores, valor definido como percentil sobre o salario
        
        ObjPresidente = lstPresidente.get(0);
        System.out.println("Salario anual do(a) Presidente(a) " + ObjPresidente.getNome()+ " é R$ " + ObjPresidente.calculaSalarioAnual());
        
        ObjSecretaria = lstSecretaria.get(1);
        System.out.println("Salario anual do(a) secretario(a) " + ObjSecretaria.getNome()+ " é R$ " + ObjSecretaria.calculaSalarioAnual());
        
        ObjCliente = lstCliente.get(3);
        ObjCliente.verificarSenha("teste");
        
        System.out.println("---------------------------------------");
        System.out.println("Descarga metodo ExibeDados - Presidente");
        
        for (int i = 0; i < lstPresidente.size(); i++){
            ObjPresidente = lstPresidente.get(i);
            ObjPresidente.exibeDados();
        }

        System.out.println("---------------------------------------");
        System.out.println("Descarga metodo ExibeDados - Secretaria");
        
        for (int i = 0; i < lstSecretaria.size(); i++){
            ObjSecretaria = lstSecretaria.get(i);
            ObjSecretaria.exibeDados();
        }
        
        System.out.println("---------------------------------------");
        System.out.println("Descarga metodo ExibeDados - Vendedor");
        
        for (int i = 0; i < lstVendedor.size(); i++){
            ObjVendedor = lstVendedor.get(i);
            ObjVendedor.exibeDados();
        }
        
        System.out.println("---------------------------------------");
        System.out.println("Descarga metodo ExibeDados - Cliente");
        
        for (int i = 0; i < lstCliente.size(); i++){
            ObjCliente = lstCliente.get(i);
            ObjCliente.exibeDados();
        }
        
        System.out.println("-------FIM PROCESSO-------");
    }
}
