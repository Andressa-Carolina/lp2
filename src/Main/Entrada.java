/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author andre
 */
class Entrada {
    Scanner teclado = new Scanner(System.in);

    public double lerNumeroDouble(String mensagem) {
        System.out.print(mensagem + "=>");
        while (true) {
            try {
                double valor = teclado.nextDouble();
                return valor;
            } catch (Exception e) {
                System.out.println("Digite um double");
                teclado = new Scanner(System.in);
            }
        }
    }

    public int lerNumeroInt(String mensagem) {
        System.out.print(mensagem + "=>");
        while (true) {
            try {
                int valor = teclado.nextInt();
                return valor;
            } catch (Exception e) {
                System.out.println("Digite um número inteiro");
                teclado = new Scanner(System.in);
            }
        }
    }

    public String lerString(String mensagem) {
        System.out.print(mensagem + "=>");

        String valor = teclado.nextLine();

        return valor;

    }
    
}
