/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programrakyat;

/**
 *
 * @author sistem
 */
public class RakyatBeraksi extends RakyatBerkenan {

    String pilih;
    double persentaseSuka;
    String apaya;

    public RakyatBeraksi() {
        System.out.println("=====================================================================");
        System.out.println("PENGUMUMAN BAHWA SESUNGGUHNYA KEBEBASAN ADALAH HAK SETIAP JIWA SANTUY");
        System.out.println("=====================================================================");
    }

    public void Pemilu(String nama, String pilih, double persentaseSuka) {
        nama = nama;
        pilih = pilih;
        persentaseSuka = persentaseSuka;
        System.out.println("Nama: " + nama + "||" + "Pilihan: " + pilih + "||" + "Persentase Menyukai: " + persentaseSuka + "%");
    }

    public void setPilih(int pilih) {

        if (pilih == 1) {
            apaya = "Kim Taehyung";
        }
        else if(pilih == 2) {
            apaya = "Neymar da Silva ";
        }
        else if (pilih == 3) {
            apaya = "Chelsea Islan";
        }
        else if (pilih == 4) {
            apaya = "Komeng";
        }
        else if (pilih == 5) {
            apaya = "Im Nayeon";
        }
        else {
            apaya = "Mungkin yg kamu cari sedang dicariin saat isi ulang nanti";
        }
        this.apaya = apaya;

    }

    public void setPersen(double persentaseSuka) {
        this.persentaseSuka = persentaseSuka;
    }

    public String getPilih() {
        return apaya;
    }

    public double getPersen() {
        return persentaseSuka;
    }


}
