// take a double type arraylist and put 3 numbers inside the arraylist as user input.
// Write a java program to find the largest and smallest of those three numbers.
// Then find if that largest/smallest number is negative or positive.
// Then find if that smallest or largest number is a solid integer or a decimal.
// if that number is decimal the find out the decimal point number count.

//note: use only one arraylist variable numbers to store the numbers from user input..... no other variable can be intruduced ever except method parameter
// use method...... one for user input.....  one for large/small...one for neg pos,,,,one for decimal integer,,,,,one for decimal count
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    ArrayList<Double> numbers = new ArrayList<>();

    public static void main(String[] args) {

        Main obj = new Main();
        obj.inputData();
        obj.SmallOrLarge();
    }

    void inputData() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 numbers: ");

        numbers.add(sc.nextDouble());
        numbers.add(sc.nextDouble());
        numbers.add(sc.nextDouble());

//        System.out.println(numbers.get(0));
//        System.out.println(numbers.get(1));
//        System.out.println(numbers.get(2));


    }


    void SmallOrLarge() {
        if (numbers.get(0) > numbers.get(1) && numbers.get(0) > numbers.get(2)) {
            System.out.println(numbers.get(0) + " is large number.");
            NegOrPos(numbers.get(0));
            IntegerOrDecimal(numbers.get(0));

        } else if (numbers.get(1) > numbers.get(0) && numbers.get(1) > numbers.get(2)) {
            System.out.println(numbers.get(1) + " is large number.");
            NegOrPos(numbers.get(1));
            IntegerOrDecimal(numbers.get(1));

        } else {
            System.out.println(numbers.get(2) + " is large number.");
            NegOrPos(numbers.get(2));
            IntegerOrDecimal(numbers.get(2));

        }

        if (numbers.get(0) < numbers.get(1) && numbers.get(0) < numbers.get(2)) {
            System.out.println(numbers.get(0) + " is smaller number.");
            NegOrPos(numbers.get(0));
            IntegerOrDecimal(numbers.get(0));
            

        } else if (numbers.get(1) < numbers.get(0) && numbers.get(1) < numbers.get(2)) {
            System.out.println(numbers.get(1) + " is smaller number.");
            NegOrPos(numbers.get(1));
            IntegerOrDecimal(numbers.get(1));

        } else {
            System.out.println(numbers.get(2) + " is smaller number.");
            NegOrPos(numbers.get(2));
            IntegerOrDecimal(numbers.get(2));

        }
    }

    void NegOrPos(double np) {

        if (np > 0) {
            System.out.println(np + " is positive number");
        } else {
            System.out.println(np + " is negative number");
        }

    }

    void IntegerOrDecimal(double id) {
        if (id == (int) id) {
            System.out.println(id + " is Integer");
        } else {
            System.out.println(id + " is Decimal");
            DecimalCount(id);
        }
    }

    void DecimalCount (double dc){

        String s = Double.toString(Math.abs(dc));

        int decimalCount = s.length() - s.indexOf('.')-1;
        System.out.println("Decimal Count is: "+decimalCount);


    }
}