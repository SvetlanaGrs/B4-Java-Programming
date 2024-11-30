package day21_arrays;

public class Initialize {
    public static void main(String[] args) {
        String [] classmates = {"James Bond", "Eve Rell", "Anna Johnson"};
        System.out.println("I have " + classmates.length + " full names");

        //Foreach
        for (String eachFullName :classmates) {
           eachFullName= eachFullName.trim();
           // System.out.println(eachFullName);  //James Bond
            String firstName = eachFullName.substring(0, eachFullName.indexOf(" ")).toUpperCase();
            String lastName= eachFullName.substring(eachFullName.indexOf(" ") + 1).toUpperCase();

            System.out.println("" + firstName.charAt(0) + lastName.charAt(0));

        }

        /*
            TODO: Home Practice:
                Implement the same code with the use of FORI loop.
         */



    }
}
