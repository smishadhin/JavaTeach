public class Circle {
    float Radius = 7.5F;
    float PI = 3.1416F;
    float area;
    float perimeter;

    void math() {

        area = PI * (Radius * Radius);
        System.out.println(area);

        perimeter = 2 * (PI * Radius);
        System.out.println(perimeter);

        if (area == perimeter) {
            System.out.println("Equal");
        } else {

            for (int i = 1; i <= 3; i++) {
                System.out.println("NotEqual");

            }
        }
    }
}
