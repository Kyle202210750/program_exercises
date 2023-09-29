public class StringRushed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "Elysium Version 0.1.0";
        String str2 = "Elysium Version 0.1.1";
        String str3 = "elysium version 0.1.0";

        boolean isIgnored1 = str1.equalsIgnoreCase(str2);
        boolean isIgnored2 = str1.equalsIgnoreCase(str3);
        
        System.out.println("Does str1 ignored case str2: " + isIgnored1);
        System.out.println("Does str1 ignored case str3: " + isIgnored2);
        
        // Output:
        // Does str1 ignored case str2: false
        // Does str1 ignored case str3: true
    }
}
