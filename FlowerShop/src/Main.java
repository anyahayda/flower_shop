import data.Storage;
import data.flower.Chamomile;
import data.flower.Rose;
import data.flower.Tulip;
import data.set.Basket;
import data.set.Bouquet;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rose rose = Rose.getRandomRose();
        System.out.println(rose);

        Chamomile chamomile = Chamomile.getRandomChamolite();
        System.out.println(chamomile);

        Tulip tulip = Tulip.getRandomTulip();
        System.out.println(tulip);

        System.out.println("Do you want formed bouquet or not? (yes, no)");
        Scanner scanner = new Scanner(System.in);
        String say = scanner.nextLine();
        if (say.equals("yes")) {
            Bouquet bouquet = Bouquet.getRandomBouquet();
            System.out.println(bouquet);
        } else {
            System.out.println("Enter amount of flowers: ");
            int amount = scanner.nextInt();
            System.out.println("0 - Rose\n" + "1 - Chamomile\n" + "2 - Tulip");
            System.out.println("Enter the type of flowers: ");
            int type = scanner.nextInt();
            if (type == 0) {
                Basket basket = Basket.getBasket(amount, 0);
                System.out.println(basket);
            } else if (type == 1) {
                Basket basket = Basket.getBasket(amount, 1);
                System.out.println(basket);
            } else if (type == 2) {
                Basket basket = Basket.getBasket(amount, 2);
                System.out.println(basket);
            } else
                System.out.println("Please, enter right type of flower (0, 1 or 2)");


        }
    }
}
