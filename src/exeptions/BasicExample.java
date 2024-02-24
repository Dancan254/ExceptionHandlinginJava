package exeptions;

public class BasicExample {
    public static void main(String[] args) {
        //trying to divide a number by zero
        ///lets see how we can handle that with a try and catch
        try{
            int number1 = 10;
            int number2 = 0;
            int result = number1/number2;
            System.out.println("Result " + result);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide a number by zero");
            System.out.println("Exception message " + e.getMessage());
        }

    }
}
