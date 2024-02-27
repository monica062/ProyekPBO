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
public class Dosen extends HUMANRESOURCE {
    private String nidn;

    public Dosen() {
    }

    public Dosen(String nama, String tempatLahir, String tglLahir, String nidn) {
        this.setNama(nama);
        this.setTempatLahir(tempatLahir);
        this.setTglLahir(tglLahir);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() + "\nTempat Lahir: " + getTempatLahir() + "\nTgl Lahir: " + getTglLahir() + "\nNIDN: " + nidn;
    }
}
