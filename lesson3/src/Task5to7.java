import java.util.Scanner;

public class Task5to7 {
    public static void main(String[] args){
        System.out.println("------Task1-------");
        System.out.println(Power(2,2));
        System.out.println("------Task2------");

        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum = sum-5;
            System.out.println(sum);
        }

        System.out.println("------Task3--------");
int num;
        Scanner in = new Scanner(System.in);
      num = in.nextInt();
     System.out.printf("Put your number:%d", num);
int sum1;
     for(int i = 0; i <=10; i++){
         sum1 = i*num;
         System.out.println(sum1);
     }


    }
    static int Power(int x, int n){
        int result = 1;
        for (int i = 1; i<=n;i++){
            result = result*x;

        }
return result;

    }


}
