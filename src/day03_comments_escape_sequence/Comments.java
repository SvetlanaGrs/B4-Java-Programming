package day03_comments_escape_sequence;

public class Comments {
    public static void main (String[] args) {

        // 1 - SINGLE LINE COMMENT
        // The line below prtints a words "Loopcamp" and goes to next line
        System.out.println("Loopcamp");



        /*
        2- MULTILINE COMMENT
        The following code is a PRINTLN statement
        It prints out "Java"
        Then goes to the next line
         */
        System.out.println("Java");


        //Ctrl + / to comment or uncomment
//        System.out.prinntln("Comment out");
//        System.out.printnnln("Test");
//        System.out.printnln("Check");
//        System.out.printlnn("Code");

        System.out.println("Valid code");
        /**
         * JAVA DOC COMMENT
         * The following is Println statement
         * It prints out "1st week"
         * This is written by QA team member: Diana
         */
        System.out.println("1st week of Java");

        //TODO: I need to find how much i spend dor the computer
        System.out.println("I recently bought a computer for $....");

        /*
        TODO: Check how much i need to do deposit
         */
        System.out.println("Deposit $... to my account");

        //toDo: just reminder: not space sensitivity
        /**
         * ToDo: can be used with Java Doc Comment as well
         */
    }
}
