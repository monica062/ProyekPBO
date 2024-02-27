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

class CustomerService extends Pegawai {
    private String unitLayanan;

    public CustomerService() {
    }

    public CustomerService(int nip, String nama, String jabatan, String unitLayanan) {
        setNip(nip);
        setNama(nama);
        setJabatan(jabatan);
        this.unitLayanan = unitLayanan;
    }

    public String getUnitLayanan() {
        return unitLayanan;
    }

    public void setUnitLayanan(String unitLayanan) {
        this.unitLayanan = unitLayanan;
    }

    @Override
    public Kendaraan berkendara() {
        System.out.println(getNip() + " menggunakan kendaraan: Motor");
        return Kendaraan.Motor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nUnit Layanan: " + unitLayanan;
    }

}
