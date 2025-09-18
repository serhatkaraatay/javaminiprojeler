import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kumanda Programına Hoşgeldiniz...");
        Scanner input = new Scanner(System.in);
        String islemler = "İşlemler...\n"
                + "1. Kanal Ekle\n"
                + "2. Kanal Sil\n"
                + "3. Kanal Sayısını Öğrenme\n"
                + "4. Kanallara Bak\n"
                + "Çıkış için q'ya basın.";
        Kumanda kumanda = new Kumanda();
        System.out.println(islemler);
        while (true) {
            System.out.print("İşlemi Seçiniz: ");
            String islem = input.nextLine();
            switch (islem) {
                case "q":
                    System.out.println("Programdan çıkılıyor..");
                    return;
                case "1":
                    System.out.println("Eklenecek Kanal Adı Giriniz: ");
                    String kanal_adi = input.nextLine();
                    kumanda.kanalEkle(kanal_adi);
                    break;
                case "2":
                    System.out.println("Silmek istediğiniz kanal adını yazınız: ");
                    String kanal_adis = input.nextLine();
                    kumanda.kanalSil(kanal_adis);
                    break;
                case "3":
                    System.out.println("Toplam Kanal Sayısı : " + kumanda.kanalSayisi());
                    break;
                case "4":
                    kanallariGoster(kumanda);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz...");
            }
        }
    }

    public static void kanallariGoster(Kumanda kumanda) {
        if (kumanda.kanalSayisi() == 0) {
            System.out.println("Şu anda hiçbir kanal bulunmuyor...");
        } else {
            for (String kanal : kumanda) {
                System.out.println("Kanal : " + kanal);
            }
        }
    }
}
