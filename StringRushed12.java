import java.util.Scanner;

public class StringRushed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input String: ");
        
        String inputString = input.next();
        System.out.println("Prompt String: " + inputString);

        int sum = sumDigits(inputString);
        System.out.println("Sum of digits in String: " + sum);
        
        // Ouput:
        // Input String: wee223eleq24
        // Prompt String: wee223eleq24
        // Sum of digits in String: 13
    }
    
    private static int sumDigits(String input) {
        int sum = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
