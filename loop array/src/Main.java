public class Main {
    public static void main(String[] args) {


                int x = 7;


                    for(int i = 1; i <= x;i++) {
                        if(i== 2) {
                            continue;
                        }
                        System.out.println(" before continue  I:  " + i);


                        System.out.println("  after continue I:  " + i);
                    }

            }


}