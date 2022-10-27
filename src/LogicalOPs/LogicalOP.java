package LogicalOPs;

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
    public String compare(int value){
        if((value>8)||(value==6)){
            return "The amount of snow this winter was 7cm" + value;
        }else{
            return"The forecast snow is 7cm";
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
        } else  {
            return "The number is lower than 3";
        }

    }
    public String isNumbereven(float value){
        if(value%2==0){
            return "True";
        }else{
            return "false";
        }
    }
    public String isEligibletoVote(int value){
        if(value>18){
            return "True";
        }else{
            return "False";
        }
    }
    public String thebiggestnumber(int value, int value1, int value2){
        if(value>value1 && (value>value2)){
            return "Value este cel mai mare";
        }else if(value1>value && (value1 >value2)){
            return "Value1 este cel mai mare";
        }else{
            return "Value2 este cel mai mare";
        }
    }
}
