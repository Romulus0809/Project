package LogicalOPs;

import java.util.Scanner;

public class LogicalOP {

    public int CheckBiggerNumber(int first, int second) {
        if (first > second) {
            System.out.println("If first > second,");
            return first;
        } else {
            return second;
        }

    }

    public String comparestrings(String string, int value) {
        if (string.equals("FastTrackIT")) {
            return ("Learning text compaison");
        } else {
            return ("Got to try some more");
        }

    }

    public String compare(int value) {
        if ((value > 8) || (value == 6)) {
            return "The amount of snow this winter was 7cm" + value;
        } else {
            return "The forecast snow is 7cm";
        }
    }


    public String comparareee(String string, int value) {
        if (string.equals("FasttrackIT") && (value <= 3)) {
            return "FasttrackIT si numarul este mai mic decat 3";
        } else {
            return "Textul nu este la fel si numarul este mai mare decat 4";
        }
    }

    public String whichnumberisbigger(int value) {
        if (value > 3 && !(value == 4)) {
            return "The number is greater than 3 and not equal to 4";
        } else if (value == 4) {
            return "The number is equal to 4";
        } else {
            return "The number is lower than 3";
        }

    }

    public String isNumbereven(float value) {
        if (value % 2 == 0) {
            return "True";
        } else {
            return "false";
        }
    }

    public String isEligibletoVote(int value) {
        if (value > 18) {
            return "True";
        } else {
            return "False";
        }
    }

    public String thebiggestnumber(int value, int value1, int value2) {
        if (value > value1 && (value > value2)) {
            return "Value este cel mai mare";
        } else if (value1 > value && (value1 > value2)) {
            return "Value1 este cel mai mare";
        } else {
            return "Value2 este cel mai mare";
        }
    }

    public void FromOneToHundred(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println("Numarul curent este " + i);
        }
    }

    public void Fromonetominushundred(int number) {
        for (int i = -100; i <= number; i++) {
            System.out.println("Numarul curent este" + i);
        }
    }

    public void Fromonetoanother(int number1, int number2) {
        for (int i = number1; i <= number2; i++) {
            System.out.println(i);
        }
    }

    public void whichoneisbigger(int number1, int number2) {
        for (int i = number1; i < number2; i++) {
            if (number1 < number2) {
                System.out.println("Numarul 1 este mai mic decat numarul " + i);
            } else {
                System.out.println("Numarul 1 este mai mare decat numarul " + i);
            }
        }
    }

    public void whichnumberiseven(int number) {
        for (int i = 0; i <= number; i++) {
            if (!(i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }

    public void whichnumberisodd(int number) {
        for (int i = 0; i <= number; i++) {
            if ((i % 2 == 0)) {
                System.out.println(i);
            }
        }
    }

    public void sumfrom1to100(int first) {
        int suma = 0;
        for (int index = 0; index <= first; index++) {
            suma = suma + index;
        }
        System.out.println("Suma numerelor este " + suma);
    }
        public void stars() {
            int row= 7;
            for(int i=row-1;i>=0;i--){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    }




        public void averagenumber ( int first, int second){
            int i = 1;
            int last = 100;
            while (i < last) {
                System.out.println(i);
                i++;
            }
        }
        public void averagenumber2 ( int first, int second){
            int i = -100;
            int last = 0;
            while (i < last) {
                System.out.println(i);
                i++;
            }
        }
        public void fromatob ( int first, int second){
            int a = 1;
            int b = 50;
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        }
        public void fromsmalltobig ( int first, int second){
            int a = 1;
            int b = 30;
            while (a <= b) {
                System.out.println(a);
                a++;
            }
        }	public void evenNumbersWhile() {
        int number = 1;
        while (number <= 100) {
            number++;
            if (number % 2 == 0) {
                System.out.println(number);
            }

        }

    }	public void unevenNumbersWhile() {
        int number = 1;
        while (number < 100) {
            number++;
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }	public void sumAndAverageWhile() {
        int firstNumber = 111;
        int secondNumber = 8899;
        double sum = 0;
        int count = 0;
        while (firstNumber <= secondNumber) {
            sum += firstNumber;
            firstNumber++;
            count++;
        }
        System.out.println(sum);
        double average = sum / count;
        System.out.println("The average of the numbers is: " + average);
    }

    public int[] getArrayToHundred() {

        int[] myArray = new int[100];


        for (int i = 1; i <= 100; i++) {

            myArray[i - 1] = i;

            System.out.println(myArray[i-1]);

        }

        return myArray;

    }

    public int[] getEvenArrayToHundred(int[] evenArray) {

        int j = 0;


        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {

                evenArray[j] = i;

                j++;

            }

        }

        return evenArray;

    }

    public float getAverageArray(int[] myArray) {

        float sum = 0;

        for (int i = 0; i < myArray.length; i++) {

            sum += myArray[i];

        }

        return (sum / myArray.length);

    }

    public boolean checkInArray(String[] arrString, String input) {


        for (int i = 0; i < arrString.length; i++) {

            if (arrString[i].equals(input)) {

                return true;

            }

        }

        return false;

    }

    public int getPositionInArray(int[] Numbers, int nr) {

        for (int i = 0; i < Numbers.length; i++) {

            if (Numbers[i] == nr) {

                return i;

            }

        }

        return 0;

    }



    public void drawLines() {

        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};


        for (int i = 0; i <= 10; i++) {

            System.out.println(line);

        }

    }

    public int[] removeNrFromArray(int[] myArray, int nr) {

        int[] secondArray = new int[myArray.length];

        int j = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == nr)

                continue;

            secondArray[j++] = myArray[i];

        }

        int[] finArray = new int[j];


        for (int i = 0; i < j; i++)

            finArray[i] = secondArray[i];

        return finArray;

    }

    public int getSecondSmallestNrInArray(int[] myArray) {



        int temporary = 0;
        for(int i = 0; i< myArray.length;i++){
            for(int j = i + 1;j<myArray.length;j++){
                if(myArray[i] > myArray[j]){
                    temporary = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temporary;
                }
            }
        }
        return myArray[1];

    }


    public int[] copyArray(int[] firstArray, int[] emptyArray) {


        for (int i = 0, j = 0; i < firstArray.length; i++) {

            emptyArray[j] = firstArray[i];

            j++;

        }

        return emptyArray;

    }
}





