package AnimalRescue;

public class Cat extends Animal{
    public Cat(String name, int age, int levelHealth, int levelHungriness, String favouriteHealth, String favouriteRecreationalactivity, String color, String breed, double weight, String gender) {
        super(name, age, levelHealth, levelHungriness, favouriteHealth, favouriteRecreationalactivity, color, breed, weight, gender);
    }

    public void eat(){
        System.out.println("I need some whiskas " + getFavouriteFood());
    }
}
