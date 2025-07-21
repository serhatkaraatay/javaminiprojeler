import java.util.Scanner;

public class Test {
    private static Scanner sc = new Scanner(System.in);
    private static Sarkicilar sarkicilar = new Sarkicilar(); //Composition yapılmıs oldu (başka bir objeyi classa ekledik)
    public static void islemleri_bastir(){
        System.out.println("\t 0 - İşlemleri Görüntüle");
        System.out.println("\t 1 - Şarkıcıları Görüntüle");
        System.out.println("\t 2 - Şarkıcı Ekle");
        System.out.println("\t 3 - Şarkıcı Güncelle");
        System.out.println("\t 4 - Şarkıcı Sil");
        System.out.println("\t 5 - Şarkıcı Ara");
        System.out.println("\t 6 - Uygulamadan Çık");
    }
    public static void goruntule(){
        sarkicilar.sarkicilari_bastir();
    }
    public static void sarkici_ekle(){
        System.out.println("Eklemek istediğiniz şarkıcnın ismi : ");
        String isim = sc.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }
    public static void sarkici_guncelle(){
        System.out.println("Güncellemek istediiniz pozisyon(1,2,3) :  ");
        int pozisyon = sc.nextInt();
        sc.nextLine();
        System.out.println(" Güncellemek istediğiniz şarkıcının ismi: ");
        String isim = sc.nextLine();
        sarkicilar.sarkici_guncelle(isim, pozisyon-1);
    }
    public static void sarkici_sil() {
        System.out.println("Hangi Pozisyodnaki şarkıcıyı silmek istiyorsunuz(1,2,3) : ");
        int pozisyon = sc.nextInt();
        sarkicilar.sarkici_sil(pozisyon-1);
    }
    public static void ara(){
        System.out.println("Aramak İstediğiniz Şarkıcı İsmi : ");
        String isim = sc.nextLine();
        sarkicilar.sarkici_ara(isim);
    }
    public static void main(String[] args) {
        System.out.println("\t Şarkıcı Uygulamasına Hoşheldiniz...");
        islemleri_bastir();
        boolean cikis = false;//döngüye devam edilmesine karar vermek için
        int islem;//kullanıcıdan alınacak işlem değişkeni
        while (!cikis) {
            System.out.println("Bir İşlem Seçiniz: ");
            islem = sc.nextInt();//nextIntden sonra bir yerde nextLine alınacak olduğunda hata verir
            sc.nextLine();
            switch (islem) {
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4:
                    sarkici_sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan Çıkış Yapılıyor...");
                    break;

            }
        }
    }
}
