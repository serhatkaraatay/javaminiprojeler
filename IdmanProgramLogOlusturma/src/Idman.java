public class Idman {
    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;
    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;

    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    public void hareket_yap(String hareket_turu,int sayi){
        if(hareket_turu.equals("Burpee")){
            burpee_yap(sayi);
        }
        else if(hareket_turu.equals("Pushup")){
            pushup_yap(sayi);
        }
        else if(hareket_turu.equals("Situp")){
            situp_yap(sayi);
        }
        else if(hareket_turu.equals("Squat")){
            squat_yap(sayi);
        }
        else {
            System.out.println("Geçersiz hareket türü.");
        }
    }
    public void burpee_yap(int sayi){
        if(burpee_sayisi == 0){
            System.out.println("Burpee hareketi kalmadı .");
        }
        if(burpee_sayisi-sayi<0){
            System.out.println("hedeflediğin burpee sayısından daha fazla hareket yaptın tebrikler!");
            burpee_sayisi = 0;
            System.out.println("Kalan Burpee sayısı: " + burpee_sayisi);
        }
        else{
            burpee_sayisi -= sayi;
            System.out.println("Kalan Burpee sayısı: " + burpee_sayisi);
        }
    }
    public void pushup_yap(int sayi){
        if(pushup_sayisi == 0){
            System.out.println("Pushup hareketi kalmaı .");
        }
        if(pushup_sayisi-sayi<0){
            System.out.println("hedeflediğin pushup sayısından daha fazla hareket yaptın tebrikler!");
            pushup_sayisi = 0;
            System.out.println("Kalan Pushup sayısı: " + pushup_sayisi);
        }
        else{
            pushup_sayisi -= sayi;
            System.out.println("Kalan Pushup sayısı: " + pushup_sayisi);
        }
    }
    public void situp_yap(int sayi){
        if(situp_sayisi == 0){
            System.out.println("Situp hareketi kalmaı .");
        }
        if(situp_sayisi-sayi<0){
            System.out.println("hedeflediğin situp sayısından daha fazla hareket yaptın tebrikler!");
            situp_sayisi = 0;
            System.out.println("Kalan Situp sayısı: " + situp_sayisi);
        }
        else{
            situp_sayisi -= sayi;
            System.out.println("Kalan Situp sayısı: " + situp_sayisi);
        }
    }
    public void squat_yap(int sayi){
        if(squat_sayisi == 0){
            System.out.println("Squat hareketi kalmaı .");
        }
        if(squat_sayisi-sayi<0){
            System.out.println("hedeflediğin squat sayısından daha fazla hareket yaptın tebrikler!");
            squat_sayisi = 0;
            System.out.println("Kalan Squat sayısı: " + squat_sayisi);
        }
        else{
            squat_sayisi -= sayi;
            System.out.println("Kalan Squat sayısı: " + squat_sayisi);
        }
    }
    public boolean idman_bitti(){
        return(burpee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
    }
}