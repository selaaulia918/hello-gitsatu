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
public class Perulangan1 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int a;
        System.out.print("Masukkan Bilangan A = ");
        a = sc.nextInt();
        for (int i = 0; i < 4; i++ ){
            a = a - 3;
            System.out.println(a);
        } 
        if (a % 2 == 0){
            System.out.println("Bilangan A adalah bilangan genap");
        } else {
            System.out.println("Bilangan A adalah bilangan ganjil");
        }
    }
}
