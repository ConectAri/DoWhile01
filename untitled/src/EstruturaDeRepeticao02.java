import java.util.Scanner;

public class EstruturaDeRepeticao02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero = 1;

        while(numero !=0){
            System.out.println("Informe um número(para sair escolha o 0):");
            numero = ler.nextInt();
        }
        System.out.println("Programa encerrado!!");

    }

}
