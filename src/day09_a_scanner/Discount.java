package day09_a_scanner;

public class Discount {
    public static void main(String[] args) {
        //boolean isWeekend, isTeacher, isOfficer, isFirefighter; -----> All variables the same datatype
        //boolean isWeekend = false, isTeacher = false, isOfficer = true, isFirefighter= false; -----> All variables the same datatype
        boolean isWeekend = false;
        boolean isTeacher = false;
        boolean isOfficer = true;
        boolean isFirefighter= false;


        //boolean isEligibleForDiscount = isWeekend && isTeacher || isOfficer || isFirefighter;
        //                                 false  && false || true  ||true
        //                                      false      || true || true
        //                                              true|| true
        boolean isEligibleForDiscount = isWeekend && (isTeacher || isOfficer || isFirefighter);
        //                                 false  && ( false    ||   true       ||   false)
        //                                 false  && (          true            ||   false)
        //                                 false  && (true)
        //                                      false

        //                                                  () IS PRIORITY
        System.out.println("Is eligible for discount: " + isEligibleForDiscount);
    }
}
