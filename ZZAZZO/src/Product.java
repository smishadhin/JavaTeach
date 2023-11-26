import java.util.Scanner;

public class Product {

    String[] Dress = {"Red Dress", "Blue Dress", "Yellow Dress"};
    String[] Size = {"10", "20", "30"};

    String[] Price = {"9.99", "19.99", "29.99"};

    public void ChooseDress() {

        System.out.println("Select one dress only:: Red Dress::Blue Dress::Yellow Dress");
        Scanner scanner = new Scanner(System.in);
        Dress[0] = scanner.next();

    }

    public void ChooseSize() {
        System.out.println("Select one size only:: Size 10:Size:20:Size:30:Size:40:Size:50");
        Scanner scanner = new Scanner(System.in);
        Size[0] = scanner.next();

    }

    public void ProductPrice() {

        for (int i = 0; i<= Dress.length; i++){

            if (Dress[0] == Price[0]) {
                System.out.println("Price::" + Price[0]);

                if (Dress[1] == Price[1]) {
                    System.out.println("Price::" + Price[1]);

                    if (Dress[2] == Price[2]) {
                        System.out.println("Price::" + Price[2]);
                    } else {
                        System.out.println("Bad Command or Filename");
                    }
                }

            }
        }
    }
}


