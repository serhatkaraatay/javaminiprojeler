import java.util.Scanner;

public class Atm {
    public void calis(Hesap hesap) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ATM'ye hos geldiniz!");
        System.out.println("Müşteri Girişi");
        System.out.println("-------------------");
        int girishakki = 3;
        while(true){
            if(login.login(hesap)) {
                System.out.println("Giriş başarılı!");
                break;
            }
            else {
                System.out.println("Giriş başarısız. Kalan giriş hakkı: " + (girishakki - 1));
            }
            if(girishakki == 0){
                System.out.println("Giriş hakkınız kalmadı. ATM'den çıkılıyor.");
                return;//metodu sonlandırır
            }
        }
        System.out.println("ATM Menüsü");
        System.out.println("1. Para Yatırma");
        System.out.println("2. Para Çekme");
        System.out.println("3. Bakiye Sorgulama");
        System.out.println("4. Çıkış");
        while(true){
            System.out.println("Lütfen bir işlem seçiniz (1-4): ");
            int secim = scanner.nextInt();
            scanner.nextLine();
            switch (secim) {
                case 1:
                    System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
                    int yatirmaMiktari = scanner.nextInt();
                    hesap.paraYatir(yatirmaMiktari);
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz miktarı giriniz: ");
                    int cekmeMiktari = scanner.nextInt();
                    hesap.paraCek(cekmeMiktari);
                    break;
                case 3:
                    hesap.bilgileriGoster();
                    break;
                case 4:
                    System.out.println("ATM'den çıkılıyor.");
                    return; // ATM'den çıkış yapılıyor
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyiniz.");
            }
        }

    }
}