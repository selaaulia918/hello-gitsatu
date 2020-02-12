/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class perulangan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double saldo, bunga;
        System.out.println("========Bank Anda========");
        System.out.println("Bunga = 2%");
        System.out.println("Waktu = 12 bulan");
        System.out.print("Saldo awal Anda  : Rp ");
        saldo = sc.nextInt();
        System.out.println("Saldo bulan-1    : Rp " + saldo);
        for (int i = 2; i <= 12; i++){
            bunga = saldo * 2 / 100;
            saldo = saldo + bunga;
            System.out.println("Saldo bulan ke-" + (i) + " : Rp " + saldo);
        }
        
    }
}
