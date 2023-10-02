import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class StringRushed {

    public static void main(String[] args) throws AWTException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your name: ");
        String name = scanner.next();
        navigateSypnosis(name);
        clear();
    }
    
    public static void navigateSypnosis(String name) throws AWTException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Sypnosis: \n"
                + "\n   Once upon a time in the quaint town of Eldoria, there lived a young adventurer named " + name + ".\n"
                + "Known for their courage and insatiable curiosity, " + name + " had explored every nook and cranny\n"
                + "of the town and its surrounding forests. One day, while wandering through the mystical Eldor\n"
                + "Forest, " + name + " stumbled upon an ancient portal hidden behind a cascade of ivy.\n" +
                "\n" +
                "   As " + name + " approached the mysterious gateway, a voice emanated from within, beckoning them to enter\n"
                + "and explore the realms beyond. Without hesitation, " + name + " stepped through the portal and found\n"
                + "themselves in a bustling city called Lumaria. The city was a melting pot of cultures, filled\n"
                + "with diverse characters and magical creatures.\n" +
                "\n" +
                "   Here, " + name + " encountered a charismatic rogue named Riven, who offered to guide them through the city's\n"
                + "labyrinthine streets. Riven had a reputation for being both cunning and charming, with a mysterious\n"
                + "past that seemed to unfold with every step they took. As " + name + " and Riven navigated Lumaria's enchanting\n"
                + "markets and secret alleys, they stumbled upon a peculiar bookstore run by a wise old sage named Elysia.\n" +
                "\n" +
                "   Elysia sensed the potential within " + name + " and Riven and revealed a prophecy that foretold the salvation\n"
                + "of Lumaria from an impending darkness. The prophecy spoke of three artifacts scattered across different\n"
                + "realms, each holding the power to unlock the city's ancient defenses.\n\n"
                + "Now, dear reader, you have a choice to make:\n\n"
                + "1. Choose a Name for the Third Companion: \n"
                + "     1.) Aria"
                + "     2.) Kai"
                + "     3.) I won't choose, I'm leaving!\n\n"
        );
        
        System.out.print("Input Option: ");
        int option = scanner.nextInt();
        clear();
        switch(option) {
            case 1 -> navigateChapter1(name);
            case 2 -> navigateChapter2(name);
            case 3 -> {
                System.out.println("\n> You left the place, while Aria & Kai following eye's on you.");
                System.out.println("*** Game Over ***");
                System.exit(0);
            }
        }
    }
    
    public static void navigateChapter1(String name) throws AWTException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Chapter 1: Aria's Enchantment\n\n"
            + "   With a smile, " + name + " and Riven welcomed Aria, a skilled sorceress with a penchant for unraveling\n"
            + "the mysteries of ancient artifacts. Together, the trio embarked on a journey to discover the first\n"
            + "artifact hidden deep within the Celestial Caverns.\n" +
            "\n" +
            "   As they ventured through the caverns, they encountered mythical creatures and solved riddles that\n"
            + "guarded the artifact. Aria's magical prowess proved invaluable, and her ability to communicate\n"
            + "with the mystical beings of the caverns led them to the first artifact—a radiant crystal\n"
            + "that shimmered with otherworldly energy.\n" +
            "\n" +
            "   However, their journey had just begun, and the voice from the portal echoed in their minds,\n"
            + "guiding them toward the next realm. As they prepared to leave the Celestial Caverns,\n"
            + "they faced another choice: \n\n"
            + "1. Choose your destination: \n"
            + "     1.) Explore Floating Isles\n"
            + "     2.) Delve onto Crystal Mines\n"
            + "     3.) Go back to last destination!\n"
            + "     4.) Go back, leave the place!\n\n"
        );
        
        System.out.print("Input Option: ");
        int option = scanner.nextInt();
        clear();
        switch(option) {
            case 1 -> {
                navigateChapter3(name);
            }
            case 2 -> {
                navigateChapter4(name);
            }
            case 3 -> navigateSypnosis(name);
            case 4 -> {
                System.out.println("\n> Ya'll turned back and leave the place.");
                System.out.println("*** Game Over ***");
                System.exit(0);
            }
        }
    }
    
    public static void navigateChapter2(String name) throws AWTException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Chapter 2: Kai's Resolve\n\n"
            + "   " + name + " and Riven welcomed Kai, a skilled warrior with a mysterious connection to Lumaria's ancient history.\n"
            + "With Kai's strength and agility, the trio set out to conquer the treacherous Crystal Mines\n"
            + "in search of the first artifact.\n" +
            "\n" 
            + "   In the depths of the mines, they faced perilous challenges and encountered creatures born of crystalline\n"
            + "magic. Kai's combat skills proved crucial in overcoming these obstacles, and after a fierce battle, they\n"
            + "uncovered the first artifact—a crystallized gauntlet pulsating with raw power.\n" +
            "\n" +
            "   The voice from the portal urged them to choose their next destination:\n\n"
            + "1. Choose your destination: \n"
            + "     1.) Explore Enchanted Grove\n"
            + "     2.) Brave The Shadow Peaks\n"
            + "     3.) Go back to last destination!\n"
            + "     4.) Go back, leave the place!\n\n"
        );
        
        System.out.print("Input Option: ");
        int option = scanner.nextInt();
        clear();
        switch(option) {
            case 1 -> navigateChapter5(name);
            case 2 -> navigateChapter6(name);
            case 3 -> navigateSypnosis(name);
            case 4 -> {
                System.out.println("\n> Ya'll turned back and leave the place.");
                System.out.println("*** Game Over ***");
                System.exit(0);
            }
        }
    }
    
    public static void navigateChapter3(String name) throws AWTException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Chapter 3: The Floating Isles' Secrets\n\n"
            + "   As the trio entered the Floating Isles, they marveled at the floating landscapes suspended in the sky.\n"
            + "Aria's magic helped them navigate the shifting islands, and they discovered that the\n"
            + "second artifact lay hidden within the Cloud Sanctum.\n" +
            "\n" +
            "   Facing gravity-defying challenges, they reached the Cloud Sanctum, where a puzzle awaited them. Aria's\n"
            + "knowledge of ancient glyphs and symbols proved essential, and they successfully unlocked\n"
            + "the second artifact a pair of ethereal wings that granted the power of flight.\n" +
            "\n" +
            "But their journey was far from over. The voice guided them to another choice:"
            + "1. Choose your destination: \n"
                + "     1.) Explore Forgotten Desert\n"
                + "     2.) Delve onto Moonlit Forest\n"
                + "     3.) Go back to last destination!\n"
                + "     4.) Go back, leave the place!\n\n"
        );
        
        System.out.print("Input Option: ");
        int option = scanner.nextInt();
        clear();
        switch(option) {
            case 1 -> {
                System.out.println("> Ya'll began to walk towards Forgotten Desert, Which secret's untold.");
                System.out.println("*** To be continued ***");
                System.exit(0);
            }
            case 2 -> {
                System.out.println("> Ya'll began walk towards Forgotten Desert, Which secret's untold.");
                System.out.println("*** To be continued ***");
            }
            case 3 -> navigateChapter1(name);
            case 4 -> {
                System.out.println("\n> Ya'll turned back and leave the place.");
                System.out.println("*** Game Over ***");
                System.exit(0);
            }
        }
    }
    
    public static void navigateChapter4(String name) throws AWTException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Chapter 4: The Depths of the Crystal Mines\n\n"
            + "   Navigating the Crystal Mines proved to be a daunting task, but Kai's resilience and Riven's cunning\n"
            + "guided them through the labyrinthine tunnels. Deep within the mines, they faced a guardian creature made\n"
            + "of living crystal, and with Kai's might and Riven's strategic mind, they defeated the guardian and\n"
            + "unearthed the first artifact—a crystalline key.\n" +
            "\n" +
            "The voice urged them to decide their next destination:"
            + "1. Choose your destination: \n"
                + "     1.) Explore Mystic Swamp\n"
                + "     2.) Venture onto Embered Peaks\n"
                + "     3.) Go back to last destination!\n"
                + "     4.) Go back, leave the place!\n\n"
        );
        
        System.out.print("Input Option: ");
        int option = scanner.nextInt();
        clear();
        switch(option) {
            case 1 -> {
                System.out.println("> Ya'll began to walk towards Mystic Swamp, Which secret's untold.");
                System.out.println("*** To be continued ***");
                System.exit(0);
            }
            case 2 -> {
                System.out.println("> Ya'll began walk towards Embered Peaks, Which secret's untold.");
                System.out.println("*** To be continued ***");
                System.exit(0);
            }
            case 3 -> navigateChapter1(name);
            case 4 -> {
                System.out.println("\n> Ya'll turned back and leave the place.");
                System.out.println("*** Game Over ***");
                System.exit(0);
            }
        }
    }
    
    public static void navigateChapter5(String name) throws AWTException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Chapter 5: The Enchanted Grove's Whispers\n" 
            + "   As the trio entered the Enchanted Grove, they were greeted by the soothing whispers of\n"
            + "ancient trees. Aria sensed a magical disturbance and led them to the heart of the grove,\n"
            + "where they discovered the second artifact—a sentient seed that held the power of nature itself.\n" +
            "\n" +
            "Their journey continued, and the voice directed them to another crossroad:\n\n"
            + "1. Choose your destination: \n"
                + "     1.) Explore Crystal Caves\n"
                + "     2.) Confront onto Elemental Wastes\n"
                + "     3.) Go back to last destination!\n"
                + "     4.) Go back, leave the place!\n\n"
        );
        
        System.out.print("Input Option: ");
        int option = scanner.nextInt();
        clear();
        switch(option) {
            case 1 -> {
                System.out.println("> Ya'll began to walk towards Crystal Caves, Which secret's untold.");
                System.out.println("*** To be continued ***");
                System.exit(0);
            }
            case 2 -> {
                System.out.println("> Ya'll began walk towards Elemental Wastes, Which secret's untold.");
                System.out.println("*** To be continued ***");
                System.exit(0);
            }
            case 3 -> navigateChapter2(name);
            case 4 -> {
                System.out.println("\n> Ya'll turned back and leave the place.");
                System.out.println("*** Game Over ***");
                System.exit(0);
            }
        }
    }
    
    public static void navigateChapter6(String name) throws AWTException {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
            "Chapter 6: The Shadowed Peaks' Secrets\n" +
            "   Scaling the treacherous Shadowed Peaks, the trio faced shadows that came to life and tested their\n"
            + "courage. Kai's combat skills and Riven's stealth proved invaluable as they reached the peak's summit,\n"
            + "where the second artifact a shadow-infused amulet awaited them.\n" +
            "\n" +
            "The voice guided them to a crucial decision:"
            + "1. Choose your destination: \n"
                + "     1.) Explore Eternal Frostlands\n"
                + "     2.) Find Celestial Archives\n"
                + "     3.) Go back to last destination!\n"
                + "     4.) Go back, leave the place!\n\n"
        );
        
        System.out.print("Input Option: ");
        int option = scanner.nextInt();
        clear();
        switch(option) {
            case 1 -> {
                System.out.println("> Ya'll began to walk towards Eternal Frostlands, Which secret's untold.");
                System.out.println("*** To be continued ***");
                System.exit(0);
            }
            case 2 -> {
                System.out.println("> Ya'll began walk towards Celestial Archives, Which secret's untold.");
                System.out.println("*** To be continued ***");
                System.exit(0);
            }
            case 3 -> navigateChapter2(name);
            case 4 -> {
                System.out.println("\n> Ya'll turned back and leave the place.");
                System.out.println("*** Game Over ***");
                System.exit(0);
            }
        }
    }
    
    public static void clear() throws AWTException {
        Robot rob = new Robot();
        try {
            rob.keyPress(KeyEvent.VK_CONTROL);
            rob.keyPress(KeyEvent.VK_L);
            rob.keyRelease(KeyEvent.VK_L);
            rob.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}
