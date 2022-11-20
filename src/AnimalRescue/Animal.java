package AnimalRescue;

public class Animal {

        private String name = "Roger";
        private int age = 5;
        private int levelHealth = 3;
        private int levelHungriness = 5;
        private String favouriteFood = "Beef";
        private String favouriteRecreationalactivity = "running";
        private String color =  "blue";
        private String breed = "Husky";
        private double weight = 30.5;
        private String gender = "Male";

        public Animal(String name, int age, int levelHealth, int levelHungriness, String favouriteHealth, String favouriteRecreationalactivity, String color, String breed, double weight, String gender) {
                this.name = name;
                this.age = age;
                this.levelHealth = levelHealth;
                this.levelHungriness = levelHungriness;
                this.favouriteFood = favouriteHealth;
                this.favouriteRecreationalactivity = favouriteRecreationalactivity;
                this.color = color;
                this.breed = breed;
                this.weight = weight;
                this.gender = gender;
        }

        public void name(){
                System.out.println("The AnimalRescue.Recreationalacitivity.Dog's name is: " + name);
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

        public int getLevelHealth() {
                return levelHealth;
        }

        public void setLevelHealth(int levelHealth) {
                this.levelHealth = levelHealth;
        }

        public int getLevelHungriness() {
                return levelHungriness;
        }

        public void setLevelHungriness(int levelHungriness) {
                this.levelHungriness = levelHungriness;
        }

        public String getFavouriteFood() {
                return favouriteFood;
        }

        public void setFavouriteFood(String favouriteFood) {
                this.favouriteFood = favouriteFood;
        }

        public String getFavouriteRecreationalactivity() {
                return favouriteRecreationalactivity;
        }

        public void setFavouriteRecreationalactivity(String favouriteRecreationalactivity) {
                this.favouriteRecreationalactivity = favouriteRecreationalactivity;
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

        public String getBreed() {
                return breed;
        }

        public void setBreed(String breed) {
                this.breed = breed;
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
}

