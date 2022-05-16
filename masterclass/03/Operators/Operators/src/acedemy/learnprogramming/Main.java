package acedemy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        int result = 1 + 2;
        System.out.println("1 + 2 = "+result);
        int prevResult = result;
        System.out.println("prevResult = "+prevResult);
        result = result - 1;
        System.out.println("3 - 1 = "+result);

        boolean isAlien = false;
        if(!isAlien)
            System.out.println("It is not an alien!");
        else 
            System.out.println("It is an alien!");
        
        int topScore = 100;
        if(topScore >= 100){
            System.out.println("You got the high score");
        }

        int newValue = 50;
        if(newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = true;
        if(isCar){
            System.out.println("This is not suppose to happen");
        }
        byte wasCar = isCar ? (byte)1 : (byte)0;
        System.out.println("wasCar:"+wasCar);
    }
}
