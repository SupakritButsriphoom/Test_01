/*
 * ให้เขียนโปรแกรมรับอินพุต N ผ่านทางแป้นพิมพ์ 
 * แล้วให้แสดงเครื่องหมายดอกจันออกตามรูปแบบต่อไปนี้(เลือก 2 ข้อย่อย)
2.1)
Enter N: 5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

2.2)
Enter N: 5
* * * * *
*       *
*       *
*       *
* * * * *

 */
package test2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int N;
        System.out.println("Enter N: ");
        N = scanIn.nextDouble();
        for (int i = 1; i <= N; i++) {

            for (int j = 1; N <= i; N++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = 4 - 1; i >= 0; i--) {

            for (int j = 0; j <= i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
