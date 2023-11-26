public class Rayyan extends Human {


    private int head;
    private int eye;
    private int nose;
    private double weight;
    private boolean hungry;

    private void head() {
        head = 2;
        eye = 3;
        weight = head + eye;
        System.out.println(weight);
    }

    public void sethead(int head) {
        this.head = head;
    }

    public int gethead() {
        return this.head;
    }

    public void seteye(int eye) {
        this.eye = eye;
    }

    public int geteye() {
        return this.eye;
    }

    public void setnose(int nose) {
        this.nose = nose;
    }

    public int getnose() {
        return this.nose;
    }

    public void setweight(double weight) {
        this.weight = weight;
    }

    public double getweight() {
        return this.weight;
    }

    public void sethungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean gethungry() {
        return this.hungry;
    }


    public void show() {
         head();
        System.out.println(gethead());
        System.out.println(geteye());
        System.out.println(getweight());
        System.out.println(gethungry());
        getBody();
    }

    public void show(int x) {
        head();
        System.out.println(gethead());
        System.out.println(geteye());
        System.out.println(getweight());
        System.out.println(gethungry());
        getBody();
    }

    public void show(int x , int y) {
        head();

        sethead(x);
        seteye(y);

        System.out.println(gethead());
        System.out.println(geteye());
        System.out.println(getweight());
        System.out.println(gethungry());
        getBody();
    }
}
