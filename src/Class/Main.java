package Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = input.nextLine();
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            char firstLetter = word.charAt(0);
            char lastLetter = word.charAt(word.length() - 1);
            if (isVowel(firstLetter) && isVowel(lastLetter)) {
                count++;
            }
        }
        System.out.println("Number of words starting and ending with vowels: " + count);
    }
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}