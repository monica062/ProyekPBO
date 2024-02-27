/*
Nama : Monica Silaban
NIM  : 11322062
Kelas: D3TI-02
*/
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
class Satpam extends Pegawai {
    public Satpam() {
    }

    public Satpam(int nip, String nama, String jabatan) {
        setNip(nip);
        setNama(nama);
        setJabatan(jabatan);
    }

    public Kendaraan berkendara() {
        System.out.println(getNip() + " menggunakan kendaraan: -");
        return null;
    }
}
