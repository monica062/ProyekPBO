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
public class AplikasiKeluhanFasilitasITDel {
    private int versi;
    private String nama;
    private Mahasiswa[] mahasiswaArray;
    private Dosen[] dosenArray;
    private Staf[] stafArray;

    public AplikasiKeluhanFasilitasITDel() {
    }

    public AplikasiKeluhanFasilitasITDel(int versi, String nama) {
        this.versi = versi;
        this.nama = nama;
        this.mahasiswaArray = new Mahasiswa[1];
        this.dosenArray = new Dosen[1];
        this.stafArray = new Staf[1];
    }

    public int getVersi() {
        return versi;
    }

    public void setVersi(int versi) {
        this.versi = versi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa addMahasiswa(String nama, String tempatLahir, String tglLahir, String nim, String prodi) {
        Mahasiswa mahasiswa = new Mahasiswa(nama, tempatLahir, tglLahir, nim, prodi);
        for (int i = 0; i < mahasiswaArray.length; i++) {
            if (mahasiswaArray[i] == null) {
                mahasiswaArray[i] = mahasiswa;
                return mahasiswa;
            }
        }
        return null;
    }

    public Dosen addDosen(String nama, String tempatLahir, String tglLahir, String nidn) {
        Dosen dosen = new Dosen(nama, tempatLahir, tglLahir, nidn);
        for (int i = 0; i < dosenArray.length; i++) {
            if (dosenArray[i] == null) {
                dosenArray[i] = dosen;
                return dosen;
            }
        }
        return null;
    }

    public Staf addStaf(String nama, String tempatLahir, String tglLahir, String nip, String unitKerja) {
        Staf staf = new Staf(nama, tempatLahir, tglLahir, nip, unitKerja);
        for (int i = 0; i < stafArray.length; i++) {
            if (stafArray[i] == null) {
                stafArray[i] = staf;
                return staf;
            }
        }
        return null;
    }

    public void showMahasiswa(Mahasiswa mahasiswa) {
        System.out.println(mahasiswa.toString());
    }

    public void showDosen(Dosen dosen) {
        System.out.println(dosen.toString());
    }

    public void showStaf(Staf staf) {
        System.out.println(staf.toString());
    }

    public void showAllMahasiswa() {
        for (Mahasiswa mahasiswa : mahasiswaArray) {
            if (mahasiswa != null) {
                System.out.println(mahasiswa.toString());
                System.out.println();
            }
        }
    }

    public void showAllDosen() {
        for (Dosen dosen : dosenArray) {
            if (dosen != null) {
                System.out.println(dosen.toString());
                System.out.println();
            }
        }
    }

    public void showAllStaf() {
        for (Staf staf : stafArray) {
            if (staf != null) {
                System.out.println(staf.toString());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        AplikasiKeluhanFasilitasITDel aplikasi = new AplikasiKeluhanFasilitasITDel(1, "Aplikasi Keluhan IT Del");
        
        Dosen dosen1 = aplikasi.addDosen("Rudy Chandra", "Jakarta", "04-04-1970", "NIDN12345");

        Mahasiswa mahasiswa1 = aplikasi.addMahasiswa("Monica Silaban", "Medan", "11-08-2004", "11322062", "D3TI");

        Staf staf1 = aplikasi.addStaf("Apriyanti Sijabat", "Laguboti", "07-07-1985", "NIP123", "TA");

        aplikasi.showAllMahasiswa();
        aplikasi.showAllDosen();
        aplikasi.showAllStaf();
    }
}
