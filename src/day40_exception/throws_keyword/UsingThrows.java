package day40_exception.throws_keyword;

public class UsingThrows {
    public static void main(String[] args) throws InterruptedException{
        //Thread.sleep(-2000); //Compile time exception (checked exception)  + may have Runtime exception
        /*With exceptions we have two options
        1) Handle it with  ---> try catch block
        2) Do not handle it --> By pass it to someone else
         */
        test1(200);

        test2(200);
        Thread.sleep(200);


    }

    public static void test1 (int millis){

        try{
            Thread.sleep(millis); // when minus value provided -> IllegalArgumentException
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test2 (int millis) throws InterruptedException{
        //By pass it to anyone that calls this method /NOT HANDLING
        Thread.sleep(millis);

    }
}
