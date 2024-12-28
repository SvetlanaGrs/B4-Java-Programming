package day33_a_static;

import java.util.Arrays;
import static day33_a_static.LoopcampStudent.*;
public class School {
    public static void main(String[] args) {
        LoopcampStudent student1 = new LoopcampStudent("Svetlana", "Group 1", "Iryna");
        System.out.println(student1);

        //can you give me all the teachers name
        for (String each :LoopcampStudent.teachers){
            System.out.println(each);
        }

        System.out.println();
        LoopcampStudent.printStaticInfo();

        System.out.println();
        // Since we did static import, we are able to call the static members without Class name
        printStaticInfo();
    }



}
