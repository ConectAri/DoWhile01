import java.util.Scanner;

public class EstruturaDeRepeticao04 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.println("Informe um número (zero para parar)");
            numero = ler.nextInt();
            soma += numero;
        }while(numero  !=0);
        System.out.println(" A soma dos números é: " + soma);
        }
        }



