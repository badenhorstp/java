package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        
        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float Mix:"+myMinFloat);
        System.out.println("Float Max:"+myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double Mix:"+myMinDouble);
        System.out.println("Double Max:"+myMaxDouble);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3;
        double myDoubleValue = 5d / 3;
        System.out.println("MyIntValue:"+myIntValue);
        System.out.println("MyFloatValue:"+myFloatValue);
        System.out.println("MyDoubleValue:"+myDoubleValue);

        double numPounds = 200d;
        double numKilos = numPounds * 0.45359237;
        System.out.println("Converted kilos:"+numKilos);

        double pi = 22d / 7;
        double piEasy = 3.142_857_142_857_143d;
        System.out.println(pi);
        System.out.println(piEasy);
    }
}

