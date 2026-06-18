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
public class MainTugas {

    public static void main(String[] args) {

        // Array kategori
        String[] kategori = {
            "Makanan",
            "Minuman",
            "Elektronik"
        };

        System.out.println("=== KATEGORI ===");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(
                new Barang("Beras", 15000, 20));

        gudang.tambahBarang(
                new Barang("Gula", 18000, 15));

        gudang.tambahBarang(
                new Barang("Teh", 10000, 30));

        gudang.tambahBarang(
                new Barang("Lampu LED", 25000, 10));

        gudang.tambahBarang(
                new Barang("Kopi", 12000, 25));

        gudang.tampilkanSemua();

        System.out.println(
                "\nTotal Nilai Persediaan = "
                + gudang.totalNilai());

        gudang.simpanKeBerkas();

        System.out.println();

        // Membuktikan data tersimpan
        Gudang gudangBaru =
                new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        gudangBaru.tampilkanSemua();

        System.out.println(
                "\nTotal Nilai Persediaan = "
                + gudangBaru.totalNilai());
    }
}
