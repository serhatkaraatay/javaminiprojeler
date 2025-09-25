public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz");
        String sartlar = "Yurtdışı  Çıkış Kuralları...\n"
                + "Herhangi bir siyasi yasağınızın bulunmaması gerekiyor..\n"
                + " 15 Tl harç bedelini tam olarak yatırmanız gerekiyor..\n"
                +"Gideceğiniz bölgeye vizeninizin bulunması gerekiyor...";
        String mesaj = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor...";
        while(true) {
            System.out.println("**********************");
            System.out.println(sartlar);
            System.out.println("**********************");

            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor..");
            Thread.sleep(3000);//3 saniye beklemesini istiyoruz
            try {
                yolcu.yurtdisi_harci_kontrol();
            } catch (harcException e) {
                e.printStackTrace();
                continue;
            }
            System.out.println("Siyasi yasak kontrol ediliyor..");
            Thread.sleep(3000);
            try {
                yolcu.siyasi_yasak_kontrol();
            } catch (siyasiException e) {
                e.printStackTrace();
                continue;
            }
            System.out.println("Vize durumu kontrol ediliyor..");
            Thread.sleep(3000);
            try {
                yolcu.vize_durumu_kontrol();
            } catch (vizeException e) {
                e.printStackTrace();
                continue;
            }
            System.out.println("İşlemleriniz tamam yurtdışına çıkabilirsiniz");
            break;
        }
    }
}
