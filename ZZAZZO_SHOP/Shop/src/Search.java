import java.util.Scanner;

public class Search {

    private String SearchTitle;
    private boolean isFound = false;

    public String getSearchTitle( ) {
        return SearchTitle;
    }

    public void setSearchTitle(String searchTitle) {

        SearchTitle = searchTitle;
    }


    public void SearchTop(){

        System.out.println("Search By Title::");
        Scanner scanner = new Scanner(System.in);
        setSearchTitle(scanner.nextLine());


        Products product = new Products();
       // product.CreateTops();

        for (int i = 0; i<product.Tops.size();i++){
            if (getSearchTitle().equals(product.Tops.get(i).getTitle()) ) {
                isFound = true;
                System.out.println("Product Name:" +  product.Tops.get(i).getTitle());
                System.out.print("  Price:" +  product.Tops.get(i).getPrice());
                System.out.print("  Size:" +  product.Tops.get(i).getSize());
                System.out.print("  Color:" +  product.Tops.get(i).getColor());
                if (isFound){
                    break;
                }
            }else {
                isFound = false;
            }
        }

        if (isFound ==false){
            System.out.println("NotFound");
        }

    }

}
