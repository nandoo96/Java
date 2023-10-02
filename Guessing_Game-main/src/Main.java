import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretNumber = new Random().nextInt(100);//gera um número aleatório de 0 até 100;
        Scanner inputUser = new Scanner(System.in);
        int attempts = 0;

        //System.out.println(secretNumber);

        while (attempts < 5) {
            System.out.println("Digite um número entre 0 e 100: ");
            int numberEntered = inputUser.nextInt();
            attempts++;

            if (numberEntered == secretNumber) {
                System.out.println("Parabéns! Você acertou o número secreto!!");
                break; //interrompe o loop while
            } else if (numberEntered < secretNumber) {
                System.out.println("O número digitado é menor que o número secreto!!");
            } else {
                System.out.println("O número digitado é maior que o número secreto!!");
            }

            if (attempts == 5) {
                System.out.println("Você não conseguiu adivinhar o número! O número secreto é = " + secretNumber);
            }

        }
    }
}