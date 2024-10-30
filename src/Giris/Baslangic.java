package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ders notlarını alıyoruz
        System.out.print("Matematik notunu girin: ");
        int matematik = scanner.nextInt();

        System.out.print("Türkçe notunu girin: ");
        int turkce = scanner.nextInt();

        System.out.print("Fizik notunu girin: ");
        int fizik = scanner.nextInt();

        System.out.print("Kimya notunu girin: ");
        int kimya = scanner.nextInt();

        System.out.print("Biyoloji notunu girin: ");
        int biyoloji = scanner.nextInt();

        System.out.print("Müzik notunu girin: ");
        int muzik = scanner.nextInt();

        // Ortalama hesaplama
        double ortalama = (matematik + turkce + fizik + kimya + biyoloji + muzik) / 6.0;

        // Sonucu ternary operatör ile ekrana yazdırma
        String sonuc = ortalama >= 60 ? "Sınıfı geçti" : "Sınıfta kaldı";

        System.out.println("Ortalama: " + ortalama);
        System.out.println(sonuc);

        scanner.close();
    }
}

