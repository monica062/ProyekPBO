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
public class Laboran extends HUMANRESOURCE {
    private int nip;
    private String unitKerja;
    private String bidangKeahlian;

    public Laboran() {
    }

    public Laboran(String nama, String tempatLahir, String tglLahir, int nip, String unitKerja, String bidangKeahlian) {
        this.setNama(nama);
        this.setTempatLahir(tempatLahir);
        this.setTglLahir(tglLahir);
        this.nip = nip;
        this.unitKerja = unitKerja;
        this.bidangKeahlian = bidangKeahlian;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public String getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }

    public String getBidangKeahlian() {
        return bidangKeahlian;
    }

    public void setBidangKeahlian(String bidangKeahlian) {
        this.bidangKeahlian = bidangKeahlian;
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() + "\nTempat Lahir: " + getTempatLahir() + "\nTgl Lahir: " + getTglLahir() + "\nNIP: " + nip + "\nUnit Kerja: " + unitKerja + "\nBidang Keahlian: " + bidangKeahlian;
    }
}

