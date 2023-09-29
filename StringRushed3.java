public class StringRushed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "Elysium Version 0.1.0";
        String str2 = "Elysium Version 0.1.0";
        String str3 = "Elysium Version 0.1.1";

        boolean comparison1 = str1.contentEquals(str2);
        boolean comparison2 = str1.contentEquals(str3);
        System.out.println("Is str1 can compared to str2: " + comparison1);
        System.out.println("Is str1 can compared to str3: " + comparison2);
        
        // Output:
        // Is str1 can compared to str2: true
        // Is str1 can compared to str3: false
    }
}
