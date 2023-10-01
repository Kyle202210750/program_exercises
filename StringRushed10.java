public class StringRushed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "the quick brown fox";
        String str2 = "queen";
        System.out.println("Given String: " + str1);
        System.out.println("Given Mask String: " + str2);
        char[] mask = new char[256];
        for (int i = 0; i < str2.length(); i++) {
            mask[str2.charAt(i)]++;
        }
        System.out.println("\nNew string is: ");
        for (int i = 0; i < str1.length(); i++) {
            if (mask[str1.charAt(i)] == 0) {
                System.out.print(str1.charAt(i));
            }
        }
        
        // Ouput:
        // Given String: the quick brown fox
        // Given Mask String: queen

        // New string is: 
        // th ick brow fox
    }
}
