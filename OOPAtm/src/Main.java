public class Main {

    public static void main(String[] args) {
        Hesap hesap = new Hesap("kullaniciAdi", "parola", 1000); // Hesap nesnesi oluşturuluyor.

        Atm atm = new Atm();
        atm.calis(hesap); // Hesap nesnesi ATM'ye gönderiliyor.
    }
}