package day03_comments_escape_sequence;

public class TabAndNextLine {
    public static void main (String[] args) {
        // This is explaining the spaces
        System.out.println("A Sentence");      // has not space at the beginning
        System.out.println(" A Sentence");     // has 1 space
        System.out.println("  A Sentence");    // has 2 spaces
        System.out.println("   A Sentence");   // has 3 spaces
        System.out.println("    A Sentence");  // has 4 spaces

        //Now i will use tab to do 4 spaces at one----// \t equal 4 spaces

        System.out.println("\tA Sentence");

        //Lets put 2 tabs
        System.out.println("        A Sentence");
        System.out.println("\t\tA Sentence"); //equal to 8 spaces

        System.out.println();

        System.out.println("1) Unlock the car door");
        System.out.println("2) Get into the car door");
        System.out.println("3) Start the car door");

        System.out.println();
        System.out.println("1) Unlock the car door\n2) Get into the car door\n3) Start the car door");

        System.out.println();

        System.out.println("Week Days:\n    Monday\n    Tuesday\n\tWednesday\n\tThursday\n\tFriday\n\tSaturday\n\tSunday");


    }
}
