import java.text.DecimalFormat;
import java.util.Scanner;

public class Cash {

    double Cash_Atiq;
    double Cash_Rayyan;
    double Cash_Shadhin;


    double Balance_Cash_Atiq;
    double Balance_Cash_Rayyan;
    double Balance_Cash_Shadhin;


    public void ShadhinCash(){
        System.out.println("Enter Shadhin Cash::");
        Scanner scanner = new Scanner(System.in);
        Cash_Shadhin = scanner.nextDouble();
        System.out.println("Shadhin Cash::" + Cash_Shadhin);
    }
    public void RayyanCash(){
        System.out.println("Enter Rayyan Cash::");
        Scanner scanner = new Scanner(System.in);
        Cash_Rayyan = scanner.nextDouble();
        System.out.println("Rayyan Cash::" + Cash_Rayyan);
    }
    public void AtiqCash(){
        System.out.println("Enter Atiq Cash::");
        Scanner scanner = new Scanner(System.in);
        Cash_Atiq = scanner.nextDouble();
        System.out.println("Atiq Cash::" + Cash_Atiq);
    }


    public void Cash_Pickup(){
        Rent rent = new Rent();
        rent.RentFixed();


        Utility utility = new Utility();
        utility.InternetBill_Fixed();
        utility.ElectricityBill();
        utility.WaterBill();
        utility.GasBill();
        utility.TotalUtility();


        Food food = new Food();
        food.AiqFood();
        food.RayyanFood();
        food.ShadhinFood();
        food.Grocery_Total();

        ShadhinCash();
        RayyanCash();
        AtiqCash();

        Balance_Cash_Atiq = Cash_Atiq - ( food.GroceryBill_A +  (utility.UtilityTotal/3) +  (rent.HouseRent/3));
        Balance_Cash_Rayyan = Cash_Rayyan -( food.GroceryBill_R + (utility.UtilityTotal/3) +  (rent.HouseRent/3));
        Balance_Cash_Shadhin = Cash_Shadhin -( food.GroceryBill_S + (utility.UtilityTotal/3) +  (rent.HouseRent/3));


        DecimalFormat df = new DecimalFormat();

        System.out.println("Atiq Balance:: "+ df.format(Balance_Cash_Atiq) );
        System.out.println("Rayyan Balance:: "+Balance_Cash_Rayyan );
        System.out.println("Shadhin Balance:: "+Balance_Cash_Shadhin );
    }
}
