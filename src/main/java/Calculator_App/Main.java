/*Date: 16/08/2025
* Developers Name: Minango Uwila
* Program Description: A simple mathematics calculator system*/

package Calculator_App;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        System.out.println("Welcome to Calculator");
        Scanner scan= new Scanner(System.in);
        Operations ops = new Operations();

        System.out.println("Please enter the complete mathematics operation:\n");
        String mathOperation = scan.nextLine();


        char [] operation = mathOperation.toCharArray();
        for(char a : operation){
            if(a=='+'){
                String [] numbers = mathOperation.split("\\+");
                double num1 = Double.parseDouble(numbers[0]);
                double num2 = Double.parseDouble(numbers[1]);
                System.out.println(ops.addition(num1, num2));
                break;
            }
            else if(a=='-'){
                String [] numbers = mathOperation.split("-");
                double num1 = Double.parseDouble(numbers[0]);
                double num2 = Double.parseDouble(numbers[1]);
                System.out.println(ops.subtraction(num1, num2));
                break;
            }
            else if(a=='*'){
                String [] numbers = mathOperation.split("\\*");
                double num1 = Double.parseDouble(numbers[0]);
                double num2 = Double.parseDouble(numbers[1]);
                System.out.println(ops.multiplication(num1, num2));
                break;
            }
            else if(a=='/'){
                String [] numbers = mathOperation.split("/");
                double num1 = Double.parseDouble(numbers[0]);
                double num2 = Double.parseDouble(numbers[1]);
                System.out.println(ops.division(num1, num2));
                break;
            }
            System.out.println(ops.average());
            System.out.println("This calculator will be amazing!");

        }
    }
}
