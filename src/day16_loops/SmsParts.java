package day16_loops;

public class SmsParts {
    public static void main(String[] args) {
        String message = "Sender: <James>. From number : [202-3345-2239]. + Message: {I love}";
        //P1
          //substring (index1.index2)
            //<James Bond>
                //index1 ---- message.index
        String part1 = message.substring(message.indexOf("<") + 1,message.indexOf(">"));
        String part2 = message.substring(message.indexOf("[") + 1,message.indexOf("]"));
        String part3 = message.substring(message.indexOf("{") + 1,message.indexOf("}"));

        System.out.println(part1);
        System.out.println(part2);
        System.out.println(part3);
    }
}
