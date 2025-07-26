public class Problem {
    //iki inner class olacak ikisi de static
    public static class Matematik{
        public static void daire_alan(int yaricap) {
            System.out.println("Dairenin alanı : " + (yaricap*yaricap*Math.PI));
        }
        public static void ucgen_cevresi(int kenar1,int kenar2,int kenar3) {
            System.out.println("Üçgen çevresi : " + (kenar1+kenar2+kenar3));
        }

    }
    public static class Fizik{
        public static void ic_carpim(Vektor vek1, Vektor vek2) {
            int ic_carpim= vek1.getI()*vek2.getI()+vek1.getJ()* vek2.getJ() + vek1.getK()*vek2.getK();
            System.out.println(vek1.getIsim() + " ile " + vek2.getIsim() +" çarpımı : "+ic_carpim);
        }
    }
}
