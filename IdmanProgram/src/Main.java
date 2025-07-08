import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programına hoş geldiniz!");
        String idmanlar ="Geçerli idman türleri:\n" +
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
        while(idman.idman_bitti() == false) {
            System.out.println("Hareket türünü seçiniz (burpee , pushup, situp, squat):");
            String tur = scanner.nextLine();
            System.out.println("Kaç adet " + tur + " yapmak istiyorsunuz?");
            int sayi = scanner.nextInt();
            scanner.nextLine(); // Yeni satır karakterini temizle
            if(tur.equals("burpee")) {
                idman.burpee_yap(sayi);
            }
            else if(tur.equals("pushup")) {
                idman.pushup_yap(sayi);
            }
            else if(tur.equals("situp")) {
                idman.situp_yap(sayi);
            }
            else if(tur.equals("squat")) {
                idman.squat_yap(sayi);
            }
            else {
                System.out.println("Geçersiz hareket türü. Lütfen tekrar deneyin.");
                continue; // Geçersiz girişte döngüyü başa al
            }
        }
        System.out.println("Tebrikler! İdman programınızı tamamladınız.");
    }
}
