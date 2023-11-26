import java.util.ArrayList;

public class Products {

    ArrayList <Dress> Tops = new ArrayList<>();
    ArrayList <Dress> Jacket = new ArrayList<>();
    ArrayList <Dress> Shirt = new ArrayList<>();

    public Products() {
        CreateTops();
    }

    public void CreateTops(){

        Tops.add(0,new Dress("Top1","Red","10",9.99));
        Tops.add(1,new Dress("Top2","Blue","16",19.99));
        Tops.add(2,new Dress("Top3","Yellow","20",29.99));

    }

}
