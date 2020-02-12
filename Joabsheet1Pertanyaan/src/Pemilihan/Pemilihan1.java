/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pemilihan;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Pemilihan1 {
    static int tugas, UTS, UAS, akhir;
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int nilaiTugas, nilaiUTS, nilaiUAS, NIM;
       String nama;
        System.out.println("=====PENGHITUNGAN NILAI AKHIR MAHASISWA======");
        System.out.println("*****Identitas Mahasiswa*****");
        System.out.print("Nama Siswa : ");
        nama = sc.nextLine();
        System.out.print("NIM        : ");
        NIM = sc.nextInt();
        System.out.println("*****Nilai Mahasiswa*****");
        System.out.print("Nilai Tugas : ");
        nilaiTugas = sc.nextInt();
        if (nilaiTugas < 0){
            System.out.println("Maaf nilai yang Anda masukkan kurang dari 0");
            System.exit(0);
        } else if (nilaiTugas >= 0 && nilaiTugas <= 100 ){
            tugas = 20 * nilaiTugas / 100;
        } else {
            System.out.println("Maaf nilai yang Anda masukkan lebih dari 100");
            System.exit(0);
        }
        System.out.print("Nilai UTS   : ");
        nilaiUTS = sc.nextInt();
        if (nilaiUTS < 0){
            System.out.println("Maaf nilai yang Anda masukkan kurang dari 0");
            System.exit(0);
        } else if (nilaiUTS >= 0 && nilaiUTS <= 100 ){
            UTS = 35 * nilaiUTS / 100;
        } else {
            System.out.println("Maaf nilai yang Anda masukkan lebih dari 100");
            System.exit(0);
        }
        System.out.print("Nilai UAS   : ");
        nilaiUAS = sc.nextInt();
        if (nilaiUAS < 0){
            System.out.println("Maaf nilai yang Anda masukkan kurang dari 0");
            System.exit(0);
        } else if (nilaiUAS >= 0 && nilaiUAS <= 100 ){
            UAS = 45 * nilaiTugas / 100;
        } else {
            System.out.println("Maaf nilai yang Anda masukkan lebih dari 100");
            System.exit(0);
        } 
        akhir = tugas + UTS + UAS;
        System.out.println("Nilai akhir mahasiswa : " + akhir);
    }
    
}
