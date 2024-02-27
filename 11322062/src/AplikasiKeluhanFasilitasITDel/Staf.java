/*
Nama : Monica Silaban
NIM  : 11322062
Kelas: D3TI-02
*/
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiKeluhanFasilitasITDel;

/**
 *
 * @author ASUS
 */
public class Staf extends HUMANRESOURCE {
    private String nip;
    private String unitKerja;

    public Staf() {
    }

    public Staf(String nama, String tempatLahir, String tglLahir, String nip, String unitKerja) {
        this.setNama(nama);
        this.setTempatLahir(tempatLahir);
        this.setTglLahir(tglLahir);
        this.nip = nip;
        this.unitKerja = unitKerja;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() + "\nTempat Lahir: " + getTempatLahir() + "\nTgl Lahir: " + getTglLahir() + "\nNIP: " + nip + "\nUnit Kerja: " + unitKerja;
    }
}
