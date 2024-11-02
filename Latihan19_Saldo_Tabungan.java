/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_LATIHAN_PERTEMUAN_6;

/**
 *
 * @author ACER
 * NAMA : M YASIR ILHAM N
 * KELAS : PBO1
 * NIM : 23215040
 * DESKRIPSI PROGRAM : Membuat Program Saldo Tabungan
 */
public class Latihan19_Saldo_Tabungan {
 
    public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bungaBulanan = 0.15; // 15%
        int lamaBulan = 6;

        System.out.println("Saldo Awal: Rp. " + saldoAwal);
        System.out.println("Bunga/Bulan: 15%");
        System.out.println("Lama (bulan): " + lamaBulan);
        System.out.println();

        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal += saldoAwal * bungaBulanan;
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", i, saldoAwal);
        }
    }
}
