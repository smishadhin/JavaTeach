import java.util.Scanner;

public class Customer {

    String Name = "";

    public void CustomerName() {
        System.out.print("Write your name ::" + Name);
        Scanner scanner = new Scanner(System.in);
        Name = scanner.next();
    }
}
