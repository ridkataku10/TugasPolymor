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
public class RakyatMenyapa extends RakyatBerkenan {

    final double gajiPerBln = 5000000;
    final double lemburPerJam = 150000;
    int jamLembur;

    public void Bekerja(String nama, String alamat) {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Gaji total perBulan: Rp" + TotalGaji(jamLembur));

    }

    public double TotalGaji(int jamLembur) {
        return gajiPerBln + (lemburPerJam * jamLembur);

    }
    public void setLembur(int jamLembur){
        this.jamLembur = jamLembur;
    }
    public int getLembur(){
        return jamLembur;
    }

}
