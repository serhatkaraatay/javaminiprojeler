import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TreeMap kullanarak bir stringin içindeki harflerin frekansını bulma
        Scanner input = new Scanner(System.in);
        System.out.print("Bir string girin: ");
        String str = input.nextLine();
        Map<Character, Integer> frekans = new TreeMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (frekans.containsKey(c)) {
                frekans.replace(c, frekans.get(c) + 1);
            } else {
                frekans.put(c, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " kere geçiyor" );
        }
    }
}

