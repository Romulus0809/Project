package AnimalRescue;

public class Recreationalacitivity {

     private String name = "running";

    public Recreationalacitivity(String name) {
        this.name = name;
    }

    public void Favouriteactivity(){
            System.out.println("The favourite activity is: " + name);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
