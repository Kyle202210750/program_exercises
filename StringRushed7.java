public class StringRushed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str1 = "Introducing the new Elysium Version is now up!";
        String toReplace = "now";
        String replaceWith = "currently";
        
        String newStr = str1.replaceAll(toReplace, replaceWith);

        System.out.println("Old String: " + str1);
        System.out.println("New String: " + newStr);
        
        // Output:
        // Old String: Introducing the new Elysium Version is now up!
        // New String: Introducing the new Elysium Version is currently up!
    }
}
