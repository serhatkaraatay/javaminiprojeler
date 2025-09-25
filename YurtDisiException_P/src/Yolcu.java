import java.util.Scanner;

class siyasiException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağınız bulunuyor...");
    }
}
class vizeException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Gideceğiniz Ülkeye Vizeniz bulunmamaktadır...");
    }
}
class harcException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("Yurtdışı çıkış harcını eksiksiz yatırınız...");
    }
}

public class Yolcu {
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
        this.siyasi_yasak = cevap.equals("evet");
        System.out.println("Vizeniz bulunuyor mu ?");
        String cevap2 = sc.nextLine();
        this.vize_durumu = cevap2.equals("evet");
    }

    public void yurtdisi_harci_kontrol () throws harcException {
        if (this.harc < 15) {
            throw new harcException(); //Checked exception oldu için throws eklenmeli
        } else {
            System.out.println("Yurtdışı harcı işlemi tamam");
        }
    }

    public void siyasi_yasak_kontrol() throws siyasiException {
        if (this.siyasi_yasak) {
            throw  new siyasiException();
        } else {
            System.out.println("Siyasi yasağınız bulunmuyor");
        }
    }

    public void vize_durumu_kontrol() throws vizeException {
        if (this.vize_durumu) {
            System.out.println("Vize işlemi tamam");
        } else {
            throw new vizeException();
        }
    }
}
