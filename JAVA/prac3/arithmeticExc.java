public class arithmeticExc {
    public static void main(String[] args) {
        try{
            int a = 10, b = 0;
            int result = a/b; // Exceptions
            System.out.println("Result: " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error Cannot Divide by zero");
        }
        finally {
            System.out.println("End of the program");
        }
    }
}
