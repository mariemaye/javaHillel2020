

public class Car {
    float volume;
    float balance;
    float balance1;
    float fuelConsumption;
float distance;
float volume1;
float volume2;
float prise;
float priseOfRide;
    public Car(float volume, float balance, float fuelConsumption, float distance,float prise) {
        this.volume = volume;
        this.balance = balance;
        this.fuelConsumption = fuelConsumption;
        this.distance = distance;
        this.prise = prise;

        System.out.println("Volume - " +volume +"\nBalance of fuel - " + balance + "\nFuel consumption - " +fuelConsumption  +"\nDistance -"+distance+"\nPrise for one kilometr -"+prise);
    }

    public float FullTank(){

if (balance == 0){
    System.out.print("\nThe amount of tank you need to have full tank -  ");
return volume;

        }else {
   volume1 = volume - balance;
    System.out.print("\nThe amount of tank you need to have full tank -  ");
    return volume1;
        }
    }
    public float BalanceAfterRide(){
        distance = distance/100;
        balance1 = volume - (distance*fuelConsumption);
        System.out.print("\nThe rest in your tank is - ");
        return balance1;

    }

    public float HowMuchWeSpend(){
        volume2 = volume - balance1;
        System.out.print("\nThe amount of tank we spent to reach the distance Odessa - Kiev is -  ");
        return volume2;
    }

   public float Prise(){
     priseOfRide = prise*volume2;
       System.out.print("\n The prise of full Ride Odessa - Kiev is - ");
     return priseOfRide;

   }


}
