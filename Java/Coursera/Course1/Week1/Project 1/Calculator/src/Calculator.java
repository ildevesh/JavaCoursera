import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("\n\n::::::::CALCULATOR::::::::\n");
        char operator;
        double x, y, result;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the value of Number 1: ");
        x = input.nextDouble();
        System.out.println("Please Enter the value of Number 2: ");
        y = input.nextDouble();
        System.out.println("Please Provide the input:\nAddition: +\nSubstraction: -\nDivision: /\nMultiplication: *\n");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                result = x+y;
                System.out.println("Addition: "+ result + "\n");
                break;

                case '-':
                result = x-y;
                System.out.println("Substraction: "+ result + "\n");
                break;

                case '*':
                result = x*y;
                System.out.println("Multiplication: "+ result + "\n");
                break;

                case '/':
                result = x/y;
                System.out.println("Division: "+ result + "\n");
                break;

            default:
                break;
        }
        input.close();



     }
}
