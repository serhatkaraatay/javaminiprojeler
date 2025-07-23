import java.util.Scanner;

public class Yolcu implements YurtdisiKurallari {
    private int harc;
    private boolean siyasi_yasak;
    private boolean vize_durumu;
    public Yolcu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yatırılan harç bedeli : ");
        this.harc = sc.nextInt();
        sc.nextLine();
        System.out.println("Siyasi yasağınız bulunuyor mu ?");
        String cevap = sc.nextLine();
        if(cevap.equals("evet")) {
            this.siyasi_yasak = true;
        }
        else {
            this.siyasi_yasak = false;
        }
        System.out.println("Vizeniz bulunuyor mu ?");
        String cevap2 = sc.nextLine();
        if(cevap2.equals("evet")) {
            this.vize_durumu = true;
        }
        else {
            this.vize_durumu = false;
        }
    }
    @Override
    public boolean yurtdisi_harci_kontrol() {
        if(this.harc<15){
            System.out.println("Lütfen yurtdışı çıkış harcını tam yatırınız");
            return false;
        }
        else {
            System.out.println("Yurtdışı harcı işlemi tamam");
            return true;
        }
    }

    @Override
    public boolean siyasi_yasak_kontrol() {
        if(this.siyasi_yasak){
            System.out.println("Siyasi yasağınız bulunuyor yurtdısına çıkkış yapamazsınız");
            return false;
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor");
            return true;
        }
    }

    @Override
    public boolean vize_durumu_kontrol() {
        if(this.vize_durumu){
            System.out.println("Vize işlemi tamam");
            return true;
        }
        else {
            System.out.println("Vizeniz bulunmamaktadır");
            return false;
        }
    }


}
