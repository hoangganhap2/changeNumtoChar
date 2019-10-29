import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class numChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        if (number >= 0 && number < 10) {
            String callOnes = callOnes(number, overTwenty(number));
            System.out.println(callOnes);
        } else if (number >= 10 && number < 20) {
            int ones = number - 10;
            String callTens = callTens(ones, overTwenty(number));
            System.out.println(callTens);
        } else if (number >= 20 && number < 100) {
            int tens = Math.round(number / 10);
            String callTens = callTens(tens, overTwenty(number));
            int ones = number - tens * 10;
            String callOnes = callOnes(ones, overTwenty(number));
            System.out.println(callTens + " " + callOnes);
        } else if (number >= 100 && number < 1000) {
            int hundreds = Math.round(number / 100);
            int tens = Math.round((number - hundreds * 100) / 10);
            int ones = number - hundreds * 100 - tens * 10;
            String callHundreds = callHundreds(hundreds, overTwenty(number));
            String callTens = callTens(tens, overTwenty(number));
            String callOnes = callOnes(ones, overTwenty(number));
            System.out.println(callHundreds + " " + callTens + " " + callOnes);
        } else {
            System.out.println("Out of ability");
        }
    }

    public static boolean overTwenty(int number) {
        if (number >= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static String callOnes(int number, boolean overTwenty) {
        String ones = "";
        switch (number) {
            case 0:
                if (overTwenty) {
                    ones = "zero";
                }
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                break;
        }
        return ones;
    }

    public static String callTens(int number, boolean overTwenty){
        String tens="";
        switch (number){
            case 0:
                if(!overTwenty) {
                    tens = "Ten";
                }
                    break;
            case 1:
                if(!overTwenty){
                    tens="Eleven";
                }
                break;
            case 2:
                if(!overTwenty){
                    tens="Twelve";
                }else {
                    tens="Twenty";
                }
                break;
            case 3:
                if(!overTwenty){
                    tens="Thirteen";
                }else {
                    tens="Thirty";
                }
                break;
            case 4:
                if(!overTwenty){
                    tens="Fourteen";
                }else {
                    tens="Forty";
                }
                break;
            case 5:
                if(!overTwenty){
                    tens="Fifteen";
                }else {
                    tens="Fifty";
                }
                break;
            case 6:
                if(!overTwenty){
                    tens="Sixteen";
                }else {
                    tens="Sixty";
                }
                break;
            case 7:
                if(!overTwenty){
                    tens="Seventeen";
                }else {
                    tens="Seventy";
                }
                break;
            case 8:
                if(!overTwenty){
                    tens="Eighteen";
                }else {
                    tens="Eighty";
                }
                break;
            case 9:
                if(!overTwenty){
                    tens="Nineteen";
                }else {
                    tens="Ninety";
                }
                break;
            default:
                break;
        }
        return tens;
    }
    public static String callHundreds(int number,boolean overTwenty){
        String callHundreds=callOnes(number,overTwenty)+"hundred";
        return callHundreds;
    }
}

