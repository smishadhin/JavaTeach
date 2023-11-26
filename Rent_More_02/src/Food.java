import java.util.Scanner;

public class Food extends Cash {

    double GroceryBill_A;
    double GroceryBill_R;
    double GroceryBill_S;


    public void AiqFood(){
        System.out.println("Enter Atiq Food::");
        Scanner scanner = new Scanner(System.in);
        GroceryBill_A = scanner.nextDouble();
        System.out.println("AiqFood::" + GroceryBill_A);
    }
    public void RayyanFood(){
        System.out.println("Enter Rayyan Food::");
        Scanner scanner = new Scanner(System.in);
        GroceryBill_R = scanner.nextDouble();
        System.out.println("RayyanFood::" + GroceryBill_R);
    }
    public void ShadhinFood(){
        System.out.println("Enter Shadhin Food::");
        Scanner scanner = new Scanner(System.in);
        GroceryBill_S = scanner.nextDouble();
        System.out.println("ShadhinFood::" + GroceryBill_S);
    }
    public void Grocery_Total(){
        double FoodTotal = GroceryBill_A + GroceryBill_R + GroceryBill_S;
        System.out.println("Grocery_Total: " + FoodTotal );
    }

}
