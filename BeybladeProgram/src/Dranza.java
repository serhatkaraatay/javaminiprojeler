public class Dranza extends Beyblade {
    private String kutsal_canavar;

    public Dranza(String beybladeci, int saldiri_gucu, int donus_hizi, String kutsal_canavar) {
        super(beybladeci, saldiri_gucu, donus_hizi);
        this.kutsal_canavar = kutsal_canavar;
    }

    @Override
    public void kutsal_canavar_ortaya_cikar() {
        System.out.println(getBeybladeci() + " " + kutsal_canavar + " ı ortaya çıkarıyor....");
        System.out.println(getBeybladeci() + " ın Saldırısı : Alev Kılıcı ");
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Kutsal Canavar : " + kutsal_canavar);
    }
}
