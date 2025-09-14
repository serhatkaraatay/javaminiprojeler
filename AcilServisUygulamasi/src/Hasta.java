public class Hasta implements Comparable<Hasta> {
    private String name;
    private String sikayet;

    Hasta(String name, String sikayet) {
        this.name = name;
        this.sikayet = sikayet;
    }

    @Override
    public String toString() {
        return "Hasta ismi: " + this.name + ", Şikayeti: " + this.sikayet;
    }

    @Override
    public int compareTo(Hasta o) {
        int p1 = getPriority(this.sikayet);
        int p2 = getPriority(o.sikayet);
        return Integer.compare(p1, p2);// ilk hasta daha yüksek önceliğe sahipse negatif,
        // ikinci hasta daha yüksek önceliğe sahipse pozitif, eşitse sıfır döner.
    }

    private int getPriority(String sikayet) {
        switch (sikayet) {
            case "apandisit":
                return 1; // En yüksek öncelik
            case "yanık":
                return 2; // Orta öncelik
            case "baş ağrısı":
                return 3; // En düşük öncelik
            default:
                return 4; // Bilinmeyen şikayetler en düşük öncelik
        }
    }
}