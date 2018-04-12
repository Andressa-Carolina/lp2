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
//Joana abriu um restaurante e para não ter problema de falta de ingredientes prefere sempre
//manter a dispensa com 10 itens de cada ingrediente. Faça um programa para controlar o
//estoque de modo que, ele receba do utilizador um vetor com o nome de 3 ingredientes e
//armazene a quantidade máxima para cada um. Em seguida Joana deve inserir em ordem o
//quanto foi gasto dos ingredientes, em ordem, no almoço. Ao final deve exibir na tela quanto é
//necessário comprar de cada ingrediente pra manter os 10 itens de estoque. Se qualquer
//ingrediente estiver zerado, informar na tela 'aumentar estoque'. (Não é necessário informar
//qual ingrediente está zerado)

class Processamento {
     public int[] getEstoque(String[] ingredientes, int[] qtd, int[] utilizados ){
        for(int cont = 0; cont<qtd.length; cont++ ){
            if(qtd[cont]>utilizados[cont]){
                qtd[cont] = qtd[cont]-utilizados[cont];
            }
            else{
                qtd[cont] = 0;
            }
            
        }
    return qtd;
    
}
}
