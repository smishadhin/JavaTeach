import java.util.Scanner;

public class Utility extends Food {
    double WaterBill;
    double GasBill;
    double ElectricityBill;
    protected int InternetBill = 77;
    double UtilityTotal;

    public void WaterBill() {
        System.out.println("Enter Water Bill::");
        Scanner scanner = new Scanner(System.in);
        WaterBill = scanner.nextDouble();
        System.out.println("WaterBill::" + WaterBill);
    }

    public void GasBill() {
        System.out.println("Enter Gas Bill::");
        Scanner scanner = new Scanner(System.in);
        GasBill = scanner.nextDouble();
        System.out.println("GasBill::" + GasBill);
    }

    public void ElectricityBill() {
        System.out.println("Enter Electricity bill::");
        Scanner scanner = new Scanner(System.in);
        ElectricityBill = scanner.nextDouble();
        System.out.println("ElectricityBill::" + ElectricityBill);

    }

    public void InternetBill_Fixed() {

        System.out.println("InternetBill::" + InternetBill);
    }
    public void TotalUtility(){
         UtilityTotal = WaterBill + GasBill + ElectricityBill + InternetBill;
        System.out.println("TotalUtility::"+ UtilityTotal);
    }
}