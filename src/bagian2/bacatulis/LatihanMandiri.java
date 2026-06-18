/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LatihanMandiri {

    public static void main(String[] args) throws IOException {

        // Nomor 1
        FileWriter tulis = new FileWriter("hari.txt");

        tulis.write("Senin\n");
        tulis.write("Selasa\n");
        tulis.write("Rabu\n");
        tulis.write("Kamis\n");
        tulis.write("Jumat\n");

        tulis.close();

        System.out.println("=== Isi hari.txt ===");

        BufferedReader baca = new BufferedReader(new FileReader("hari.txt"));
        String baris;

        while ((baris = baca.readLine()) != null) {
            System.out.println(baris);
        }

        baca.close();

        // Nomor 2
        FileWriter tambah = new FileWriter("hari.txt", true);

        tambah.write("Sabtu\n");
        tambah.write("Minggu\n");

        tambah.close();

        System.out.println("\n=== Setelah Ditambahkan ===");

        baca = new BufferedReader(new FileReader("hari.txt"));

        while ((baris = baca.readLine()) != null) {
            System.out.println(baris);
        }

        baca.close();

        // Nomor 3
        baca = new BufferedReader(new FileReader("hari.txt"));

        int jumlahBaris = 0;

        while (baca.readLine() != null) {
            jumlahBaris++;
        }

        baca.close();

        System.out.println("\nJumlah baris dalam file: " + jumlahBaris);
    }
}