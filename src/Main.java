import AnimalRescue.*;
import LogicalOPs.Calculator;
import LogicalOPs.LogicalOP;
import Mostenire.Iphone;
import Mostenire.Samsung;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Rudloph", 2, 5, 5,"Beef", "Male", "brown","husky", 35.7, "male");
        dog.name();
        Cat cat = new Cat("Bobby", 7,9,3,"Whiskas", "running", "black","Savannah",18,"male");
        cat.eat();
        cat.tailWiggling();
        Rescuer rescuer = new Rescuer("Vlad", 3232);
        Foodforanimals foodforanimals = new Foodforanimals("Pedigree", 150.3,15,200);
        Recreationalacitivity recreationalacitivity = new Recreationalacitivity("running");
        VetMed vetMed = new VetMed("Alfonso","Dogs");
        Calculator calculator = new Calculator();
        LogicalOP logicalOP = new LogicalOP();
        Samsung samsung = new Samsung("Samsung", 4.5, 1500, true);
        Iphone iphone = new Iphone("Iphone",4.7,2000,false);
        samsung.marca();
        iphone.Display();


        ///////////////////////////////// Logical OP //////////////////////////////////////
        System.out.println("--------Logical OP-------");

        int first = 5;
        int second = 2;
        int third = 4;
        float substract = first - second;

        //     double inch = 130.15;double meters = inchTometeres(inch);

//        System.out.println("Hello world!");
//        System.out.println("Hello");
        System.out.println("Hello \n Romulus");
        System.out.println("Rezultatul adunarii este:" + calculator.sum(5, 3));
        System.out.println("Rezultatul scaderii este:" + calculator.substract(5, 3));
        System.out.println("Rezultatul inmultirii este:" + calculator.multiplication(5, 3));
        System.out.println("Rezultatul impartirii este:" + calculator.divide(5, 3));
        System.out.println("Media numerelor este:" + calculator.average(5, 2, 4));
        System.out.println("Restul impartirii lui 5 la 2 este " + calculator.module(5, 3));
        System.out.println("Temperatura in grade Celsius este " + calculator.divide(5, 9) * calculator.substract(5, 32));

        System.out.println("Numarul mai mare este " + logicalOP.CheckBiggerNumber(5, 2));
        System.out.println(logicalOP.comparestrings("asd", 7));
        System.out.println(logicalOP.compare(5));
        System.out.println(logicalOP.comparareee("advdasd", 7));
        System.out.println(logicalOP.whichnumberisbigger(5));
        System.out.println(logicalOP.compare(7));
        System.out.println(logicalOP.isNumbereven(7));
        System.out.println(logicalOP.isEligibletoVote(25));
        System.out.println(logicalOP.thebiggestnumber(1, 2, 3));
        logicalOP.FromOneToHundred(100);
        //      System.out.println("Distanta in metrii este: " + meters);


//        byte z = 35 + 36
//        double Z = 10 / 3d;
//        System.out.println(Z);
//        int A = -5 + 8 * 6;
//        System.out.println(A);
//        double B = (55 + 9) % 9d;
//        System.out.println(B);
//        double C = 20 + -3 * 5 / 8d;
//        System.out.println(C);
//        double D = 5 + 15 / 3 * 2 - 8 % 3d;
//        System.out.println(D);

//        int x = 2;
//        int y = 5;
//        int u = sum(x, y);
//        System.out.println(u);
//        float v = substract(x, y);
//        System.out.println(v);
//        float t = divide(x, y);
//        System.out.println(t);
//        int L = multiplication(x, y);
//        System.out.println(L);


//    public static int sum(int first, int second) {
//        int result = first + second;
//        System.out.println(result);
//        return result;

//    }
//    public static float substract(float first, float second){
//        float result = first - second;   }
//   public static float divide(float first, float second){
//       float result = first/second;
//        return result;
//    }
//    public static int multiplication(int first, int second){
//        int result = first*second;return result;
//   }


        ////////////////////////////////// Animal Rescue ///////////////////////////////////
        System.out.println("--------Animal Rescue-------");

        System.out.println("The dog's name is" + dog.getName());
        System.out.println("THe rudolph's age is " + dog.getAge());
        dog.getAge();
        System.out.println("The rudolph weight is" + dog.getWeight() + "kgs");


        dog.running();
        dog.eat();
        dog.sleep();
        dog.speak();
        dog.tailWiggling();
        dog.getName();
        cat.getName();
        foodforanimals.favouritefood();
        recreationalacitivity.Favouriteactivity();
        rescuer.Dogsname();
        vetMed.Rescuername();

        /////////////////////////////////// Repetitive Structures ///////////////////////////////////
        System.out.println("--------Repetitive Structures-------");
        logicalOP.FromOneToHundred(100);
        logicalOP.Fromonetominushundred(0);
        logicalOP.Fromonetoanother(1,10);
        logicalOP.whichoneisbigger(5,1);
        logicalOP.whichnumberiseven(100);
        logicalOP.whichnumberisodd(100);
        logicalOP.averagenumber(1,100);
        logicalOP.averagenumber2(1,-100);
        logicalOP.fromatob(1,50);
        logicalOP.fromsmalltobig(1,30);
        logicalOP.sumfrom1to100(100);
        logicalOP.stars();
        logicalOP.evenNumbersWhile();
        logicalOP.unevenNumbersWhile();
        logicalOP.sumAndAverageWhile();

        //////////////////////////////////// Array List //////////////////////////////////
        System.out.println("-----------Array List---------------");

//        logicalOP.getArrayToHundred();
//        logicalOP.getEvenArrayToHundred();
//        logicalOP.getAverageArray();
//        logicalOP.checkInArray();
//        logicalOP.getPositionInArray();
//        logicalOP.drawLines();
//        logicalOP.removeNrFromArray();
//        logicalOP.getSecondSmallestNrInArray();
//        logicalOP.copyArray();
    }
}

