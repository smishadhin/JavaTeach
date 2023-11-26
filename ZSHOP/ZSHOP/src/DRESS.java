public class DRESS {

    private String Title;
    private String Color;

    private String Size;
    private  double Price;

    public DRESS(String title,String color,String size,double price){

        this.Title = title;
        this.Color = color;
        this.Size = size;
        this.Price = price;

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

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
