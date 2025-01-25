package day23_multidimensional_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        //int [] n = new int[4];

        String [] [] groups1 = new String [4][]; //will hold 4 single dim. array
        //{{}, {}, {}, {}}
        String [] [] groups2 = new String [4][3]; //will hold 4 single dim. array and each will have 3 elements
        //{{ , , }, { , , },{ , , },{ , , }}

        System.out.println(Arrays.deepToString(groups1));
        System.out.println(Arrays.deepToString(groups2));

        System.out.println("------------------------------");

        String [] group1 = {"Artem", "Diana", "Yuliia", "Roma"};
        String [] group2 = {"Pavlo", "Steven", "Ketevan"};

        String [][] mentorGroups = {group1, group2};

        System.out.println(Arrays.deepToString(mentorGroups));
        System.out.println(Arrays.toString(mentorGroups[0]));
        System.out.println(Arrays.toString(mentorGroups[1]));

        System.out.println();
        for (String [] eachArr : mentorGroups) {
            System.out.println(Arrays.toString(eachArr));

        }
        System.out.println("------------------------------");
        //every single name
        for (String [] eachArr : mentorGroups) {
            for (String eachName :eachArr) {
                System.out.println(eachName);
            }
        }


    }
}
