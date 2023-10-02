import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        System.out.println("Enter the card limit: ");
        double limit = reading.nextDouble();
        CreditCard card = new CreditCard(limit);

        int leave = 1;
        while (leave != 0) {
            System.out.println("Enter the purchase description: ");
            String description = reading.next();

            System.out.println("Enter the purchase amount: ");
            double value = reading.nextDouble();

            Shopping shopping = new Shopping(description, value);
            boolean purchaseMade = card.purchaseLaunch(shopping);

            if (purchaseMade) {
                System.out.println("Purchase Made!");
                System.out.println("Enter 0 to exit, or 1 to continue: ");
                leave = reading.nextInt();
            } else {
                System.out.println("Insufficient Funds!");
                leave = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("PURCHASE MADE:\n");
        Collections.sort(card.getShopping());
        for (Shopping c : card.getShopping()) {
            System.out.println(c.getDescription() + " - " + c.getValue());
        }
        System.out.println("\n***********************");

        System.out.println("\nCard Balance: " + card.getBalance());
    }
}

