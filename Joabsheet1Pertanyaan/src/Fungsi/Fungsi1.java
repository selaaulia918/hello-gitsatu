/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Fungsi1 {
    static Scanner sc = new Scanner (System.in);
    static int pilih, fibonaci[];
    public static void main(String[] args) {
        menu();
        pilihan();
    }
    static void menu(){
        System.out.println("==============DERET FIBONACI==============");
        System.out.println("1. Deret Fibonaci dengan Konsep Perulangan");
        System.out.println("2. Deret Fibonaci dengan Fungsi Rekursif");
        System.out.println("3. Keluar");
        System.out.println("------------------------------------------");
        System.out.print("Menu yang Anda pilih : ");
        pilih = sc.nextInt();
    }
    static void pilihan() {
        int a, b = 0;
        switch (pilih) {
            case 1:
                perulangan(b);
                break;
            case 2:
                System.out.print("Masukkan jumlah deret fibonacci : ");
                a = sc.nextInt();
                for (int i = 0; i < a; i++) {
                    System.out.print(fib(i) + " ");
                }
                System.out.println();
                menu();
                pilihan();
                break;
            case 3:
                System.out.println("==========================================");
                System.out.println("Terima Kasih Telah Menggunakan Program Ini");
                System.out.println("==========================================");
                System.exit(0);
            default:
                System.out.println("Menu yang Anda pilih tidak tersedia");
        }
    }

    static void perulangan(int b) {
        System.out.print("Masukkan jumlah deret fibonacci : ");
        b = sc.nextInt();

        fibonaci = new int[b];

        fibonaci[0] = 0;
        fibonaci[1] = 1;

        for (int i = 2; i < b; i++) {
            fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
        }
        for (int i = 0; i < b; i++) {
            System.out.print(fibonaci[i] + " ");
        }
        System.out.println();
        menu();
        pilihan();
    }

    static int fib(int a) {
        if (a == 0 || a == 1) {
            return (a);
        } else {
            return (fib(a - 1) + fib(a - 2));
        }
    }
}
