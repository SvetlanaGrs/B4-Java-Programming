package day35_inheritance.book;

import my_utilities.StringUtil;

public class Author  {
   private String authorName;
   private int authorAge;
    String nationality;

    public Author(String authorName, int authorAge) {
       // this.authorName = authorName;
        setAuthorName(authorName);
       // this.authorAge = authorAge;
        setAuthorAge(authorAge);
    }

    //Make sure that age>0 and name is full name (always 2)


    public void setAuthorName(String authorName) {
//        int count=0;
//        for (int i = 0; i < authorName.length(); i++) {
//            if(authorName.charAt(i)==' '){
//                count++;
//            }
//        }
        String result="";

        if(authorName.split(" ").length==2) {
            for(String each:authorName.split(" ")) {
                result+= StringUtil.fixFormat(each)+ " ";
            }

            this.authorName = result.trim();
        }else {
            System.out.println("The author name is incorrect");
        }
    }

    public void setAuthorAge(int authorAge) {
        if(authorAge>0) {
            this.authorAge = authorAge;
        }else {
            System.out.println("Author Age must be greater than 0");
        }
    }

    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", authorAge=" + authorAge +
                '}';
    }
}
