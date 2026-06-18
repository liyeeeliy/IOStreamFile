package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri {

    public static void main(String[] args) throws IOException {

        // Nomor 1
        File file = new File("laporan.txt");

        if (file.exists()) {
            System.out.println("File ada");
            System.out.println("Ukuran: " + file.length() + " byte");
        } else {
            System.out.println("File tidak ada");
        }

        // Nomor 2
        File folder = new File("arsip");

        if (folder.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat");
        } else {
            System.out.println("Folder arsip gagal dibuat");
        }

        // Nomor 3
        File sementara = new File("sementara.txt");

        sementara.createNewFile();

        System.out.println("Sebelum dihapus: " + sementara.exists());

        boolean berhasil = sementara.delete();

        System.out.println("File berhasil dihapus: " + berhasil);
        System.out.println("Sesudah dihapus: " + sementara.exists());
    }
}