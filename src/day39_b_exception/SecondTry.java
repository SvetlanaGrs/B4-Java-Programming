package day39_b_exception;

public class SecondTry {
    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length()); //NullPointerException
            //} catch (Exception e){  // Can use it because it is a grandparent
            //}catch (RuntimeException e){// Can use it because it is a parent

            int [] arr = {1, 3, 5, 6 };
            //            0  1  2  3
            System.out.println(arr[8]); //.ArrayIndexOutOfBoundsException



        }catch (NullPointerException e){
            System.out.println("NullPointerException is caught");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException is caught" );
        }

        System.out.println("FinishLine");
    }
}
