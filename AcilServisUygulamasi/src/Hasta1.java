public class Hasta1 implements Comparable<Hasta1> {
    // Öncelik sıralaması: apandisit (1), yanık (2), baş ağrısı (3), diğer (4)
    //Alternatif Hasta sınıfı
    @Override
    public int compareTo(Hasta1 o) {
        if (this.oncelik < o.oncelik) {
            return -1;
        } else if (this.oncelik > o.oncelik) {
            return 1;
        } else {
            return 0;
        }
    }

    private String name;
    private String sikayet;
    private int oncelik;

    public Hasta1(String name, String sikayet) {
        this.name = name;
        this.sikayet = sikayet;
        if (this.sikayet.equals("apandisit")) {
            this.oncelik = 1;
        } else if (this.sikayet.equals("yanık")) {
            this.oncelik = 2;
        } else if (this.sikayet.equals("baş ağrısı")) {
            this.oncelik = 3;
        } else {
            this.oncelik = 4;
        }
    }

    @Override
    public String toString() {
        return "Hasta ismi= '" + name + '\'' +
                ", sikayet='" + sikayet + '\'' +
                ", oncelik=" + oncelik;
    }
}
