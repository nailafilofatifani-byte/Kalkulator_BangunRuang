package bangunruang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MASUKKAN NILAI BANGUN RUANG ===");

        // Input Kubus
        System.out.print("Masukkan panjang sisi kubus : ");
        double sisi = scanner.nextDouble();
        BangunRuang kubus = new Kubus(sisi);

        // Input Tabung
        System.out.print("Masukkan jari-jari tabung  : ");
        double rTabung = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung     : ");
        double tTabung = scanner.nextDouble();
        BangunRuang tabung = new Tabung(rTabung, tTabung);

        // Input Kerucut
        System.out.print("Masukkan jari-jari kerucut : ");
        double rKerucut = scanner.nextDouble();
        System.out.print("Masukkan tinggi kerucut    : ");
        double tKerucut = scanner.nextDouble();
        BangunRuang kerucut = new Kerucut(rKerucut, tKerucut);

        // Menampilkan Hasil Perhitungan
        System.out.println("\n========================================");
        System.out.println("          HASIL PERHITUNGAN OOP         ");
        System.out.println("========================================");

        // Kubus
        System.out.println("1. Kubus");
        System.out.printf("   - Volume         : %.2f\n", kubus.hitungVolume());
        System.out.printf("   - Luas Permukaan : %.2f\n", kubus.hitungLuasPermukaan());

        // Tabung
        System.out.println("\n2. Tabung");
        System.out.printf("   - Volume         : %.2f\n", tabung.hitungVolume());
        System.out.printf("   - Luas Permukaan : %.2f\n", tabung.hitungLuasPermukaan());

        // Kerucut
        System.out.println("\n3. Kerucut");
        System.out.printf("   - Volume         : %.2f\n", kerucut.hitungVolume());
        System.out.printf("   - Luas Permukaan : %.2f\n", kerucut.hitungLuasPermukaan());

        scanner.close();
    }
}