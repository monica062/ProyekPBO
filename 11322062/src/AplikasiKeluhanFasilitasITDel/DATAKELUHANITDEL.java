/*
Nama : Monica Silaban
NIM  : 11322062
Kelas: D3TI-02
*//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AplikasiKeluhanFasilitasITDel;

/**
 *
 * @author ASUS
 */

public interface DATAKELUHANITDEL {
    int LAMA_PROSES_KELUHAN = 7;
    String STATUS_KELUHAN = "Requested";
    String TANGGAL_REQUEST_KELUHAN = "Tgl/bln/thn ujian PBO saat ini";

    void memprosesKeluhan(String keluhan);

    void tinjauKeluhan(String keluhan, int jenisKeluhan);

    void tolakKeluhan(String tanggalRequest, String alasanTolak);

    String berkendara();
}
