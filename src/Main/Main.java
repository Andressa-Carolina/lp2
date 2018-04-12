/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author andre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrada entrada = new Entrada();
        String[] ingrediente = new String[3];
        for(int cont = 0; cont<ingrediente.length; cont++){
            ingrediente[cont] = entrada.lerString("Digite o ingrediente: ");
        }
        int[] qtd = new int[3];
        for(int cont = 0; cont<qtd.length; cont++){
            qtd[cont] = 10;
        }
        int[] utilizada = new int[3];
        for(int cont = 0; cont<utilizada.length; cont++){
            utilizada[cont] = entrada.lerNumeroInt("Digite a quantidade utilizada de cada ingrediente: ");
        }
        
        Processamento processamento = new Processamento();
        int[] quantidade = processamento.getEstoque(ingrediente, qtd, utilizada);
                
        Saida saida = new Saida();
        saida.imprimirQuantidadenoestoque(quantidade);
    }
    
}
