import java.util.Scanner;

public class StringRushed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input String: ");
        String inputString = input.next();
                
        System.out.println("Prompt String: " + inputString);

        char[] chars = inputString.toCharArray();
        System.out.println("Duplicate characters and counts are: ");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '\0') continue;
            int count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '\0';
                }
            }
            if (count > 1) System.out.println(chars[i] + " appears " + count + " times");
        }
        
        // Ouput:
        // Input String: lubidobido
        // Prompt String: lubidobido
        // Duplicate characters and counts are: 
        // b appears 2 times
        // i appears 2 times
        // d appears 2 times
        // o appears 2 times
    }
}
