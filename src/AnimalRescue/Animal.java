package AnimalRescue;

public class Animal {

        private String name = "Roger";
        private int age = 5;
        private int levelHealth = 3;
        private int levelHungriness = 5;
        private String favouriteHealth = "Beef";
        private String favouriteRecreationalactivity = "running";

        public Animal(String name, int age, int levelHealth, int levelHungriness, String favouriteHealth, String favouriteRecreationalactivity) {
                this.name = name;
                this.age = age;
                this.levelHealth = levelHealth;
                this.levelHungriness = levelHungriness;
                this.favouriteHealth = favouriteHealth;
                this.favouriteRecreationalactivity = favouriteRecreationalactivity;
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

        public String getFavouriteHealth() {
                return favouriteHealth;
        }

        public void setFavouriteHealth(String favouriteHealth) {
                this.favouriteHealth = favouriteHealth;
        }

        public String getFavouriteRecreationalactivity() {
                return favouriteRecreationalactivity;
        }

        public void setFavouriteRecreationalactivity(String favouriteRecreationalactivity) {
                this.favouriteRecreationalactivity = favouriteRecreationalactivity;
        }
}

