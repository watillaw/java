import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int vezes = 0;
        int numMaquina = new Random().nextInt(100);
        int numero = 0;

        System.out.println("Vamos brincar de adivinhação?");
        System.out.println("Vou pensar em um número de 0 a 100...");
        System.out.println("Tente adivinhar meu número, voce tera 5 chances...");


        while (vezes < 5) {
            vezes ++;
            System.out.println("Digite um número:");
            numero = leitura.nextInt();

            if (numero > numMaquina){
                System.out.println("O número que você digitou é maior que o número que pensei...");
            } else if (numero < numMaquina) {
                System.out.println("O número que você digitou é menor que o numero que pensei...");
            }else {
                System.out.println("Parabéns você acertou!");
                System.out.println("Número digitado: " + numero);
                System.out.println("Número que pensei: " + numMaquina);
                break;

            }
            if (vezes ==5 ){
                System.out.println("O número que pensei foi: " + numMaquina);
            }


        }

    }
}
