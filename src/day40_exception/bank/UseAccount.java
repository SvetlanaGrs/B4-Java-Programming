package day40_exception.bank;

public class UseAccount {
    public static void main(String[] args) {

        Account account1 = new Account(100_000.00);
        try{
            account1.withdraw(150_000.00);
            System.out.println(account1.balance);

            System.out.println();
            account1.withdraw(10_000);
            System.out.println(account1.balance);
        }catch (NotEnoughBalanceException e){
            System.out.println(e.getMessage());
        }


        System.out.println();


        //2 options
        //1 - handle
        //2 - By pass (in main method signature)
        try{
            account1.login("loopcamp", "Pass");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Final line");

    }
}
