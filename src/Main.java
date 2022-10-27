import AnimalRescue.*;
import LogicalOPs.Calculator;
import LogicalOPs.LogicalOP;

public class Main {
    public static void main(String[] args) {

        Dog rudolph = new Dog();
        Animal animal = new Animal();
        Rescuer rescuer = new Rescuer();
        Foodforanimals foodforanimals = new Foodforanimals();
        Recreationalacitivity recreationalacitivity = new Recreationalacitivity();
        VetMed vetMed = new VetMed();
        Calculator calculator = new Calculator();
        LogicalOP logicalOP = new LogicalOP();

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
        System.out.println(logicalOP.thebiggestnumber(1,2,3));
        //      System.out.println("Distanta in metrii este: " + meters);



//        byte z = 35 + 36;
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

        System.out.println("The dog's name is" + rudolph.name);
        System.out.println("THe rudolph's age is " + rudolph.age);
        rudolph.age =6;
        System.out.println("The rudolph weight is" + rudolph.weight + "kgs");

        rudolph.running();
        rudolph.eat();
        rudolph.sleep();
        rudolph.speak();
        rudolph.tailWiggling();
        animal.name();
        foodforanimals.favouritefood();
        recreationalacitivity.Favouriteactivity();
        rescuer.Dogsname();
        vetMed.Rescuername();
        }
}

