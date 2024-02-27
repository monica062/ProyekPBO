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
public class Mahasiswa extends HUMANRESOURCE {
    private String nim;
    private String prodi;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String tempatLahir, String tglLahir, String nim, String prodi) {
        this.setNama(nama);
        this.setTempatLahir(tempatLahir);
        this.setTglLahir(tglLahir);
        this.nim = nim;
        this.prodi = prodi;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return "Nama: " + getNama() + "\nTempat Lahir: " + getTempatLahir() + "\nTgl Lahir: " + getTglLahir() + "\nNIM: " + nim + "\nProdi: " + prodi;
    }
}


