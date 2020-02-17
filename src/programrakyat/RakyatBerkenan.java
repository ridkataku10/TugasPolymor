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
public class RakyatBerkenan {

    String nama;
    String alamat;
    int umur;

    public RakyatBerkenan() {
        System.out.println("Sesuai pasal 27 UUD 1945 bahwa kita wajib ikut serta dalam bela negara");
    }

    public void Rebahan(String nama, String alamat, int umur) {
        nama = nama;
        alamat = alamat;
        umur = umur;
        System.out.println("Nama saudara: " + nama);
        System.out.println("Alamat: " + alamat);
        if (umur > 18) {
            System.out.println("Anda diwajibkan bekerja");
        } else {
            System.out.println("Anda belum cukup umur untuk kerja");
        }
       
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getUmur() {
        return umur;
    }

}
