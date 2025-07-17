import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Polymorphism kullanarak Beyblade Programı
        System.out.println("Beyblade Programına Hoşgeldiniz..");
        System.out.println("Çıkış için Q'ya Basınız..");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hangi Beyblade'i Üretmek İstiyorsunuz ? ");
            String isim = scanner.nextLine();
            if (isim.equals("q")) {
                System.out.println("Çıkış Yapılıyor..");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beyblade_uret(isim);
            if(beyblade == null) {
                System.out.println("Lütfen Geçerli Bir isim Giriniz.");
            }
            else {
                beyblade.bilgileri_goster();
                beyblade.saldir();
                beyblade.kutsal_canavar_ortaya_cikar();
            }
            }
        }
    }
}
