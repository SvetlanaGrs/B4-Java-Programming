package day06_b_unary_operators;

public class ParkingLot {
    public static void main(String[] args) {

        int carsInParkingLot = 10;
        System.out.println("2 cars drove into parking lot");
        carsInParkingLot = carsInParkingLot + 2;
        System.out.println("Cars in parking lot: " +  carsInParkingLot);

        System.out.println(" 2 more cars drove into parking lot");
        carsInParkingLot++;
        carsInParkingLot++;
        //In this case it doesnt matter (post or pre) cause they are written as a SINGLE statement
        //++carsInParkingLot
        //++carsInParkingLot
        System.out.println("Cars in parking lot: " +  carsInParkingLot);

        System.out.println("5 cars left");
        carsInParkingLot = carsInParkingLot - 5;
        System.out.println("Cars in parking lot: " +  carsInParkingLot);

//        System.out.println("5 cars left"); We can do it like this way, but upper better
//        carsInParkingLot--;
//        carsInParkingLot--;
//        carsInParkingLot--;
//        carsInParkingLot--;
//        carsInParkingLot--;
//        --carsInParkingLot;
//        --carsInParkingLot;
//        --carsInParkingLot;
//        --carsInParkingLot;
//        --carsInParkingLot;

    }
}
