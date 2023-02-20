
/*
Faça um programa que peça para um usuário digitar
um número e que só finaliza quando o usuário digitar 0.
Ao final imprima a soma de todos os números digitados.          */

import java.sql.SQLOutput;
import java.util.Scanner;

public class EstruturaDeRepeticao03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero = -1;
        int soma = 0;

        do{
            System.out.println("Informe um número (zero para sair) ");
            numero = ler.nextInt();

        soma += numero;

        }while(numero != 0);

        System.out.println(" A soma dos números digitados foram:" +soma);

    }


}
