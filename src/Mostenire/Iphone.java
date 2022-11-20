package Mostenire;

public class Iphone extends Telefon {


    public Iphone(String Marca, double Display, int Pret, boolean Camera) {
        super(Marca, Display, Pret, Camera);
    }
    public void Display(){
        System.out.println("Telefonul are display-ul de " + Display);
    }
}
