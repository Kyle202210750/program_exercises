package stringrushed;

public class StringRushed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "thequickbrownfoxxofnworbquickthe";
        PalindromeResult result = findLongestPalindrome(input);
        
        System.out.println("The given string is: " + input);
        System.out.println("The longest palindrome substring in the given string is: " + result.palindrome);
        System.out.println("The length of the palindromic substring is: " + result.length);
        
        // Output:
        // The given string is: thequickbrownfoxxofnworbquickthe
        // The longest palindrome substring in the given string is: brownfoxxofnworb
        // The length of the palindromic substring is: 16
    }
    
    private static PalindromeResult findLongestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return new PalindromeResult("", 0);
        }

        int n = s.length();
        boolean[][] isPalindrome = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        int start = 0;
        int maxLength = 1;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int length = 3; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int j = i + length - 1;

                if (isPalindrome[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    isPalindrome[i][j] = true;
                    start = i;
                    maxLength = length;
                }
            }
        }

        String longestPalindrome = s.substring(start, start + maxLength);
        return new PalindromeResult(longestPalindrome, maxLength);
    }
    
    private static class PalindromeResult {
        String palindrome;
        int length;

        PalindromeResult(String palindrome, int length) {
            this.palindrome = palindrome;
            this.length = length;
        }
    }
}
