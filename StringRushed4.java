public class StringRushed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] numbers = new char[] { '1', '4', '6', '8' };
        String strNum = new String(numbers);

        System.out.println("The presentation contains " + strNum + " slides.");
        
        // Output:
        // The presentation contains 1468 slides.
    }
}
