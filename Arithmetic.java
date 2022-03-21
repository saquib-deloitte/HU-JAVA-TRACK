public class Arithmetic {
    public static void main(String args[]){
        try{
            int exe = 100 / 0;
            System.out.println(exe);
        }
        catch (ArithmeticException x){
            System.out.println("this is exception");
        }
        finally {
            System.out.println("completed ");
        }
    }
}
