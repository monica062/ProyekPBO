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
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SistemTiketingCuti {
    private String versi;
    private String nama;
    private static DATAKELUHANITDEL[] dataKeluhan;

    public SistemTiketingCuti(String versi, String nama, int maxDataKeluhan) {
        this.versi = versi;
        this.nama = nama;
        dataKeluhan = new DATAKELUHANITDEL[maxDataKeluhan];
    }

    public String getVersi() {
        return versi;
    }

    public void setVersi(String versi) {
        this.versi = versi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public DATAKELUHANITDEL addDataKeluhanITDel(int nip, String nama, String unitLayanan, String tipe) {
        DATAKELUHANITDEL data = null;
        if (tipe.equals("CustomerService")) {
            data = (DATAKELUHANITDEL) new CustomerService(nip, nama, "Customer Service", unitLayanan);
        } else if (tipe.equals("Satpam")) {
            data = (DATAKELUHANITDEL) new Satpam(nip, nama, "Satpam");
        }
        for (int i = 0; i < dataKeluhan.length; i++) {
            if (dataKeluhan[i] == null) {
                dataKeluhan[i] = data;
                break;
            }
        }
        return data;
    }

    public void showDataKeluhanITDel(DATAKELUHANITDEL[] data) {
        for (DATAKELUHANITDEL d : data) {
            if (d != null) {
                System.out.println(d.toString());
            }
        }
    }

    public static void mainMenu() {
        System.out.println("Selamat siang");
        System.out.println("Apa yang ingin Anda lakukan?");
        System.out.println("(1) Menambahkan proses keluhan");
        System.out.println("(2) Mencari status permintaan keluhan Anda");
        System.out.println("(3) Meninjau keluhan Anda");
        System.out.println("(4) Keluar");
        System.out.print("Silakan ketik angka 1, 2, 3, atau 4 lalu tekan Enter: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mainMenu();
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Masukkan NIP Anda: (Angka)");
                int nip = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan nama Anda: ");
                String nama = scanner.nextLine();
                System.out.println("Masukkan unit layanan Anda: ");
                String unitLayanan = scanner.nextLine();
                System.out.println("Masukkan tipe Anda (CustomerService atau Satpam):");
                String tipe = scanner.nextLine();
                CustomerService customerService = null;
                Satpam satpam = null;
                if (tipe.equals("CustomerService")) {
                    customerService = new CustomerService(nip, nama, "Customer Service", unitLayanan);
                } else if (tipe.equals("Satpam")) {
                    satpam = new Satpam(nip, nama, "Satpam");
                }
                if (customerService != null) {
                    System.out.println("Data Anda: ");
                    System.out.println(customerService.toString());
                } else if (satpam != null) {
                    System.out.println("\n");
                    System.out.println("Data Anda: ");
                    System.out.println("==========================================");
                    System.out.println(satpam.toString());
                    System.out.println("==========================================");
                }
                break;

            case 2:
                System.out.println("Masukkan NIP Anda: ");
                int nip2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan nama Anda: ");
                String nama2 = scanner.nextLine();
                System.out.println("Masukkan unit layanan Anda: ");
                String unitLayanan2 = scanner.nextLine();
                System.out.println("Masukkan tipe Anda (CustomerService atau Satpam): ");
                String tipe2 = scanner.nextLine();
                CustomerService customerService2 = null;
                Satpam satpam2 = null;
                if (tipe2.equals("CustomerService")) {
                    customerService2 = new CustomerService(nip2, nama2, "Customer Service", unitLayanan2);
                } else if (tipe2.equals("Satpam")) {
                    satpam2 = new Satpam(nip2, nama2, "Satpam");
                }
                if (customerService2 != null) {
                    System.out.println("Data Anda: ");
                    System.out.println(customerService2.toString());
                } else if (satpam2 != null) {
                    System.out.println("\n");
                    System.out.println("Data Anda: ");
                    System.out.println("==========================================");
                    System.out.println(satpam2.toString());
                    System.out.println("==========================================");
                }
                break;

            case 3:
                System.out.println("Masukkan NIP Anda: ");
                int nip3 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan nama Anda: ");
                String nama3 = scanner.nextLine();
                System.out.println("Masukkan unit layanan Anda: ");
                String unitLayanan3 = scanner.nextLine();
                System.out.println("Masukkan tipe Anda (CustomerService atau Satpam): ");
                String tipe3 = scanner.nextLine();
                CustomerService customerService3 = null;
                Satpam satpam3 = null;
                if (tipe3.equals("CustomerService")) {
                    customerService3 = new CustomerService(nip3, nama3, "Customer Service", unitLayanan3);
                } else if (tipe3.equals("Satpam")) {
                    satpam3 = new Satpam(nip3, nama3, "Satpam");
                }
                if (customerService3 != null) {
                    System.out.println("Data Anda: ");
                    System.out.println(customerService3.toString());
                } else if (satpam3 != null) {
                    System.out.println("\n");
                    System.out.println("Data Anda: ");
                    System.out.println("==========================================");
                    System.out.println(satpam3.toString());
                    System.out.println("==========================================");
                }
                break;

            case 4:
                System.out.println("Terima kasih telah menggunakan Sistem Tiketing Cuti. Selamat tinggal!");
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan pilih antara 1, 2, 3, atau 4.");
                break;
        }

        scanner.close();
    }
}