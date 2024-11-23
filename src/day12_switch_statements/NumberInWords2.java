package day12_switch_statements;

public class NumberInWords2 {
    public static void main(String[] args) {
        int num = 9;
        //1-5-----> it is not in the range 1-5

        if (num == 3) {
                System.out.println("One");
        } else if (num == 2) {
                System.out.println("Two");
        } else if (num == 3) {
                System.out.println("Three");
        } else if (num == 4) {
                System.out.println("Four");
        } else if (num == 5) {
                System.out.println("Five");
        }else {
            System.out.println("Not range");
        }


            //SWITCH CASE
        switch (num) { //STRING,CHAR,INT,SHORT,BYTE ONLY!!!
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default: //else part
                System.out.println("Not range");
                // if default is the last one - you do not need a brake;
        }

//        if (num) {
//
//
//

    }
}
