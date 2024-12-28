package day32_custom_classes;
//Template class - we set the instructions how the object of this class will behave
public class Phone {
    String name;
    String brand;
    int memory;
    double version;

    //Non=parametrized constructor
//    public Phone(){
//
//    }


    public Phone(String name,String brand, int memory,double version){
       this.name=name;
       this.brand=brand;
       this.memory=memory;
       this.version=version;

    }

    public Phone(String name){
        this.name=name;
    }

    public Phone(String name ,String brand, int memory){
        this.name=name;
        this.brand=brand;
        this.memory=memory;
    }

    public String toString() {

        String message = "Phone info: ";
        if(name!=null){
            message +="\n\tname: " + name;
        }else {
            message+="\n\tname: Info not available";
        }

//        String message = "Phone: " +
//                "\n\tname: " + (name!=null)  ? name: "Info not available" +
//                "\n\tbrand: " + brand  +
//                "\n\tmemory: " + memory +
//                "\n\tversion: " + version ;

        return message;

//        return "Phone: " +
//                "\n\tname: " + name  +
//                "\n\tbrand: " + brand  +
//                "\n\tmemory: " + memory +
//                "\n\tversion: " + version ;
    }


}
