import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String harfNotuHesapla(String isim, int vize1, int vize2, int finalnot) {
        String cikti = "";
        double toplamnot = (vize1 * 0.3) + (vize2 * 0.3) + (finalnot * 0.4);
        if (toplamnot >= 90) {
            cikti = isim + " AA ile gecti";
        } else if (toplamnot >= 85) {
            cikti = isim + " BA ile gecti";
        } else if (toplamnot >= 80) {
            cikti = isim + " BB ile gecti";
        } else if (toplamnot >= 75) {
            cikti = isim + " CB ile gecti";
        } else if (toplamnot >= 70) {
            cikti = isim + " CC ile gecti";
        } else if (toplamnot >= 65) {
            cikti = isim + " DC ile gecti";
        } else if (toplamnot >= 60) {
            cikti = isim + " DD ile gecti";
        } else if (toplamnot >= 55) {
            cikti = isim + " FD ile gecti";
        } else {
            cikti = isim + " FF ile kaldı";
        }
        return cikti;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("dosya.txt"));
             FileWriter writer = new FileWriter("sonuc.txt")) {
            while (scanner.hasNextLine()) {
                String ogrenci_bilgileri = scanner.nextLine();
                String[] bilgiler = ogrenci_bilgileri.split(",");
                String isim = bilgiler[0];
                int vize1 = Integer.valueOf(bilgiler[1]);// veya
                int vize2 = Integer.parseInt(bilgiler[2]);
                int finalnot = Integer.parseInt(bilgiler[3]);
                String sonuc = harfNotuHesapla(isim, vize1, vize2, finalnot);
                writer.write(sonuc + "\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
