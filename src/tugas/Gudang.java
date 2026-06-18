/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author liye
 */
import java.util.ArrayList;
import java.io.*;

public class Gudang {

    private ArrayList<Barang> daftar = new ArrayList<>();
    private String namaBerkas;

    public Gudang(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public void tambahBarang(Barang barang) {
        daftar.add(barang);
    }

    public void tampilkanSemua() {
        System.out.println("=== DAFTAR BARANG ===");

        for (int i = 0; i < daftar.size(); i++) {
            System.out.println((i + 1) + ". " + daftar.get(i).info());
        }
    }

    public void simpanKeBerkas() {
        try (PrintWriter penulis =
                new PrintWriter(new FileWriter(namaBerkas))) {

            for (Barang b : daftar) {
                penulis.println(b.keBaris());
            }

            System.out.println("Data berhasil disimpan.");

        } catch (IOException e) {
            System.out.println("Gagal menyimpan: "
                    + e.getMessage());
        }
    }

    public void muatDariBerkas() {

        daftar.clear();

        try (BufferedReader pembaca =
                new BufferedReader(new FileReader(namaBerkas))) {

            String baris;

            while ((baris = pembaca.readLine()) != null) {

                String[] bagian = baris.split(";");

                if (bagian.length == 3) {

                    String nama = bagian[0];
                    double harga = Double.parseDouble(bagian[1]);
                    int stok = Integer.parseInt(bagian[2]);

                    daftar.add(
                        new Barang(nama, harga, stok)
                    );
                }
            }

            System.out.println("Data berhasil dimuat.");

        } catch (IOException e) {
            System.out.println("Gagal memuat: "
                    + e.getMessage());
        }
    }

    public double totalNilai() {

        double total = 0;

        for (Barang b : daftar) {
            total += b.getHarga() * b.getStok();
        }

        return total;
    }
}
