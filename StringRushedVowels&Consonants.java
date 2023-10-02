package stringrushed;

import java.util.Scanner;

public class StringRushed {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] result = countVowelsConsonants(input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
        
        // Ouput:
        // Enter a string: abcdefghi
        // Vowels: 3
        // Consonants: 6
    }
    
    private static int[] countVowelsConsonants(String str) {
        str = str.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        int[] result = {vowels, consonants};
        return result;
    }
}
