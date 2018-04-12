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
class Saida {
    public void imprimirQuantidadenoestoque(int[] qtd){
        System.out.println("Quanto falta para o estoque maximo de cada ingrediente, na ordem digitada ->");
        for(int cont = 0; cont<qtd.length; cont++){
            if(qtd[cont]==0){
                System.out.println("aumentar estoque");
            }
            else{
                System.out.println(10-qtd[cont]);
            }
        }
        
    }
    
}
