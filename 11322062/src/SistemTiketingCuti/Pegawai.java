/*
Nama : Monica Silaban
NIM  : 11322062
Kelas: D3TI-02
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemTiketingCuti;


/**
 *
 * @author ASUS
 */
abstract class Pegawai {
    private int nip;
    private String nama;
    private String jabatan;

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void checkIn() {
        System.out.println(getNip() + " sedang check-in.");
    }

    public void checkOut() {
        System.out.println(getNip() + " sedang check-out.");
    }

    public abstract Kendaraan berkendara();

    @Override
    public String toString() {
        return "NIP: " + nip + "\nNama: " + nama + "\nJabatan: " + jabatan;
    }
}
