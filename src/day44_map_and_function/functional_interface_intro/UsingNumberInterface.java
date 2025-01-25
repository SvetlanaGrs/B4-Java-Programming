package day44_map_and_function.functional_interface_intro;

public class UsingNumberInterface {
    public static void main(String[] args) {

        //Lambda expression----> ()->{}
        NumberInterface evenOrOdd =(num) -> {
            if(num%2==0){
                System.out.println("This number is even");
            }else{
                System.out.println("This number is odd");
            }
        };

        evenOrOdd.apply(5);
        evenOrOdd.apply(10);
        System.out.println("-----------------");

        NumberInterface calculateCube = (num)->{
            System.out.println("Cube for "+ num + " is " + num*num*num);
        };
        //If we have one argument - we do NOT need to use ()   ---> (num) but without ()
        //If you have one statement inside {} (lambda expression body) - we do not need use {}

        calculateCube.apply(10);

        System.out.println("-----------------");
        A a = new A();
        a.apply(20);

        B b = new B();
        b.apply(4);
    }
}
