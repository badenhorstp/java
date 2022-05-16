public class Main {
    public static void main(String[] args) throws Exception {
        
        int switchVal = 6;

        switch(switchVal){
            case 1: 
                System.out.println("Value is 1");
                break;
            case 2: 
                System.out.println("Value is 2");
            case 3: 
                System.out.println("Value is 3");
            case 4: 
                System.out.println("Value is 4");
                break;
            default:
                System.out.println("Non of the above.");
                break;
            case 5: 
                System.out.println("Value is 5");
        }
}
