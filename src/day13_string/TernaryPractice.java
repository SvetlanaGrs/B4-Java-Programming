package day13_string;

public class TernaryPractice {
    public static void main(String[] args) {
        //If the number is less than 10 and bigger than or equal 0, then print "number" is single digit, else print number is multi digit"
        int num = 1;

        if (num<10 && num >=-9) {
            System.out.println( num + " Number is single digit");
        }else {
            System.out.println(num + " number is multi digit");
        }
        System.out.println("-------------------------");
        System.out.println((num<10 && num >=-9) ? "Number is single digit" : " number is multi digit" );
        System.out.println((num % 2 ==0)?(num <10 &&num >=-9) ? "Number is single digit" : " number is multi digit" : "TEST");

    }
}
