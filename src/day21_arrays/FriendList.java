package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter how many friends you have: ");
        String [] friendlist = new String [ key.nextInt()]; //2 ---> [null,null]

        key.nextLine(); //just to handle enter issue
        for (int i = 0; i <friendlist.length ; i++) {
            System.out.print("Please enter the name " + (i+1) + " : " );
            friendlist[i] = key.nextLine();
        }
        //System.out.println(Arrays.toString(friendlist));

        System.out.println("My Friend List:");
        for (String each:friendlist) {
            System.out.println("\t" + each);
        }



    }
}
