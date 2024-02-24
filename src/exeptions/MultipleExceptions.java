package exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {
    /**
     * If the user enters the second number as 0
     * the first catch is responsible for handling the exception
     * If the user enters a String, char, double, float instead the second catch(InputMismatchException) is responsible
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();
        try{
            int result = number1/number2;
            System.out.println("Result " + result);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide a number by zero");
            System.out.println("Exception message " + e.getMessage());
        } catch(InputMismatchException e){
            System.out.println("Error: Invalid input. Please enter integers only.");
            System.out.println("Message " + e.getMessage()); //null
        }
        scanner.close();
    }
}
