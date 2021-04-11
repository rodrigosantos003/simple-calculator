import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber, secondNumber, result;
        String operator;

        System.out.println("Enter first number: ");
        firstNumber = scanner.nextDouble();

        System.out.println("Enter operator: ");
        operator = scanner.next();

        System.out.println("Enter second number: ");
        secondNumber = scanner.nextDouble();

        switch (operator){
            case "+":
                result = firstNumber + secondNumber;
                System.out.print(firstNumber + " + " + secondNumber + " = " + result);
                break;

            case "-":
                result = firstNumber - secondNumber;
                System.out.print(firstNumber + " - " + secondNumber + " = " + result);
                break;

            case "*":
                result = firstNumber * secondNumber;
                System.out.print(firstNumber + " * " + secondNumber + " = " + result);
                break;

            case "/":
                result = firstNumber / secondNumber;
                System.out.print(firstNumber + " / " + secondNumber + " = " + result);
                break;

            default:
                System.out.print("Enter a valid operator!");
        }
    }
}
