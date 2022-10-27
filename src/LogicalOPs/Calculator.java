package LogicalOPs;

public class Calculator {
    public void printMyname() {
        System.out.println("Romulus");
    }

    public  int sum(int first, int second) {
        int rezultat = first + second;
        return rezultat;
    }
    public  float substract(float first, float second){
        float rezultat = first - second;
        return rezultat;
    }
    public int multiplication(int first, int second) {
        int rezultat = first * second;
        return rezultat;
    }
    public double divide(double first, double second){
        double rezultat = first / second;
        return rezultat;
    }
    public int average(int first, int second, int third){
        int rezultat = (first+second+third)/3;
        return rezultat;
    }
    public  float module(float first, float second){
        float rezultat = first%second;
        return rezultat;
    }
    public  double inchTometeres(double inch){
        double result = inch / 39.370;
        return result;
    }
}

