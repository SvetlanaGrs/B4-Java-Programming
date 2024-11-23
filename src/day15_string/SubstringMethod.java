package day15_string;

public class SubstringMethod {
    public static void main(String[] args) {
        String word= "Saturday";
        //            01234567
        System.out.println( word.substring(0)  );// Give me the portion starting from index 0 to the end --->Saturday
        System.out.println( word.substring(1)  );// Give me the portion starting from index 0 to the end --->aturday
        System.out.println( word.substring(2)  );// Give me the portion starting from index 0 to the end --->turday
        System.out.println( word.substring(3)  );// Give me the portion starting from index 0 to the end --->urday
        System.out.println( word.substring(4)  );// Give me the portion starting from index 0 to the end --->rday

        System.out.println("Sat" + word.substring(3)); // "Sat" + "urday"---> "Saturday"
        System.out.println( word.substring(0,3)); //Sat---> no include the second index

        System.out.println("------------------");
        System.out.println(word.substring(5,8)); //day---> 5 is inclusive, 8 is not inclusive -- stop before 8
        //System.out.println(word.substring(5,9)); //error---> 9 out of bounds for length 8
        System.out.println(word.substring(5));//automatically to the end
    }
}
