package bg.smg;

public class Main {
    public static void main(String[] args) {
        AnimalHouse<Animal> tigerHouse = new AnimalHouse<Animal>();
        AnimalHouse<Animal> birdHouse = new AnimalHouse<Animal>();
        Tiger t = new Tiger();
        t.name = "a";
        tigerHouse.animal = t;
        Bird b = new Bird();
        b.highOfFlight = 20.1;
        birdHouse.animal = b;
    }
}
