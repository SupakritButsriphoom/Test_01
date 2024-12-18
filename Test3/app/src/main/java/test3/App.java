/*
 * 5. จงเขียนโปรแกรม โดยรับค่าขนาด matrix 
 * มาจากผู้ใช้ จากนั้นสร้างและรับค่า matrix 2 ตัว A และ B ผ่านทางแป้นพิมพ์ 
 * แล้วทำการสร้างฟังก์ชัน Add() และ Subtract() สำหรับบวกและลบเมทริกซ์ตามลำดับ 
 * แล้วแสดงผลการบวกและลบเมทริกซ์ออกทางหน้าจอ
 * Enter Matrix A index of [0][0] : 1
Enter Matrix A index of [0][1] : 2
Enter Matrix A index of [0][2] : 3
Enter Matrix A index of [1][0] : 4
Enter Matrix A index of [1][1] : 5
Enter Matrix A index of [1][2] : 6
Enter Matrix A index of [2][0] : 7
Enter Matrix A index of [2][1] : 8
Enter Matrix A index of [2][2] : 9
.
Matrix A is
1 2 3
4 5 6
7 8 9
Enter Matrix B index of [0][0] : 10
Enter Matrix B index of [0][1] : 20
Enter Matrix B index of [0][2] : 30
Enter Matrix B index of [1][0] : 40
Enter Matrix B index of [1][1] : 50
Enter Matrix B index of [1][2] : 60
Enter Matrix B index of [2][0] : 70
Enter Matrix B index of [2][1] : 80
Enter Matrix B index of [2][2] : 90
.
Matrix B is
10 20 30
40 50 60
70 80 90
.
Matrix A + Matrix B:
11 22 33
44 55 66
77 88 99
.
Matrix A - Matrix B:
-9 -18 -27
-36 -45 -54
-63 -72 -81


 */
package test3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                System.out.print("Enter matrix A index of [" + i + "][" + a + "]: ");
                A[i][a] = sc.nextInt();
            }
        }
        System.out.println("Matrix A is");
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                System.out.print(A[i][a] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                System.out.print("Enter matrix B index of [" + i + "][" + a + "]: ");
                B[i][a] = sc.nextInt();
            }
        }
        System.out.println("Matrix B is");
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 3; a++) {
                System.out.print(B[i][a] + " ");
            }
            System.out.println();
        }
        sc.close();

    }

    public static void Add(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
}