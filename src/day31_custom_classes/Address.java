package day31_custom_classes;

public class Address {
    String street;
    String city;
    String state;
    int  zipcode;



    //    public Address(String inputStreet, String inputCity, String inputState, int inputZipcode){
//
//        street=inputStreet;
//        city=inputCity;
//        state=inputState;
//        zipcode=inputZipcode;
//    }
        public Address(String street, String city, String state, int zipcode){
        this.street=street;
        this.city=city;
        this.state=state;
        this.zipcode=zipcode;


    }


    public String toString() {
        return "Address: " + street + ", " + city + ", "  + state + ", " + zipcode;
    }

}
class Runner {
    public static void main(String[] args) {
        Address obj = new Address("123 Test str", "Test", "VA", 222222);
        System.out.println(obj);

        obj.state="MD";
        System.out.println(obj);
    }
}
