public class Structure {
    String Name ;
    int Age;
    boolean Bull_Dog ;
    boolean No;

    public Structure() {
    }

    public Structure(String name, int age, boolean bull_Dog, boolean no) {
        Name = name;
        Age = age;
        Bull_Dog = bull_Dog;
        No = no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public boolean isBull_Dog() {
        return Bull_Dog;
    }

    public void setBull_Dog(boolean bull_Dog) {
        Bull_Dog = bull_Dog;
    }

    public boolean isNo() {
        return No;
    }

    public void setNo(boolean no) {
        No = no;
    }
}
