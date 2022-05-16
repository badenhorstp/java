package academy.learnprogramming;

public class Main {
    public static void main(String[] args) throws Exception {
        //int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;

        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Int Min Value:"+myMinIntValue);
        System.out.println("Int Max Value:"+myMaxIntValue);
        System.out.println("Busted Max:"+(myMaxIntValue+10));

        //int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;        
        byte myMaxByteValue = Byte.MAX_VALUE;        
        System.out.println("Byte Min Value:"+myMinByteValue);
        System.out.println("Byte Max Value:"+myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;        
        System.out.println("Short Min Value:"+myMinShortValue);
        System.out.println("Short Max Value:"+(myMaxShortValue+1));
        System.out.println("Short Max Value:"+(short)(myMaxShortValue+1));

        long myLongValue = 2_147_483_647_265L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;        
        System.out.println("Long Min Value:"+myMinLongValue);
        System.out.println("Long Max Value:"+(myMaxLongValue+1));
        System.out.println("Literal Value:"+myLongValue);

        // int myTotal = (myMinIntValue / 2);
        // byte myNewByteValue = (byte)(myMinByteValue / 2);

        byte b = 34;
        short s = 4556;
        int i = 3445566;
        long l = 5000 + (10 * (b + s +i));
        System.out.println(l);
    }
}
