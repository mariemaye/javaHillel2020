import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a = in.nextFloat();
        System.out.printf("Enter first number:%f\n", a);
        float b = in.nextFloat();
        System.out.printf("Enter second number:%f\n",b);
        in.close();
        float sum = (a+b)/2;
        System.out.printf("The average of this two numbers is:%f",sum);



    }
}
