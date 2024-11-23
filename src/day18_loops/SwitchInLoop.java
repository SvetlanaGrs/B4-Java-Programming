package day18_loops;

public class SwitchInLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            //OPTION 1
            if (i == 0) {
                System.out.println("Zero");
            } else if (i == 1) {
                System.out.println("One");
            } else if (i == 2) {
                System.out.println("Two");
            }else if (i == 3) {
                System.out.println("Three");
            }else if (i == 4) {
                System.out.println("Four");
            }else { // since the for loop is designed to be in the range of 0 to 5, and since the code covers anything from 0 to 4,  5 is the only left part. So Just ELSE is fine
                System.out.println("Five");
            }
        }
        //OPTION 2
        System.out.println();
        System.out.println("Option 2 : for loop with switch");
        for (int i = 0; i <= 5; i++) {
          switch (i) {
              case 0:
                  System.out.println("Zero");
                  break;
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
              default:
                  System.out.println("Five");
          }

        }
    }
}
