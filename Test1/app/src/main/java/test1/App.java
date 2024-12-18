/*
 * 1. จงเขียนโปรแกรมพัฒนาเครื่องคิดเลขอย่างง่าย 
 * โดยรับอินพุตเป็นเลขจำนวนจริง 2 ตัว 
 * และเครื่องหมายทางคณิตศาสตร์ 1 ตัว  (+ - * / % ^)  
Enter Number x : 30
Enter Operation (+ - * / % ^) : ^
Enter Number y : 2
900


 */
package test1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;
        Scanner scanIn = new Scanner(System.in);

        System.out.print("Enter Number x : ");
        number1 = scanIn.nextDouble();
        System.out.print("Enter Operation (+ - * / % ^) : ");
        operator = scanIn.next().charAt(0);
        System.out.print("Enter Number y : ");
        number2 = scanIn.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            case '%':
                result = number1 % number2;
                System.out.println(number1 + " % " + number2 + " = " + result);
                break;
            case '^':
                result = Math.pow(number1, number2);
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        scanIn.close();
    }
}
