public class Main {

    public static void main(String[] args) {

Animals animals = new Animals(1,4,67,"green");

        Dog dog = new Dog("Riki");
        System.out.println(dog.VoiceHousehold());
        System.out.println("Can we go out?");
        dog.setVoccinated(false);
        System.out.println(dog.GoOut());
        System.out.println();

        DogGuide dogGuide = new DogGuide("Sharik");
        dogGuide.setTrained(true);
        System.out.println(dogGuide.DogGuideVoice());
        System.out.println(dogGuide.VoiceHousehold());
        System.out.println("Can we go out?");
        dogGuide.setVoccinated(true);
        System.out.println(dogGuide.GoOut());
        System.out.println();

        Cat cat = new Cat("Mursik");
        System.out.println(cat.VoiceHousehold());
        System.out.println("Can we go out?");
        cat.setVoccinated(false);
        System.out.println(cat.GoOut());
        System.out.println();

        Fish fish = new Fish("Buba");
        System.out.println(fish.VoiceHousehold());
        System.out.println("Can we go out?");
        fish.setVoccinated(false);
        System.out.println(fish.GoOut());
        System.out.println();

        Hamster hamster = new Hamster("Pushistik");
        System.out.println(hamster.VoiceHousehold());
        System.out.println("Can we go out?");
        hamster.setVoccinated(true);
        System.out.println(hamster.GoOut());
        System.out.println();

        Lion lion = new Lion();
        lion.setPredator(true);
        System.out.println(lion.Predator());
        System.out.println(lion.Voice());
        System.out.println();

        Giraf giraf = new Giraf();
        giraf.setPredator(false);
        System.out.println(giraf.Predator());
        System.out.println(giraf.Voice());
        System.out.println();

        Crocodile crocodile = new Crocodile();
        crocodile.setPredator(true);
        System.out.println(crocodile.Predator());
        System.out.println(crocodile.Voice());
        System.out.println();

        Wolf wolf = new Wolf();
        wolf.setPredator(true);
        System.out.println(wolf.Predator());
        System.out.println(wolf.Voice());
    }

}