// I have neither given nor received unauthorized aid on this piece of work.

public class Main {

    public static void main(String[] args) {
        System.out.print("Trying to Push onto Github");


    }

    // 1. add
    public static int add(int a, int b){
        return a+b;
    }

    // 2. add
    public static int addTwo(int a, int b, int c, int d) {
        return add(add(a,b), add(c,d));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        String greeting = "早上好, " + name + "!";
        return greeting;
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        String greeting = "下午好, " + name + "!";
        return greeting;
    }
    // 5. triple
    public static String triple(String word) {
        String tripledWord = word+word+word;
        return tripledWord;
    }
    // 6. half
    public static double half(int number){
        double num = (double) number/2;
        return num;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double number){
       int num = (int) (number + 0.5);
        return num;
    }


    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double number){
        int num = (int) (number - 0.5);
        return num;
    }

}
