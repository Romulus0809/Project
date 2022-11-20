package AnimalRescue;

public class Dog extends Animal {

    public Dog(String name, int age, int levelHealth, int levelHungriness, String favouriteFood, String favouriteRecreationalActivity, String color, String breed, double weight, String gender) {
        super(name, age, levelHealth, levelHungriness, favouriteFood, favouriteRecreationalActivity, color, breed, weight, gender);
    }

    public void eat(){
        System.out.println("My favourite food is " + getFavouriteFood());
    }
    public void name(){
        System.out.println("My name is " + getName());
    }

}

