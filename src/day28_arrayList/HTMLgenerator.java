package day28_arrayList;

public class HTMLgenerator {
    public static void main(String[] args) {
        String str = "li^3";
        System.out.println(htmlGenerator(str));
        System.out.println(htmlGenerator("div^7"));
        System.out.println(htmlGenerator("span^2"));
    }

    public static String htmlGenerator (String str){
        String result = "";

        String [] arr1 = str.replace("^", " ").split(" ");

        int repeatNum = Integer.parseInt(arr1[1]);

        for (int i = 0; i < repeatNum; i++) {
            result+="<" + arr1[0] + "></"+ arr1[0] + ">";
        }

        return result;
    }
}
