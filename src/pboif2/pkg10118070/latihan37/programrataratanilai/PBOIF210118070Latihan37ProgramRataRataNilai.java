/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Ailyasha
 * Nama : Aufa Ilyasha
 * Nim : 10118070
 * Kelas : IF-2
 * Nama kelas : Pemrograman Berbasis OO
 */
public class PBOIF210118070Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in);
        Mahasiswa mahasiswa = new Mahasiswa();
        
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa.setJmlMahasiswa(scanner.nextInt());
        
        for(int i = 1; i<= mahasiswa.getJmlMahasiswa(); i++) {
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            mahasiswa.setNilai(scanner.nextDouble());
        }
        
        System.out.println("\nMaka, Rata-rata Nilainya adalah " +
                mahasiswa.hitungRataRata());
        
        System.out.println("Developed by : Aufa Ilyasha");
    }
    
}
