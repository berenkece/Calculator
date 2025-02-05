
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome! Which operation would you like to perform?");
        System.out.println("1-Summation \n 2-Subtraction \n 3-Multiplicaiton  \n 4- Division \n 5-Exponentiation \n 6-Modulus");
        System.out.println("Enter the number of operation you want to use: ");
        int operation = input.nextInt();

        System.out.println("enter first operator: ");
        double firstOperator = input.nextDouble();

        System.out.println("enter second operator: ");
        double secondOperator = input.nextDouble();

        switch(operation){
            case 1:
                System.out.println(firstOperator + " + " + secondOperator + " = " + Summation(firstOperator, secondOperator));
                break;
            case 2:
                System.out.println(firstOperator + " - " + secondOperator + " = " + Subtraction(firstOperator, secondOperator));
                break;
            case 3:
                System.out.println(firstOperator + " x " + secondOperator + " = " + Multiplication(firstOperator, secondOperator));
                break;
            case 4:
                System.out.println(firstOperator + " / " + secondOperator + " = " + Division(firstOperator, secondOperator));
                break;
            case 5:
                System.out.println(firstOperator + " ** " + secondOperator + " = " + Exponentiation(firstOperator, secondOperator));
                break;
            case 6:
                System.out.println(firstOperator + " % " + secondOperator + " = " + Modulus(firstOperator, secondOperator));
                break;





        }


        
    }
    public static double Summation(double a, double b){
        return a+b;
    }
    public static double Subtraction(double a, double b){
        return a-b;
    }
    public static double Multiplication(double a, double b){
        return a*b;
    }
    public static double Division(double a, double b){
        if (b == 0){
            System.out.println("error");
        }
        return a/b;
    }
    public static double Exponentiation(double a, double b){
        return Math.pow(a,b);
    }
    public static double Modulus(double a, double b){
        return a%b;
    }
}

