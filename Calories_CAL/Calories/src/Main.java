import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main obj = new Main();
        obj.CaloriesDay();

    }
    public void CaloriesDay(){

        int Age;
        double Height;
        double Weight;
        double Result;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Your Age::");
        Age = scanner.nextInt();

        System.out.println("Input Your Height::");
        Height = scanner.nextInt();

        System.out.println("Input Your Weight::");
        Weight = scanner.nextInt();

        Result = (10*Weight) + (6.25*Height) - (5*Age) + 5;


        System.out.println("Calories/Day::" + Result );

    }

}