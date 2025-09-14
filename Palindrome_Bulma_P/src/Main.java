import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //stack kullanarak palindrome kontrolü
        Stack<Character> stack = new Stack<Character>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime = scanner.nextLine();
        for (int i = 0; i < kelime.length(); i++) {
            Character character = kelime.charAt(i);
            stack.push(character);
        }

        String tersKelime = "";
        while (!stack.isEmpty()) {
            tersKelime += stack.pop();
        }
        if (tersKelime.equals(kelime)) {
            System.out.println("Girilen kelime palindrome'dur.");
        } else {
            System.out.println("Girilen kelime palindrome değildir.");
        }
//        for(int i=0;i<kelime.length()/2;i++){
//            stack.push(kelime.charAt(i));
//        }
//        if(isPalindrome(kelime,stack)){
//            System.out.println("Girilen kelime palindrome'dur.");
//        }else{
//            System.out.println("Girilen kelime palindrome değildir.");
    }
//
//    public static boolean isPalindrome(String cumle, Stack<Character> stack) {
//        for (int i = (cumle.length() / 2) + 1; i < cumle.length(); i++) {
//            if (stack.pop() != cumle.charAt(i)) {
//                return false;
//            } else {
//                return true;
//            }
//        }
//
//    }
}
