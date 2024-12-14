package git27_wrapper_array;

public class GoogleSearch {
    public static void main(String[] args) {
        /*
        Google search
         toyota - 23000000000
         honda - 1234904343
         */

        String searchResultInfo = "About 558,000,000 results (0.29 seconds)";
        searchResultInfo=searchResultInfo.replace("(", "").replace(")","");
       String [] resultInArr = searchResultInfo.split(" ");
        searchResultInfo.split(" ");
        String time=resultInArr[resultInArr.length-2];
        System.out.println(time);

       double time1= Double.parseDouble(time);//---Convert String to double (primitive)
      // double time2 =Double.valueOf(time);  ---Convert String to double (wrapper class object)
        if (time1<0.5) {
            System.out.println("Pass");
        }else {
            System.out.println("False");
        }

        System.out.println(   time1<0.5? "Pass":"Fail"); //The same with a Ternary
    }
}
