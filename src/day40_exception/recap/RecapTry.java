package day40_exception.recap;

import java.util.ArrayList;

public class RecapTry {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("javascript");

        String s = null;

        try{
           System.out.println(list.get(4));

            System.out.println(s.length());

        }catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bond");
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Null pointer");
            System.out.println(e.getMessage());
        }

        System.out.println(list);
        System.out.println("-----------------------------------------------------");

        try{
            System.out.println(list.get(4));

            System.out.println(s.length());

        }catch (RuntimeException e){
            System.out.println("Index out of bond OR Null pointer");
            System.out.println(e.getMessage());
        }

        System.out.println("--------------------------------------------------------");
        try{
            System.out.println(list.get(4));

            System.out.println(s.length());

        }catch (IndexOutOfBoundsException  | NullPointerException e ){
            System.out.println("Index out of bond OR Null pointer");
            System.out.println(e.getMessage());
        }


        System.out.println("Final line");
    }
}
