public class JOG {
    int A = 3;
    int B = 6;
    int Add;


    public JOG() {
        this.math_01();
    }

    public JOG(int d) {
        this.A = d;
    }

    public JOG(int d, int e) {
        this.A = d;
        this.B = e;
    }

    public void math_01() {
        Add = A + B;
        System.out.println(Add);
    }

    public void math_02(int x, int b) {
        Add = x + b;
        System.out.println(Add);
        System.out.println("A = " + A + "   B = " + B);
    }
}
