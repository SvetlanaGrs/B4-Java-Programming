package day16_loops;

public class Factorial {
    public static void main(String[] args) {
        //5! = 5*4*3*2*1
        int num = 5;
        int result=1;
        while (num>0){
           result = result * (num);  // res = 1*4   |result = 4*3   |result = 12*2
            num--;                   // num = 3     |num = 2

        }
        System.out.println(result);
    }
}
