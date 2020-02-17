import java.util.Scanner;
public class SecondTask {
    public static void main(String[] args){
float sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of numbers:");
        int AmountOfNumbers = in.nextInt();
       System.out.println("Enter your numbers:");

        for(int i = 1; i<=AmountOfNumbers; i++){
            float a = in.nextFloat();
           System.out.print(a);
           System.out.println("\n");
sum = sum + a;
        }
        sum = sum/AmountOfNumbers;
        System.out.println("\n");
        System.out.println(sum);
    }
}
