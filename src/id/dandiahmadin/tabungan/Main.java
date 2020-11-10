/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.tabungan;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi Tabungan dengan pendekatan object oriented
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal : ");
        Tabungan tabungan1 = new Tabungan(input.nextInt());
        
        System.out.print("Jumlah uang yang diambil : ");
        System.out.println("Saldo Anda Sekarang : " + tabungan1.ambilUang(input.nextInt()));
    }
}
