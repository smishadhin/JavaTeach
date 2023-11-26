import java.util.ArrayList;

public class Main {

    ArrayList<Structure> List = new ArrayList<>();

    public static void main(String[] args) {

Main m = new Main();
        //m.List.add(1,"My_Dog",1,true,false);


        String Name = "My_Dog";
        int Age = 1;
        boolean Bull_Dog = true;
        boolean No = false;

        String Name2 = "Your_Dog";
        int Age2 = 2;
        boolean Pit_Bull = true;
        boolean No2 = false;

        String Name3 = "His_Dog";
        int Age3 = 3;
        boolean Doberman = true;
        boolean No3 = false;

        if (Name == Name2 && Age == Age2 ){
            System.out.println( Pit_Bull);
        }else{
            System.out.println( Bull_Dog);
        }

        if(Name !=Name2)

        {
            System.out.println( Doberman);
        }else

        {
            System.out.println( Bull_Dog);
        }
    }


}