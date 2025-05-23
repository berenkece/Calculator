
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        operations calculator1 = new operations();
        Scanner CalculatorScanner = new Scanner(System.in);

        System.out.println("Welcome to the calculator program. Input the numbers you want to make operations:");
        double operand1 = CalculatorScanner.nextDouble();
        double operand2 = CalculatorScanner.nextDouble();

        System.out.println("now choose the operation you want to be performed:addition, subtraction, multiplication, division, power, modulus: ");
        CalculatorScanner.nextLine();
        String givenOperator = CalculatorScanner.nextLine();

        String Operator = givenOperator.trim().toLowerCase();

        switch (Operator) {
            case "addition":
                System.out.println("Result is " + calculator1.Add(operand1, operand2));
                break;
            case "subtraction":
                System.out.println("Result is " + calculator1.Subtract(operand1, operand2));
                break;
            case "multiplication":
                System.out.println("Result is " + calculator1.Multiple(operand1, operand2));
                break;
            case "division":
                if (operand2 == 0) {
                    System.out.println("denominator can not be 0.");
                    break;
                }
                System.out.println("Result is " + calculator1.Divide(operand1, operand2));
                break;
            case "modulus":
                System.out.println("Result is " + calculator1.Modulus(operand1, operand2));
                break;
            case "power":
                System.out.println("Result is " + calculator1.Exponent(operand1, operand2));
                break;
        }

    }
}