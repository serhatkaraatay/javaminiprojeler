import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Ahmet");
        queue.offer("Mehmet");
        queue.offer("Ayşe");
        queue.offer("Murat");
        queue.offer("Mustafa");
        queue.offer("Eren");
        Scanner input = new Scanner(System.in);
        System.out.println("Çıkacak pide sayısını giriniz: ");
        int pideSayisi = input.nextInt();

      //  int pideSayisi = 1 +random.nextInt(10); //1 ile 10 arasında random bir pide çıkacak
        while (pideSayisi >0 && !queue.isEmpty()){
            System.out.println("Almak istediği pide sayısı: ");
            int istenenPide = input.nextInt();
            if (istenenPide <= pideSayisi ) {
                System.out.println(queue.poll() +" " + istenenPide +  " pide aldı.");
                pideSayisi-= istenenPide;
                System.out.println("Kalan pide sayısı: " + pideSayisi);
            }
            else {
                System.out.println("Yeterli pide yok, lütfen bekleyin.");
                break;
            }
        }
    }
}
