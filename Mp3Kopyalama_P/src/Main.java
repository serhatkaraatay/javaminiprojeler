import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Integer> icerik = new ArrayList<Integer>();

    public static void dosyaOku() {
        try {
            FileInputStream file = new FileInputStream("mars.mp3");//dosya yolu
            int oku;
            while ((oku = file.read()) != -1) {
                icerik.add(oku); // dosya icerigini arrayliste atiyoruz

            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı ");
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası ");
        }

    }

    public static void kopyala(String dosyaAdi) {
        try {
            FileOutputStream output = new FileOutputStream(dosyaAdi);
            for (int deger : icerik) {
                output.write(deger); // arraylistteki degerleri yeni dosyaya yaziyoruz
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        dosyaOku();
        long baslangic = System.currentTimeMillis();//kopyalama islemi baslangic zamani
        kopyala("mars_kopya2.mp3");//kopyalanacak dosya adi
        kopyala("mars_kopya3.mp3");
        kopyala("mars_kopya4.mp3");
        long bitis = System.currentTimeMillis();//kopyalama islemi bitis zamani
        System.out.println("3 Dosyanın Kopyalama süresi: " + (bitis - baslangic)/1000 + " saniye");
    }
}
