/*  
Calculator in java:
OUTPUT :
Enter the first number: 10
Enter the second number: 5
Enter the operation you want to perform (+, -, *, /): +
The result is: 15
*/


public class Calculator {
    public Calculator() {
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Enter the first number: ");
        int num1 = Integer.parseInt(System.console().readLine());

        System.out.println("Enter the second number: ");
        int num2 = Integer.parseInt(System.console().readLine());

        System.out.println("Enter the operation you want to perform (+, -, *, /): ");
        char operation = System.console().readLine().charAt(0);

        int result = 0;
        switch (operation) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation.");
        }

        System.out.println("The result is: " + result);
    }
}
