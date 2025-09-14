import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<Hasta> hastaListesi = new PriorityQueue<Hasta>();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Hasta eklemek için 1, hasta listesi görmek için 2, çıkış için 0'a basınız: ");
            int choice = input.nextInt();
            input.nextLine(); // Boş satırı temizle
            switch (choice) {
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                case 1:
                    System.out.println("Adınızı giriniz: ");
                    String name = input.nextLine();
                    System.out.println("Şikayetinizi giriniz: ");
                    String sikayet = input.nextLine();
                    Hasta hasta = new Hasta(name, sikayet);
                    System.out.println("Yeni hasta eklendi: " + name + ", Şikayet: " + sikayet);
                    hastaListesi.offer(hasta);
                    break;
                case 2:
                    System.out.println("Hasta listesi (öncelik sırasına göre):");
                    while (!hastaListesi.isEmpty()) {
                        System.out.println(hastaListesi.poll());

                    }
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
                    break;
            }


        }

    }
}
