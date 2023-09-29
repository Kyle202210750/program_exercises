public class StringRushed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "Elysium Version 0.1.0";
        String str2 = "Elysium Version 0.1.1";
        int result = str1.compareTo(str2);

        System.out.println("Given String 1: " + str1);
        System.out.println("Given String 2: " + str2);
        
        if (result < 0) {
            System.out.println("\"" + str1 + "\" is less than \"" + str2 + "\"");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" is greater than \"" + str2 + "\"");
        } else {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
        }
        
        // Output:
        // Given String 1: Elysium Version 0.1.0
        // Given String 2: Elysium Version 0.1.1
        // "Elysium Version 0.1.0" is less than "Elysium Version 0.1.1"
    }
}
