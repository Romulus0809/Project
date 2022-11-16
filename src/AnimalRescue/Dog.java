package AnimalRescue;

public class Dog {

    private String name = "Rudolph";
    private int age = 2;
    private String breed = "Husky";
    private String color = "blue";
    private double weight = 30.5;
    private String gender = "Male";

    public Dog(String name, int age, String breed, String color, double weight, String gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.gender = gender;
    }

    public void eat() {
        System.out.println("Eating Yummyyyy");
    }

    public void sleep() {
        System.out.println("Snoooriiinnggg ZZzzzZzZzZ");
    }

    public void speak() {
        System.out.println("Woof woof miau");
    }

    public void running() {
        System.out.println("Running");
    }

    public void tailWiggling() {
        System.out.println("Wiggling the tail");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

