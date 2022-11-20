package Mostenire;

public class Samsung extends Telefon{


    public Samsung(String Marca, double Display, int Pret, boolean Camera) {
        super(Marca, Display, Pret, Camera);
    }

    public void marca(){
        System.out.println("Marca telefonului este " + Marca);
    }
    public void camera(){
        if(Camera){
            System.out.println("Telefonul are camerea foto");
        }
    }
}
