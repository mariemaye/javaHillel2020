public class Main {

    public static void main(String[] args) {
Car car = new Car(60, 20, (float) 8.5, 476, 26);
        System.out.println(car.FullTank());
        System.out.println(car.BalanceAfterRide());
        System.out.println(car.HowMuchWeSpend());
        System.out.println(car.Prise());
    }
}
