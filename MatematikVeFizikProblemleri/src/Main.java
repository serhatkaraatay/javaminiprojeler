import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik ve Fizik Problemleri Programına Hoşgeldiniz ");
        String islemler = "İşlemler\n"
                +"1. Daire Alanı hesaplama\n"
                +"2. Üçgen Çevresi Hesaplama\n"
                +"3. 2 Vektörün İç Çarpımını Hesaplama\n"
                +"Çıkıi : q";
        while (true) {
            System.out.println(islemler);
            System.out.println("İşlemi Seçiniz: ");
            String islem = input.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor..");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Yarıçapı Giriniz : ");
                int yaricap = input.nextInt();
                input.nextLine();
                Problem.Matematik.daire_alan(yaricap);//static class içinde static metoot olduğu için direkt kullanabiliyoruz
            }
            else if (islem.equals("2")) {
                System.out.println("Kenar 1: ");
                int kenar1 = input.nextInt();
                System.out.println("Kenar 2: ");
                int kenar2 = input.nextInt();
                System.out.println("Kenar 3: ");
                int kenar3 = input.nextInt();
                input.nextLine();
                Problem.Matematik.ucgen_cevresi(kenar1, kenar2, kenar3);
            }
            else if (islem.equals("3")) {
                Vektor vektor = new Vektor("vektor1");
                Vektor vektor2 = new Vektor("vektor2");
                Problem.Fizik.ic_carpim(vektor, vektor2);
            }
            else {
                System.out.println("Geçersiz İşlem");
            }
        }
    }
}
