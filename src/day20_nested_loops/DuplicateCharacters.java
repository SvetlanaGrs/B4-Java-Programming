package day20_nested_loops;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "apple";
        String unique ="";

        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            char outter = str.charAt(i);

            if(unique.contains(outter+"")) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {
                char inner = str.charAt(j);
                if (outter==inner) {
                    count++;
                }
            }
            if (count>1) {
                System.out.print(outter);
            }
            if(!unique.contains(outter+"")){
                unique+=outter;
            }
        }

    }
}
