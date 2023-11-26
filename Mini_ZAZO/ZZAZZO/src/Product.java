import java.util.Scanner;

public class Product extends Payments {

    String[] Dress = {"Red Dress", "Blue Dress", "Yellow Dress"};
    String[] Size = {"10", "20", "30"};

    public void ChooseDress() {

        System.out.println("Select one dress only:: Red Dress::Blue Dress::Yellow Dress");
        Scanner scanner = new Scanner(System.in);
        Dress[0] = scanner.next();

        for (int i = 0; i <= Dress.length; i++) {

            for (int j = 0; j <= Size.length; j++) {

            }

        }

        if (Dress[0] == Size[0] || Dress[0] == Size[1] || Dress[0] == Size[2]) {
            Price = RedDress;
        }

        if (Dress[1] == Size[0] || Dress[1] == Size[1] || Dress[1] == Size[2]) {
            Price = BlueDress;
        }

        if (Dress[2] == Size[0] || Dress[2] == Size[1] || Dress[2] == Size[2]) {
            Price = YellowDress;
        }
    }

    public void ChooseSize() {
        System.out.println("Select one size only:: Size 10:Size:20:Size:30:Size:40:Size:50");
        Scanner scanner = new Scanner(System.in);
        Size[0] = scanner.next();

    }


}


