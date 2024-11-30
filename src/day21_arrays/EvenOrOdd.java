package day21_arrays;
//even четные
//odd  нечетные
public class EvenOrOdd {
    public static void main(String[] args) {
        int [] nums = {4, 1, 3, 12, 5};
        int countEven = 0;
        int countOdd = 0;
        String evenNums = "";
        String oddNums = "";

        for (int each :nums) {

            if (each%2==0) {
                countEven++;
                evenNums+=each + " ";
            }else {
                countOdd++;
                oddNums+= each + " ";
            }

        }
        System.out.println("Even: " + countEven);
        System.out.println("Even numbers: " + evenNums);
        System.out.println("Odd: " + countOdd);
        System.out.println("Odd numbers: " + oddNums);
    }
}
