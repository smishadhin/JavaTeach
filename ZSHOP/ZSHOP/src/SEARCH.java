import java.util.Scanner;

public class SEARCH {
    private String SearchTitle;
    private Boolean isFound = false;
    public String getSearchTitle() {
        return SearchTitle;
    }
    public void setSearchTitle(String searchTitle) {
        SearchTitle = searchTitle;
    }
    public void SearchTop() {
        System.out.println("Search any one from the three:: Top :: Jacket :: Shirt ::");
        Scanner scanner = new Scanner(System.in);
        setSearchTitle(scanner.nextLine());//Did not make any sence.

        PRODUCT product = new PRODUCT();

        for (int i = 0, i < product.Tops.size()){

        }
    }





}

