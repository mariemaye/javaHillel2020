public class Main {

    public static void main(String[] args) {
        System.out.println("--------Task1--------");

        for (int i = 0; i<100; i++){
            if (i%2 == 1) {
                System.out.println(i);
            }
        }
        System.out.println("----------Task 2----------");
        System.out.println(CalculateFactorial(5));
        }
        static int CalculateFactorial(int n){
        int result = 1;
        for(int i=1;i<=n;i++){
            result = result*i;

        }return result;
        }
    }

