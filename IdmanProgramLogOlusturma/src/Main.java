import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programına hoş geldiniz!");
        String idmanlar = "Geçerli idman türleri:\n" +
                "1. Burpee\n" +
                "2. Pushup\n" +
                "3. Situp\n" +
                "4. Squat\n" +
                "Lütfen idman türünü seçin (1-4):";
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun");
        System.out.print("Burpee sayısı: ");
        int burpee_sayisi = scanner.nextInt();
        System.out.print("Pushup sayısı: ");
        int pushup_sayisi = scanner.nextInt();
        System.out.print("Situp sayısı: ");
        int situp_sayisi = scanner.nextInt();
        System.out.print("Squat sayısı: ");
        int squat_sayisi = scanner.nextInt();
        scanner.nextLine(); // Yeni satır karakterini temizle
        Idman idman = new Idman(burpee_sayisi, pushup_sayisi, situp_sayisi, squat_sayisi);
        System.out.println("İdman programınız oluşturuldu!");
        int i = 1;
        try (FileWriter writer = new FileWriter("idmanlog.txt")) {
            writer.write("İdman Programı\n");
            writer.write("Burpee: " + idman.getBurpee_sayisi() + "\n");
            writer.write("Pushup: " + idman.getPushup_sayisi() + "\n");
            writer.write("Situp: " + idman.getSitup_sayisi() + "\n");
            writer.write("Squat: " + idman.getSquat_sayisi() + "\n");
            writer.write("-----------------------\n");
            while (idman.idman_bitti() == false) {
                System.out.println("Hareket türünü seçiniz (burpee , pushup, situp, squat):");
                String tur = scanner.nextLine();
                System.out.println("Kaç adet " + tur + " yapmak istiyorsunuz?");
                int sayi = scanner.nextInt();
                scanner.nextLine(); // Yeni satır karakterini temizle
                idman.hareket_yap(tur, sayi);
                writer.write(i + ". Hareket Türü: " + tur + ", Sayı: " + sayi + "\n");
                i++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Tebrikler! İdman programınızı tamamladınız.");
    }
}