package AnimalRescue;

public class Rescuer {

    private String name = "Vlad";
    private int availableMoney = 3232;

    public Rescuer(String name, int availableMoney) {
        this.name = name;
        this.availableMoney = availableMoney;
    }

    public void Dogsname() {
        System.out.println("The dog's name is: " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }
}
