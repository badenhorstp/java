public class Main {
    public static void main(String[] args) throws Exception {
        double val1 = 20.0;
        double val2 = 80.0;
        double val3 = val1 + val2 * 100.0;
        System.out.println(val3);
        double val4 = val3 % 40.0;
        System.out.println(val4);
        boolean bool =  val4 == 0 ? true : false;
        System.out.println("Boolean value: "+bool);
        if(!bool){
            System.out.println("Got some remainder");
        }
    }
}
