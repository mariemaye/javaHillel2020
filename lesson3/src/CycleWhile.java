public class CycleWhile {
    public static void main(String [] args){
        System.out.println("--------Task3---------");
       int i =0;
        while (i<100){
            i++;
          if(  i%2 ==1) System.out.println(i);
        }
        System.out.println("------Task4------");
        System.out.println(CalculateFactorial(6));
    }
    static int CalculateFactorial(int n){
        int result = 1;
        int i = 0;
        while (i<=n){
            i++;
            result=result*i;

        }   return result;
    }
}
