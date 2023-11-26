public class Rectangle {

    double width = 5.50;
    double height = 8.50;
    double Area;
    double Perimiter;
    double[] WIDTH = {1.50, 2.50, 3.50, 4.50, 5.50};


    public void Area(double width, double height) {
        Area = width * height;
        System.out.println(Area);
    }

    public void Perimiter(double width, double height) {
        Perimiter = 2 * (width + height);
        System.out.println(Perimiter);
    }

    public void loop() {
        for (double i = 1; i <= 5; i++) {
            System.out.println("Okay");
        }
        if (Area == Perimiter) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    void Array(double[] x, double Q) {
        for (int i = 0; i<WIDTH.length; i++ ) {
            Area(x[i],Q);
        }
    }

}
