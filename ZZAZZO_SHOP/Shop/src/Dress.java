
public class Dress {
    private String Color;
    private String Size;
    private Double Price;
    private String Title;

    public Dress(String title, String color, String size, Double price ) {
        this.Color = color;
        this.Size = size;
        this.Price = price;
        this.Title = title;


    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
}
