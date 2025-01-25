package day20_nested_loops;
/*
only once
AbCD$CSTGF(
------------->
AbD$STGF(
 */
public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "AbCD$CSTGF(";

        for (int i = 0; i < str.length(); i++) {
            char outterLetter = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char innerLetter = str.charAt(j);
                if (outterLetter==innerLetter) {
                    count++;
                }
            }
            if (count==1 ) {
                System.out.print(outterLetter);
            }
        }
    }

}
