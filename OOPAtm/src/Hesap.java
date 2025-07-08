public class Hesap {
    private String kullaniciAdi;
    private String  parola;
    private int bakiye;

    public Hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public void paraYatir(int miktar){
        if(miktar<0){
            System.out.println("Negatif miktar girilemez");
        }
        else{
            bakiye += miktar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
        }
    }
    public void paraCek(int miktar){
        if(miktar>bakiye){
            System.out.println("Yetersiz bakiye");
        }
        else{
            bakiye -= miktar;
            System.out.println("Yeni bakiyeniz: " + bakiye);
        }
    }
    public void bilgileriGoster(){
        System.out.println("Hesap Bilgileri:");
        System.out.println("Kullanici Adi: " + kullaniciAdi);
        System.out.println("Parola: " + parola);
        System.out.println("Bakiye: " + bakiye);
    }
}
