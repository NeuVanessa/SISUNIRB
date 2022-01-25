/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fita;

/**
 *
 * @author Neu_Junior
 */
public class MinMax {

    public static void main(String[] args) {

        int n1;
        int n2; // faltou o ; aqui
        int n3;

        n1 = 3;
        System.out.print("Entre com o primeiro inteiro: " + n1);
        n2 = 5; // saida de dados incorreto, deve ser numero inteiro
        System.out.print("Entre com o segundo inteiro: " + n2);

        n3 = 6;
        System.out.print("Entre com o terceiro inteiro: " + n3); // faltou o ""
        //nesse primeiro if faltou o ()
        if (n1 > n2) {
            System.out.println("O menor numero eh: " + n2);
        } else {
            System.out.println("O menor numero eh:" + n3);
        }
        if (n1 < n2) {
            System.out.println("O menor numero eh: " + n1);
            System.out.println("Tudo ok ");
        } //o sout estava fora do if passei ele para dentro do n1 < n2
        else {
            System.out.println("O menor numero eh:" + n2);
            System.out.println("tudo errado ");
        }
        if (n1 < n3) {
            System.out.println("O menor numero eh: " + n1);

            //faltou p }
        } else {
            System.out.println("O menor numero eh: " + n3);
        }
    }
}
