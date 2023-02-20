/*
*exemplo de programa em Java que solicita ao usuário que digite
*um número e só finaliza quando o usuário digitar 0:
* Exercicio

* */


import java.util.Scanner;

public class EstruturaDeRepeticao01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;

        do{
            System.out.println("Informe um número:");
            numero = ler.nextInt();
        }while ( numero != 0);

        System.out.println("Program interrompido!!");

            ler.close();


    }


}
