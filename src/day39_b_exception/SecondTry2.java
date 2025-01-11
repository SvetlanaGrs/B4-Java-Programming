package day39_b_exception;

public class SecondTry2 {
    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length()); //NullPointerException
            //} catch (Exception e){  // Can use it because it is a grandparent
            //}catch (RuntimeException e){// Can use it because it is a parent

            int [] arr = {1, 3, 5, 6 };
            //            0  1  2  3
            System.out.println(arr[8]); //.ArrayIndexOutOfBoundsException



        }catch ( RuntimeException e){
            System.out.println("Either NullPointerException or ArrayIndexOutOfBoundsException is caught");
        }

        System.out.println("FinishLine");
    }
}
