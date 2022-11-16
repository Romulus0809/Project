package AnimalRescue;

public class Foodforanimals {

    private String name = "Pedigree";
    private double price = 150.3;
    private int quantity = 15;
    private int availableStock = 200;

    public Foodforanimals(String name, double price, int quantity, int availableStock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.availableStock = availableStock;
    }

    public void favouritefood() {
        System.out.println("His favourite food is: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }
}

