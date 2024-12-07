package day24_methods;

public class Email {
    public static void main(String[] args) {
        String fullName ="Tom Jerry";
        String domain = "Gmail.com"; // .gmail.com
        buildEmail(fullName, domain); //calling buildEmail method and passing 2 arguments
        buildEmail("Micky Mouse", "outlook.com");
    }
    public static void buildEmail (String fullName, String domain) { //I declared custom method which accepts 2 parameters

        String result = (fullName.substring(0,1) + fullName.substring(fullName.indexOf(" ") + 1) + "@" + domain).toLowerCase();
        System.out.println(result);
    }
/*
 TODO:   Make sure that user gives to you full name with 2 words ,
         And domain contains @
         If does not - give message saying the reason why
 */
}
