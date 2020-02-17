/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programrakyat;

import java.util.Scanner;

/**
 *
 * @author sistem
 */
public class KonvensiRakyat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RakyatBeraksi raksi = new RakyatBeraksi();
        Scanner p = new Scanner(System.in);

        int pilihhh;
        System.out.println("\nMasukkan namamu: ");
        raksi.setNama(p.nextLine());
        System.out.println("Mau pilih berapa banyak?");
        pilihhh = p.nextInt();

        System.out.println("\nSilahkan pilih raja di hatimu");
        System.out.println("1. BTS");
        System.out.println("2. International Soccer");
        System.out.println("3. Indo Artist");
        System.out.println("4. Komedian");
        System.out.println("5. TWICE");

        for (int i = 1; i <= pilihhh; i++) {
            System.out.println("Yang kupilih: ");
            raksi.setPilih(p.nextInt());

            System.out.println("Berapa persentase untuknya: ");
            raksi.setPersen(p.nextDouble());
            raksi.Pemilu(raksi.getNama(), raksi.getPilih(), raksi.getPersen());
        }

        System.out.println("\n");

        RakyatMenyapa rm = new RakyatMenyapa();
        Scanner x = new Scanner(System.in);
        int lembur;
        System.out.println("=============================");
        System.out.println("Nama rakyat yg bekerja:");
        rm.setNama(x.nextLine());

        System.out.println("Alamat rakyat tersebut:");
        rm.setAlamat(x.nextLine());

        System.out.println("Lembur sebanyak... jam");
        rm.setLembur(x.nextInt());

        rm.TotalGaji(rm.getLembur());
        System.out.println("=============================");
        rm.Bekerja(rm.getNama(), rm.getAlamat());

        System.out.println("\n");
        System.out.println("=============================");

        RakyatBerkenan rb = new RakyatBerkenan();
        Scanner u = new Scanner(System.in);
        System.out.println("Masukkan umur: ");
        rb.setUmur(u.nextInt());
        System.out.println("=============================");
        rb.Rebahan(raksi.getPilih(), rm.getAlamat(), rb.getUmur());
    }

}
