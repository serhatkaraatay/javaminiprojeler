import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi;
        String parola;
        System.out.print("Kullanici Adinizi Giriniz: ");
        kullaniciAdi = scanner.nextLine();
        System.out.println("Parolanizi giriniz: ");
        parola = scanner.nextLine();
        if(hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)) {
            return true;
        }else{
            System.out.println("Kullanici adi veya parola yanlis. Lutfen tekrar deneyiniz.");
            return false;
        }


    }
}
