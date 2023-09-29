public class StringRushed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "PQR";
        
        System.out.println("Given string is: " + input);
        System.out.println("Permuted strings: ");
        printPermutationsWithRepetition(
                input.toCharArray(), 
                0, 
                input.length());
        
        // Output:
//        Given string: PQR
//        Permuted strings: 
//        PPP
//        PPQ
//        PPR
//        PQP
//        PQQ
//        PQR
//        PRP
//        PRQ
//        PRR
//        QPP
//        QPQ
//        QPR
//        QQP
//        QQQ
//        QQR
//        QRP
//        QRQ
//        QRR
//        RPP
//        RPQ
//        RPR
//        RQP
//        RQQ
//        RQR
//        RRP
//        RRQ
//        RRR
    }
  
    private static void printPermutationsWithRepetition(char[] chars, int currentIndex, int length) {
        if (currentIndex == length) {
            System.out.println(new String(chars));
            return;
        }
      
        for (char c = 'P'; c <= 'R'; c++) {
            chars[currentIndex] = c;
            printPermutationsWithRepetition(chars, currentIndex + 1, length);
        }
    }
}
