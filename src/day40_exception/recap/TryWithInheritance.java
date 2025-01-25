package day40_exception.recap;

public class TryWithInheritance {
    public static void main(String[] args) {
        try {
            int[] nums = {23, 43, 2, 6, 2};
            System.out.println(nums[9]);
        }catch (ArrayIndexOutOfBoundsException e){

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Child");
        } catch (Exception e) {
            System.out.println("Parent");//.ArrayIndexOutOfBoundsException
        }
        /**
         * Parent exception can not be before the child exception class
         * Because the Parent Exception class can catch whatever the Child could catch
         * So, child exception class will never be reached
         *
         *
         All possible references of ArrayIndexOutOfBoundsException

         ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
         IndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
         RuntimeException e = new ArrayIndexOutOfBoundsException();
         Exception e = new ArrayIndexOutOfBoundsException();
         Throwable e = new ArrayIndexOutOfBoundsException();
         */
    }
}
