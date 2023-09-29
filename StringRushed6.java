import java.text.SimpleDateFormat;
import java.util.Date;

public class StringRushed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");

        String formattedDate = dateFormat.format(currentDate);
        String formattedTime = timeFormat.format(currentDate);

        System.out.println("Current Date and Time:");
        System.out.println(formattedDate);
        System.out.println(formattedTime);
        
        // Output:
        // Current Date and Time:
        // September 29, 2023
        // 11:59 PM
    }
}
