public class CycleDoWhile {
    public static void main(String [] args){
        System.out.println("--------Task5-------");
        int i = 0;
        do {
            i++;
            if(i%2==1) System.out.println(i);
        }while (i<100);

        System.out.println("-------Task6-------");
        System.out.println(CalculateFactorial(3));
    }
    static int CalculateFactorial(int n){
        int i = 1;
        int result = 1;
        do {
            i++;
            result = result*i;

        }while (i<=n);
        return result;
    }
}
