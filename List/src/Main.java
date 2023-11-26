import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();
        ArrayList<String> list2 = new ArrayList();

        list.add(0,5);
        list.add(1,2);
        list.add(2,4);
        list.add(3,1);
        list.add(4,6);
        list2.add(0, "Rayyan");
        list2.add(1, "Rony");
        list2.add(2, "Shadhin");

        System.out.println(list.get(1));
        System.out.println(list2.get(1));

        list.remove(1);

        System.out.println(list.get(1));
        System.out.println(list.get(2));

        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        map2.put("Rayyan", 55);
        map2.put("Shadhin", 88);
        map2.put("Rony", 66);
        System.out.println(map2.get("Rayyan"));
        map.put(6,88);
        map.put(9,66);
        map.put(2,55);

        System.out.println(map.get(2));

        System.out.println("///////////////////");
        Scanner sc = new Scanner(System.in);
//
//        int a;
//        double b;
//        String s;
//        System.out.println("enter a text:");
//        s = sc.nextLine();
//        System.out.println(s);
//
//        System.out.println("enter a Integer:");
//        a= sc.nextInt();
//        System.out.println(a);
//
//        System.out.println("enter a Double:");
//        b = sc.nextDouble();
//        System.out.println(b);
//
//        String key;
//        int value;
//        System.out.println("enter a map key:");
//        key = sc.nextLine();
//        System.out.println("enter a " + key +" Value: ");
//        value = sc.nextInt();
//
//        map2.put(key,value);
//
//        System.out.println("value of "+key+"  is:: "+ map2.get(key));

        //// adding 2 number using map

        int num1,num2;
        String key1,key2;
        System.out.println("enter first key");
        key1 = sc.nextLine();
        System.out.println("enter first key value");
        num1 = sc.nextInt();
        System.out.println("enter 2nd key");
        key2 = sc.nextLine();
        System.out.println("enter 2nd key value");
        num2 = sc.nextInt();

        map2.put(key1,num1);
        map2.put(key2,num2);
        //System.out.println(num1+num2);
        System.out.println(map2.get(key1)+map2.get(key2));


    }
}