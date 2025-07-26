import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler...\n"
                +"1. Kare Alan Hesapla\n"
                +"2. Üçgen Alan Hesapla\n"
                +"3. Daire Alan Hesapla\n"
                +"Çıkış : q";
        while (true) {
            System.out.println(islemler);
            System.out.println("Hangi şeklin alanını hesaplamak istersin : ");
            String cevap = scanner.nextLine();
            Sekil sekil = null;
            if(cevap.equals("q")){
                System.out.println("Çıkış Yapılıyor..");
                break;
            }
            else if(cevap.equals("1")){
                System.out.println("Karenin kenarını giriniz : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                sekil = new Kare("kare1",kenar);
                sekil.alan_hesapla();
            }
            else if(cevap.equals("2")){
                System.out.println("Üçgenin birinci kenarı: ");
                int a = scanner.nextInt();
                System.out.println("Üçgenin ikinci kenarı: ");
                int b = scanner.nextInt();
                System.out.println("Üçgenin üçüncü kenarı: ");
                int c = scanner.nextInt();
                scanner.nextLine();
                sekil = new Ucgen("Ucgen 1",a,b,c);
                sekil.alan_hesapla();
            }
            else if(cevap.equals("3")){
                System.out.println("Dairenin yarıçapını giriniz: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                sekil = new Daire("Daire 1",yaricap);
                sekil.alan_hesapla();
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}
