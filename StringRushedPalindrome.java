import java.util.Scanner;

public class StringRushed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();
        
        if (checkPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
        
        // Ouput:
        // Enter a string: game
        // game is not a palindrome.
    }
    
    private static boolean checkPalindrome(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
